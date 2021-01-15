import warnings
warnings.filterwarnings('ignore')
import requests
from bs4 import BeautifulSoup

# now() 함수 사용 첫번째 방법
#import datetime
#now = datetime.datetime.now()
#print(now)

# now() 함수 사용 두번째 방법
#from datetime import datetime
#now = datetime.now()
#print(now)

# now() 함수 사용 세번째 방법
from datetime import datetime as dt
now = dt.now()
#print(now)

# now(), 원하는 부분 추출하기 ####################################################
#print(dt.now())                         # 컴퓨터 시스템의 날짜와 시간을 얻어온다.
#print(dt.now().year)
#print(dt.now().month)
#print(dt.now().day)
#print(dt.now().hour)
#print(dt.now().minute)
#print(dt.now().second)
#print(dt.now().microsecond)
#print(dt.now().microsecond // 1000)     # 밀리초
#print(dt.now().weekday())               # 요일을 숫자로 리턴한다. 월(0), 화(1), ..., 금(4), 토(5), 일(6)
week = ['월', '화', '수', '목', '금', '토', '일']
#print(week[dt.now().weekday()] + '요일')
###############################################################################

# bugsTop100 노래 크롤링
targetSite = 'https://music.bugs.co.kr/chart'
requet = requests.get(targetSite)
#print(requet)
html = requet.text
#print(html)
soup = BeautifulSoup(html, 'html.parser')
#print(soup)

# 노래 제목 크롤링
titles = soup.findAll('p', {'class': 'title'})
#print(titles)
#print(len(titles))
#for title in titles:
#    #print(title.text.strip())
#    #print(title.text.split('\n')[1])
#    print(title.text.strip().split('\n')[0])

# 아티스트 크롤링
artists = soup.findAll('p', {'class': 'artist'})
#print(artists)
#print(len(artists))
#for artist in artists:
#    #print(artist.text.strip())     # strip()을 이용, 노래 제목 공백 제거 가능했으나 아티스트는 공백 제거 불가능
#    #print(artist.text.split('\n')) # split('\n') 후 인덱스 이용, 노래 제목 가능했으나 아티스트는 불가능
#    print(artist.text.strip().split('\n')[0])

#print(dt.now())
#for i in range(len(titles)):
#    artist = artists[i].text.strip().split('\n')[0]
#    title = titles[i].text.strip().split('\n')[0]
#    print('{0:3d}위 {1} - {2}'.format(i + 1, artist, title))

# 크롤링한 결과를 텍스트 파일에 저장한다.
# 크롤링한 데이터를 텍스트 파일에 저장할때 에러 발생
# 에러 : UnicodeEncodeError: 'cp949' codec can't encode character '\xa0' in position 31: illegal multibyte sequence
#file = open('bugsTOP100.txt', 'w')
# 아래와 같이 작성해주면 에러 해결
#file = open('bugsTOP100.txt', 'w', -1, 'UTF-8')
#file.write('{} 현재 Bugs 뮤직 실시간 TOP 100\n'.format(dt.now()))
#for i in range(len(titles)):
#    artist = artists[i].text.strip().split('\n')[0]
#    title = titles[i].text.strip().split('\n')[0]
#    data = '{0:3d}위 {1} - {2}'.format(i + 1, artist, title)
#    file.write(data + '\n')
#file.close()
#print('bugsTOP100.txt 파일로 쓰기 완료')

# with 구문을 사용해서 파일을 open하면 with 내부의 내용이 모두 실행되고 난 후 자동으로 파일을 close 시킨다.
with open('bugsTOP100.txt', 'w', -1, 'UTF-8') as file:
    file.write('{} 현재 Bugs 뮤직 실시간 TOP 100\n'.format(dt.now()))
    for i in range(len(titles)):
        artist = artists[i].text.strip().split('\n')[0]
        title = titles[i].text.strip().split('\n')[0]
        data = '{0:3d}위 {1} - {2}'.format(i + 1, artist, title)
        file.write(data + '\n')
print('bugsTOP100.txt 파일로 쓰기 완료')

# 택스트 파일에 저장된 데이터를 읽어서 화면에 출력한다.
try:
    #file = open('bugsTOP1002.txt', 'r', -1, 'UTF-8')    # 일부러 없는 파일로 기제, 실습을 위해
    file = open('bugsTOP100.txt', 'r', -1, 'UTF-8')
    # readlines() 메소드는 텍스트 파일의 내용 전체를 한꺼번에 읽어서 리스트로 변환한다.
    lines = file.readlines()
    for line in lines:
        print(line, end='')
        #print(line.strip())
except:
    print('디스크에 데이터 파일이 없습니다.')
