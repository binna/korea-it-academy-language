import warnings
warnings.filterwarnings('ignore')
import requests
from bs4 import BeautifulSoup
header = {'User-agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko'}

ageList = {'1': '10s', '2': '20s', '3': '30s', '4': '40s', '5': '50s', '6': 'all'}
url1 = 'https://datalab.naver.com/keyword/realtimeList.naver?age='
url2 = '&entertainment=0&groupingLevel=2&markerting=0&news=0&sports=0&where=main'
#print(ageList.keys())
#for key in ageList.keys():
#    print('{}{}{}'.format(url1, ageList[key], url2))


# input을 이용하여 연령대를 입력받아 크롤링
key = input('연령대를 입력하세요(1 => 10대, 2 => 20대, 3 => 30대, 4 => 40대, 5 => 50대, 6 => 전체) : ')
targetSite = '{}{}{}'.format(url1, ageList[key], url2)
#print(targetSite)

request = requests.get(targetSite, headers=header)
#print(request)
html = request.text
soup = BeautifulSoup(html, 'html.parser')
#print(soup)

titles = soup.findAll('span', {'class': 'item_title'})
titles_sub = soup.findAll('span', {'class': 'item_title_sub'})

for i in range(len(titles)):
    print('{0:2d}위 : {1}'.format(i + 1, titles[i].text))

print()
for i in range(len(titles)):
    try:
        sub_Title = titles_sub[i].text.strip()
        sub = []
        for title in sub_Title.split(','):
            #print(title.strip())
            sub.append(title.strip())
        print('{0:2d}위 : {1} - {2}'.format(i + 1, titles[i].text, sub))
    except:
        print('{0:2d}위 : {1}'.format(i + 1, titles[i].text))

print()
ranks = soup.findAll('li', {'class': 'ranking_item'})
#print(ranks[0])
dataLab = []
for rank in ranks:
    #print(rank.find('span', {'class': 'item_title'}))
    title = rank.find('span', {'class': 'item_title'}).text
    #print(rank.find('span', {'class': 'item_title_sub'}))
    sub_Title = []
    try:
        subs = rank.find('span', {'class': 'item_title_sub'}).text.split(',')
        for sub in subs:
            sub_Title.append(sub.strip())
    except:
        pass
    #print(sub_Title)
    dataLab.append([title, sub_Title])

for i in range(len(titles)):
    print('{0:2d}위 : {1} - {2}'.format(i + 1, dataLab[i][0],\
                                       dataLab[i][1] if len(dataLab[i][1]) != 0 else ''))
