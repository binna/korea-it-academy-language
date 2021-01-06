import warnings
warnings.filterwarnings('ignore')
import requests

# 시도 코드 크롤링
targetSite = 'https://www.starbucks.co.kr/store/getSidoList.do'  # 타겟 사이트, 요청 경로
# Request URL(https://www.starbucks.co.kr/store/getSidoList.do)을 요청하는 Request Method 가 POST 방식이므로
# requests 모듈의 post() 메소드로 서버에 정보를 요청한다.
request = requests.post(targetSite)
#print(request)         # 출력 : <Response [200]> => 요청 성공

# json() 메소드로 서버에 요청해서 응답받은 json 타입으로 구성된 문자열을 파이썬에서 처리하기 위해서 딕셔너리로 변환한다.
sidoList = request.json()
#print(type(sidoList))              # 출력 : <class 'dict'>
#print(len(sidoList))               # 출력 : 1
#print(sidoList)                    # json 타입의 데이터가 변환된 딕셔너리가 출력된다.

#print(type(sidoList['list']))      # 출력 : <class 'list'>
#print(len(sidoList['list']))       # 출력 : 17
#print(sidoList['list'])            # json이 변환된 딕셔너리의 'list'라는 key에 할당된 value인 딕셔너리 17개가 출력된다.

#print(type(sidoList['list'][0]))   # <class 'dict'>
#print(sidoList['list'][0])

# 시도 코드의 개수 만큼 반복하며 시도 코드('sido_cd')를 key 로 하고 시도 이름('sido_nm') value 로 하는 딕셔너리를 만든다.
sido_List = {}                      # 시도 코드와 코드에 해당되는 시도 이름을 저장할 빈 딕셔너리를 선언한다.
for sido in sidoList['list']:
    #print('{} : {}'.format(sido['sido_cd'], sido['sido_nm']))
    # sido_List 딕셔너리에 시도 코드를 key 로 하고 시도 이름을 value 로 해서 저장시킨다.
    sido_List[sido['sido_cd']] = sido['sido_nm']
#print(sido_List)

# 구군 코드 크롤링
# 크롤링할 시도 코드를 입력받는다
#sido_cd = input('구군 코드를 검색할 시도 코드를 입력하세요 : ')
sido_cd = '01'

targetSite = 'https://www.starbucks.co.kr/store/getGugunList.do'
# 시도 코드는 서버에 요청할 때 전체 시도 코드를 가져오면 되기 때문에 별도의 데이터를 넘겨주지 않았지만
# 시도에 따른 구군 코드를 서버에 요청할 때는 얻어올 시도 코드를 서버에 넘겨서 시도 코드에 해당하는 데이터만 받아야 한다.
# post() 메소드의 2번째 인수로 data 속성을 지정해서 서버로 넘길 데이터를 딕셔너리 형태로 지정한다.
# => key 는 반드시 Form Data 에 적혀있는 이름을 사용해야 한다.
request = requests.post(targetSite, data = {
    'sido_cd' : sido_cd
})

gugunList = request.json()
#print(type(gugunList))
#print(len(gugunList))
#print(gugunList)

#print(type(gugunList['list']))
#print(len(gugunList['list']))
#print(gugunList['list'])

#print(type(gugunList['list'][0]))
#print(gugunList['list'][0])

# 구군 코드의 개수 만큼 반복하며 구군 코드('gugun_cd')를 key 로 하고 구군 이름('gugun_nm') value 로 하는 딕셔너리를 만든다.
gugun_List = {}
for gugun in gugunList['list']:
    gugun_List[gugun['gugun_cd']] = gugun['gugun_nm']
print(gugun_List)

# 구군별 매장 정보 크롤링
#gugun_cd = input('매장 정보를 확인 후 구군 코드를 입력하세요 : ')

targetSite = 'https://www.starbucks.co.kr/store/getStore.do?r=7Y88QYF270'
request = requests.post(targetSite, data = {
    'p_sido_cd': '',                    # 시도 코드
    'p_gugun_cd': '0101',               # 구군 코드
    'ins_lat': '37.5108295',            # 위도
    'ins_lng': '127.02928809999999',    # 경도
    'in_biz_cd': '',
    'iend': 2000,                       # 서버에서 넘어오는 매장의 최대 개수
    'set_date': ''
    # 'in_biz_cd', 'set_date'를 넘겨주지 않으면 서버에서 데이터를 얻어오지 못한다.
})

store_list = request.json()
#print(len(store_list['list']))

count = 0
dt = 0
for store in store_list['list']:
    count += 1
    print('{0:4d}. {1} : {2}({3}, {4})'.format(count, store['s_name'], store['doro_address'], store['lat'], store['lot']))
    if store['s_name'].find('DT') >= 0:
        dt += 1
print('DT 개수 : {}'.format(dt))
