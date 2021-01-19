import warnings
warnings.filterwarnings('ignore')
from bs4 import BeautifulSoup
from selenium import webdriver

# selenium 사용해서 가상 크롬을 실행한다. => 사용중인 크롬 버전과 같은 버전의 크롬 드라이버를 다운 받는다.
# https://chromedriver.chromium.org/downloads
#driver = webdriver.Chrome('./chromedriver.exe')

# get() 메소드로 가상 크롬에 크롤링할 타겟 사이트를 띄운다.
#driver.get('https://www.naver.com')

#html = driver.page_source
#print(html)

ageList = {'1': '10s', '2': '20s', '3': '30s', '4': '40s', '5': '50s', '6': 'all'}
url1 = 'https://datalab.naver.com/keyword/realtimeList.naver?age='
url2 = '&entertainment=0&groupingLevel=2&markerting=0&news=0&sports=0&where=main'

key = input('연령대를 입력하세요(1 => 10대, 2 => 20대, 3 => 30대, 4 => 40대, 5 => 50대, 6 => 전체) : ')
targetSite = '{}{}{}'.format(url1, ageList[key], url2)

driver = webdriver.Chrome('./chromedriver.exe')
driver.get(targetSite)

html = driver.page_source
soup = BeautifulSoup(html, 'html.parser')

titles = soup.findAll('span', {'class': 'item_title'})
for i in range(len(titles)):
    print('{0:2d}위 : {1}'.format(i + 1, titles[i].text))
