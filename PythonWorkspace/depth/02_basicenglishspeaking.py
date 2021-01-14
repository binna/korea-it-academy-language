import warnings
warnings.filterwarnings('ignore')

import requests
from bs4 import BeautifulSoup

# 타겟 사이트 => https://basicenglishspeaking.com/daily-english-conversation-topics/
request = requests.get('https://basicenglishspeaking.com/daily-english-conversation-topics/')
#print(request)
html = request.text
#print(html)
soup = BeautifulSoup(html, 'html.parser')
#print(soup)

divs =soup.findAll('div', {'class': 'tcb-flex-col'})
#print(len(divs))
#print(divs)

subjects = []
for div in divs:
    chapters = div.findAll('a')
    #print(len(chapters))
    for chapter in chapters:
        #print(chapter.text)
        subjects.append(chapter.text)

for i in range(len(subjects)):
    print('{0:2d}. {1}'.format(i + 1, subjects[i]))
