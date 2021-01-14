import warnings
warnings.filterwarnings('ignore')

import requests
from bs4 import BeautifulSoup


# 대화 주제 1 ~ 75를 크롤링해서 리스트에 저장시켜 리턴하는 함수
def getSubject():
    subjects = []  # 크롤링할 대화 주제를 저장해서 리턴시킬 빈 리스트를 만든다.

    # 크롤링할 때 꼭 필요한 코드 =====================================
    request = requests.get('https://basicenglishspeaking.com/daily-english-conversation-topics/')
    html = request.text
    soup = BeautifulSoup(html, 'html.parser')
    # ============================================================

    divs = soup.findAll('div', {'class', 'tcb-col'})
    for div in divs:
        chapters = div.findAll('a')
        for chapter in chapters:
            subjects.append(chapter.text)
        # ================== end for chapter in chapters
    # ================== end for div in divs
    return subjects


if __name__ == '__main__':
    subjects = getSubject()
    for i in range(len(subjects)):
        print('{0:2d}. {1}'.format(i + 1, subjects[i]))
