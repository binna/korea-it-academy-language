# 경고 메시지를 표시하지 않으려면 아래의 2줄을 코딩하면 된다.
import warnings
warnings.filterwarnings('ignore')
# 다시 경고 메시지를 보고 싶다면 warnings.filterwarnings('default')를 실행하면 경고 메시지를 다시 출력된다.

# requests : 크롤링할 웹 사이트에 정보를 요청하고 html 문서를 얻어온다.
# BeautifulSoup : requests 모듈로 얻어온 크롤링할 사이트를 파싱(분석)한다.
import requests
from bs4 import BeautifulSoup

# 타켓 사이트 => http://www.dowellcomputer.com/main.jsp
# requests 모듈의 get() 메소드로 타켓 사이트의 정보를 요청해 얻어온다.
request = requests.get('http://www.dowellcomputer.com/main.jsp')
#print(request)     # 출력 : <Response [200]> => 사이트 정보를 정상적으로 얻어왔다.(즉, 성공)

# 타겟 사이트에서 얻어온 정보 중에서 텍스트로 구성된 html 문서만 얻어온다.
html = request.text
#print(html)

# bs4 모듈의 BeautifulSoup() 함수로 html 문서를 파싱할 준비를 한다.
soup = BeautifulSoup(html, 'html.parser')
#print(soup)

# html 태그와 html 태그에 지정된 속성을 이용한 크롤링
# findAll('태그이름', {'속성이름' : '속성값'})     # 태그에 지정된 속성이 없다면 {} 부분은 생략할 수 있다.

# 최근 공지 사항의 제목은 <b> 태그 내부에 있다.
notices = soup.find_all('b')
#print(notices)
#for notice in notices:
#    print(notice)

# 최근 공지 사항의 제목은 class 속성이 tail 인 <td> 태그 내부에 있다.
notices = soup.findAll('td', {'class': 'tail'})
#print(notices)
#for notice in notices:
#    print(notice)

# 자식 선택자('>') 또는 자손 선택자(' ' => 공백 1칸)를 이용한 크롤링
# select('css 선택자')
notices = soup.select('td > a')
#notices = soup.select('td b')
#print(notices)
for notice in notices:
    #print(notice)
    # get('속성이름') : 인수로 지정된 속성의 값을 얻어온다.
    #print(notice.get('href'))
    #print(notice.get('href').find('notice'))
    if notice.get('href').find('notice') >= 0:
        print(notice.text)
