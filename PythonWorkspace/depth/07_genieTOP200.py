import warnings
warnings.filterwarnings('ignore')
import requests
from bs4 import BeautifulSoup
from datetime import  datetime as dt
import time
header = {'User-agent' : 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko'}

# 타겟 사이트 주소 만들기
# https://www.genie.co.kr/chart/top200?ditc=D&ymd=20201216&hh=21&rtm=Y&pg=1 => 1 ~ 50
# https://www.genie.co.kr/chart/top200?ditc=D&ymd=20201216&hh=21&rtm=Y&pg=2 => 51 ~ 100
# https://www.genie.co.kr/chart/top200?ditc=D&ymd=20201216&hh=21&rtm=Y&pg=3 => 101 ~ 150
# https://www.genie.co.kr/chart/top200?ditc=D&ymd=20201216&hh=21&rtm=Y&pg=4 => 151 ~ 200

url = 'https://www.genie.co.kr/chart/top200?ditc=D&ymd=20201216&hh=21&rtm=Y&pg='
#for i in range(1, 5):
#    print('{}{}'.format(url, i))

# genieTOP 100 크롤링 테스트
for i in range(1, 2):
    targetSite = '{}{}'.format(url, i)
    #print(request)         # 출력 : <Response [200]>

    request = requests.get(targetSite, headers=header)
    html = request.text
    soup = BeautifulSoup(html, 'html.parser')

    # 노래 제목 크롤링
    titles = soup.findAll('a', {'class': 'title ellipsis'})
    #print(titles)
    #print(len(titles))     # 출력 : 50
    #for title in titles:
    #    print(title.text.strip().split('\n')[0])

    # 아티스트 크롤링
    artists = soup.findAll('a', {'class': 'artist ellipsis'})
    #print(artists)
    #print(len(artists))    # 출력 : 55, 1 ~ 5위가 중복되서 나옴
    #for artist in artists[5:]:
    #    print(artist.text.strip().split('\n')[0])


# genieTOP 100 크롤링
genie = []
for i in range(1, 5):
    targetSite = '{}{}'.format(url, i)
    request = requests.get(targetSite, headers=header)
    html = request.text
    soup = BeautifulSoup(html, 'html.parser')

    titles = soup.findAll('a', {'class': 'title ellipsis'})
    artists = soup.findAll('a', {'class': 'artist ellipsis'})

    for i in range(len(titles)):
        genie.append([
            titles[i].text.strip().split('\n')[0],
            artists[i + 5].text.strip().split('\n')[0]
        ])

# 잘 저장됬는지 확인 ############################################################
#print(genie)
#for i in range(len(genie)):
#    print('{0:3d}위 {1} - {2}'.format(i + 1, genie[i][1], genie[i][0]))
##############################################################################

file = open('genieTOP200.txt', 'w', -1, 'UTF-8')
file.write('{} 현재 Genie 뮤직 실시간 TOP 200\n'.format(dt.now()))
for i in range(200):
    data = '{0:3d}위 {1} - {2}'.format(i + 1, genie[i][1], genie[i][0])
    file.write(data + '\n')
file.close()
print('genieTOP200.txt 파일로 쓰기 완료')

try:
    file = open('genieTOP200.txt', 'r', -1, 'UTF-8')
    lines = file.readlines()
    for line in lines:
        print(line, end='')
except:
    print('디스크에 데이터 파일이 없습니다.')
