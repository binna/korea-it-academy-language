import warnings
warnings.filterwarnings('ignore')
import requests
from bs4 import BeautifulSoup
from datetime import datetime as dt

targetSite = 'https://www.melon.com/chart/index.htm'
#request = requests.get(targetSite)
#print(requet)          # 출력 : <Response [406]> - 크롤링 못하는 사이트, 406(허용되지 않음): 요청한 페이지가 요청한 콘텐츠 특성으로 응답할 수 없다.
                        # HTTP 상태 코드 자료 : https://ko.wikipedia.org/wiki/HTTP_%EC%83%81%ED%83%9C_%EC%BD%94%EB%93%9C

# 헤더 정보 문제로 웹 사이트의 데이터를 읽어오지 못할 경우 아래와 같이 헤더 정보를 설정한 후 읽는다
header = {'User-agent' : 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko'}
request = requests.get(targetSite, headers = header)
#print(request)         # 출력 : <Response [200]>
html = request.text
soup = BeautifulSoup(html, 'html.parser')

# 노래 제목 크롤링
titles = soup.findAll('div', {'class': 'ellipsis rank01'})
#print(titles)
#print(len(titles))
#for title in titles:
#    print(title.text.strip().split('\n')[0])

# 아티스트 크롤링
artists = soup.findAll('span', {'class': 'checkEllipsis'})
#print(artists)
#print(len(artists))
#for artist in artists:
#    print(artist.text.strip().split('\n')[0])

file = open('melonTOP100.txt', 'w', -1, 'UTF-8')
file.write('{} 현재 Melon 뮤직 실시간 TOP 100\n'.format(dt.now()))
for i in range(len(titles)):
    artist = artists[i].text.strip().split('\n')[0]
    title = titles[i].text.strip().split('\n')[0]
    data = '{0:3d}위 {1} - {2}'.format(i + 1, artist, title)
    file.write(data + '\n')
file.close()
print('melonTOP100.txt 파일로 쓰기 완료')

# with 구문을 사용해서 파일을 open하면 with 내부의 내용이 모두 실행되고 난 후 자동으로 파일을 close 시킨다.
with open('melonTOP100.txt', 'w', -1, 'UTF-8') as file:
    file.write('{} 현재 Melon 뮤직 실시간 TOP 100\n'.format(dt.now()))
    for i in range(len(titles)):
        artist = artists[i].text.strip().split('\n')[0]
        title = titles[i].text.strip().split('\n')[0]
        data = '{0:3d}위 {1} - {2}'.format(i + 1, artist, title)
        file.write(data + '\n')
print('melonTOP100.txt 파일로 쓰기 완료')

# 택스트 파일에 저장된 데이터를 읽어서 화면에 출력한다.
try:
    file = open('melonTOP100.txt', 'r', -1, 'UTF-8')
    lines = file.readlines()
    for line in lines:
        print(line, end='')
except:
    print('디스크에 데이터 파일이 없습니다.')
