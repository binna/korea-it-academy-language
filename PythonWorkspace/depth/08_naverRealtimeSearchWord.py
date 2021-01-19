import warnings
warnings.filterwarnings('ignore')
import requests
from bs4 import BeautifulSoup
header = {'User-agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko'}

targetSite = "https://www.naver.com/"
request = requests.get(targetSite, headers=header)
#print(request)
html = request.text
soup = BeautifulSoup(html, 'html.parser')
#print(soup)


# 네이버 실시간 급상승 검색어 크롤링
# 2020년 3월쯤 네이버 실시간 검색어를 크롤링하는 방법이 변경되었다.
# 실시간 검색어가 웹 페이지에 포함되어 있지 않고 AJAX를 이용해 받아오는 방식으로 변경되었다.
# requests 모듈의 get() 메소드를 사용해서 실시간 검색어 json 형태로 받아온다.
targetSite = 'https://apis.naver.com/mobile_main/srchrank/srchrank?frm=main&ag=all&gr=1&ma=-2&si=0&en=0&sp=0'
request = requests.get(targetSite, headers=header)
#print(request)
word = request.text
#print(type(word))
#print(word)


# json 타입의 실시간 검색어를 딕셔너리로 변환하기 위해 json 모듈을 import 한다.
import json

# json 모듈에 loads() 메소드를 사용해서 json 형태로 데이터(문자열)를 딕셔너리로 변환한다.
searchWords = json.loads(word)
#print(type(searchWords))

# 딕셔너리에서 실시간 검색어만 얻어온다.
ranks = searchWords['data']
#print(type(ranks))
print(ranks)

# 실시간 검색어가 저장된 리스트에는 순위별로 각각 딕셔너리 타입으로 검색어가 저장되어 있다.
for rank in ranks:
    print('{0:2d}위 => {1} {2}'.format(rank['rank'], rank['keyword'],\
                                      rank['keyword_synonyms'] if len(rank['keyword_synonyms']) != 0 else ''))
