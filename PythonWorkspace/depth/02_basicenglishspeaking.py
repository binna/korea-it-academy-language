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

for div in divs:
    chapter = div.findAll('a')
    print(len(chapter))
