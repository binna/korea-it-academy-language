# 경고 메시지를 표시하지 않으려면 아래의 2줄을 실행하면 된다.
import warnings
warnings.filterwarnings('ignore')   # 다시 경고 메시지를 보고 싶다면 warnings.filterwarnings('default')

import requests     # 타겟 사이트에 접속해서 정보를 요청하고 서버가 응답하면 얻어온다.
import folium       # 지도를 표시하고 지도에 마커를 찍어준다.
import json         # 텍스트로된 json 형태의 데이터를 파이썬 딕셔너리 형태로로 변환한다.
# pandas : 파이썬 데이터 처리 라이브러리
from pandas.io.json import json_normalize   # 파이썬 딕셔너리 형태의 데이터를 판다스 데이터프레임 형태로 변환한다.


# 전국 또는 특정 지역의 스타벅스 매장 위치를 찾아서 지도 위에 표시하기
# 1. requests 로 스타벅스 매장 위치 데이터를 가져와서 딕셔너리 타입으로 변환한다.
# 2. json_normalize() 메소드로 json 타입의 데이터가 변환된 딕셔너리를 판다스 데이터프레임으로 변환한다.
# 3. folium 모듈을 사용해서 지도를 표시하고 지도 위에 마커를 표시한다.

# 서울 스타벅스 전 지점
targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data={
    'p_sido_cd': '01',
    'p_gugun_cd': '',
    'ins_lat': '37.5108295',
    'ins_lng': '127.02928809999999',
    'in_biz_cd': '',
    'iend': 2000,
    'set_date': ''
})
#print(type(request))       # 출력 : <class 'requests.models.Response'>
#print(type(request.text))  # 출력 : <class 'str'>
#print(request.text)

# json 모듈의 loads() 메소드로 스타벅스 매장 위치 정보가 저장된 json 타입의 문자열 데이터를
# 파이썬에서 처리하기 위해서 딕셔너리 타입으로 변환한다.
star_json = json.loads(request.text)
#print(type(star_json))      # 출력 : <class 'dict'>
#print(star_json)

# pandas.io.json 모듈의 json_normalize() 메소드로 json 타입의 데이터가 변환된 딕셔너리 판다스 데이터프레임으로 변환한다.
star_df = json_normalize(star_json, 'list')
#print(type(star_df))       # 출력 : <class 'pandas.core.frame.DataFrame'>
#print(len(star_df))        # 출력 : 531, 데이터프레임을 구성하는 행의 개수 => 서울에는 1월 8일 현재 531개의 매장이 있다.
#print(star_df.columns)     # 데이터프레임을 구성하는 열의 개수 => folium 작업에 필요한 column만 추출해서 사용한다.

# 작업에 필요한 컬럼 몇 가지를 선택하여 지도에 마커를 표시할 때 사용할 데이터가 저장된 데이터프레임을 만든다.
# 's_name'          => 지점 이름
# 'sido_code'       => 시도 코드
# 'sido_name'       => 시도 이름
# 'gugun_code'      => 구군 코드
# 'gugun_name'      => 구군 이름
# 'doro_address'    => 도로명 주소
# 'lat'             => 위도
# 'lot'             => 경도

# 판다스 데이터프레임에서 특정 컬럼의 데이터를 얻어올때, 얻어올 컬럼이 1개라면 컬럼 이름만 적어주면 되지만
# 컬럼이 2개 이상일 경우 컬럼 이름을 리스트 타입으로 만들어서 얻어와야 한다.
#print(star_df)
#print(star_df['s_name'])
#print(star_df['s_name', 'sido_code'])  # 에러 : The above exception was the direct cause of the following exception
star_df_map = star_df[['s_name', 'sido_code', 'sido_name', 'gugun_code', 'gugun_name', 'doro_address', 'lat', 'lot']]
#print(star_df_map)

# dtypes 을 이용해 판다스 데이터프레임을 구성하는 칼럼들의 자료형을 확인할 수 있다.
# 판다스는 문자열의 데이터 타입을 object 라 한다.
#print(star_df_map.dtypes)

# info() 메소드를 사용해도 판다스 데이터프레임을 구성하는 칼럼들의 자료형을 확인할 수 있다.
#star_df_map.info()

# astype() 메소드로 위도, 경도 데이터 타입을 object 에서 float 로 변환한다.
star_df_map['lat'] = star_df_map['lat'].astype(float)
star_df_map['lot'] = star_df_map['lot'].astype(float)
#print(star_df_map.dtypes)

# 종각점
#print(star_df_map[star_df_map['s_name'] == '종각'])

# 광교점
#print(star_df_map[star_df_map['s_name'] == '광교'])

# 테헤란로아남타워
#print(star_df_map[star_df_map['s_name'] == '테헤란로아남타워'])

# folium 의 Map() 메소드로 location 속성으로 지정한 위치를 중심으로 하는 zoom_start 만큼의 배율을 사용하는 지도를 만든다.
#star_map = folium.Map(location=[37.5698029, 126.981528], zoom_start=20)
# folium 의 Marker() 메소드로 location 속성으로 지정한 위치에 마커를 만들어 add_to() 메소드로 지도에 추가한다.
# Marker() 메소드의 popup 속성으로 마커를 클릭했을때 표시할 팝업 메시지를 만들 수 있다.
# folium 의 Popup() 메소드의 max_width 속성으로 popup 메시지가 표시되는 팝업창의 크기를 지정할 수 있다.
#popup = folium.Popup('종각점', max_width=600)
#folium.Marker(location=[37.569918, 126.984528], popup=popup).add_to(star_map)
#popup = folium.Popup('광교점', max_width=600)
#folium.Marker(location=[37.568928, 126.984216], popup=popup).add_to(star_map)

# save() 메소드로 folium 을 사용해 만든 지도를 HTML 파일로 저장할 수 있다.
#star_map.save('starbucks.html')


# 서울특별시에 위치한 스타벅스 전 지점을 지도 위에 표시한다.
# 지도를 작성할 때 지도를 중심으로 설정할 특정 위치가 애매할 경우 지도 위에 표시할 모든 스타벅스 지점의 위도와 경도의 평균을
# 지도의 중심으로 하는 지도를 만들어 사용하면 된다.
# 판다스 데이터프레임에 저장된 데이터의 평균은 mean() 메소드를 사용해서 계산한다.
star_map = folium.Map(location=[star_df_map['lat'].mean(), star_df_map['lot'].mean()], zoom_start=12)
# iterrows() 메소드는 판다스 데이터프레임에 저장된 데이터의 인덱스와 데이터를 리턴한다.
for index, star in star_df_map.iterrows():
    #print(index, star['s_name'], star['lat'], star['lot'])
    popup = folium.Popup(star['s_name'] + '점, 주소 : ' + star['doro_address'], max_width=1000)
    folium.Marker(location=[star['lat'], star['lot']], popup=popup).add_to(star_map)
star_map.save('starbucks_seoul.html')

# 강남구 스타벅스 전 지점
targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data={
    'p_sido_cd': '',
    'p_gugun_cd': '0101',
    'ins_lat': '37.5108295',
    'ins_lng': '127.02928809999999',
    'in_biz_cd': '',
    'iend': 2000,
    'set_date': ''
})
star_json = json.loads(request.text)
star_df = json_normalize(star_json, 'list')
star_df_map = star_df[['s_name', 'sido_code', 'sido_name', 'gugun_code', 'gugun_name', 'doro_address', 'lat', 'lot']]
star_df_map['lat'] = star_df_map['lat'].astype(float)
star_df_map['lot'] = star_df_map['lot'].astype(float)

star_map = folium.Map(location=[star_df_map['lat'].mean(), star_df_map['lot'].mean()], zoom_start=14)
for index, star in star_df_map.iterrows():
    popup = folium.Popup(star['s_name'] + '점, 주소 : ' + star['doro_address'], max_width=1000)
    folium.Marker(location=[star['lat'], star['lot']], popup=popup).add_to(star_map)
star_map.save('starbucks_gangnam.html')

# 경기도 스타벅스 전 지점
targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data={
    'p_sido_cd': '08',
    'p_gugun_cd': '',
    'ins_lat': '37.5108295',
    'ins_lng': '127.02928809999999',
    'in_biz_cd': '',
    'iend': 2000,
    'set_date': ''
})
star_json = json.loads(request.text)
star_df = json_normalize(star_json, 'list')
star_df_map = star_df[['s_name', 'sido_code', 'sido_name', 'gugun_code', 'gugun_name', 'doro_address', 'lat', 'lot']]
star_df_map['lat'] = star_df_map['lat'].astype(float)
star_df_map['lot'] = star_df_map['lot'].astype(float)

star_map = folium.Map(location=[star_df_map['lat'].mean(), star_df_map['lot'].mean()], zoom_start=10)
for index, star in star_df_map.iterrows():
    popup = folium.Popup(star['s_name'] + '점, 주소 : ' + star['doro_address'], max_width=1000)
    folium.Marker(location=[star['lat'], star['lot']], popup=popup).add_to(star_map)
star_map.save('starbucks_gyeonggido.html')

# 제주도 스타벅스 전 지점
targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data={
    'p_sido_cd': '16',
    'p_gugun_cd': '',
    'ins_lat': '37.5108295',
    'ins_lng': '127.02928809999999',
    'in_biz_cd': '',
    'iend': 2000,
    'set_date': ''
})
star_json = json.loads(request.text)
star_df = json_normalize(star_json, 'list')
star_df_map = star_df[['s_name', 'sido_code', 'sido_name', 'gugun_code', 'gugun_name', 'doro_address', 'lat', 'lot']]
star_df_map['lat'] = star_df_map['lat'].astype(float)
star_df_map['lot'] = star_df_map['lot'].astype(float)

star_map = folium.Map(location=[star_df_map['lat'].mean(), star_df_map['lot'].mean()], zoom_start=11)
for index, star in star_df_map.iterrows():
    popup = folium.Popup(star['s_name'] + '점, 주소 : ' + star['doro_address'], max_width=1000)
    folium.Marker(location=[star['lat'], star['lot']], popup=popup).add_to(star_map)
star_map.save('starbucks_jejudo.html')

# 전국 스타벅스 전 지점
targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data={
    'p_sido_cd': '',
    'p_gugun_cd': '',
    'ins_lat': '37.5108295',
    'ins_lng': '127.02928809999999',
    'in_biz_cd': '',
    'iend': 2000,
    'set_date': ''
})
star_json = json.loads(request.text)
star_df = json_normalize(star_json, 'list')
star_df_map = star_df[['s_name', 'sido_code', 'sido_name', 'gugun_code', 'gugun_name', 'doro_address', 'lat', 'lot']]
star_df_map['lat'] = star_df_map['lat'].astype(float)
star_df_map['lot'] = star_df_map['lot'].astype(float)

star_map = folium.Map(location=[star_df_map['lat'].mean(), star_df_map['lot'].mean()], zoom_start=7)
for index, star in star_df_map.iterrows():
    popup = folium.Popup(star['s_name'] + '점, 주소 : ' + star['doro_address'], max_width=1000)
    folium.Marker(location=[star['lat'], star['lot']], popup=popup).add_to(star_map)
star_map.save('starbucks.html')
