import warnings
warnings.filterwarnings('ignore')

import requests
from bs4 import BeautifulSoup
import time                             # sleep() 메소드를 사용하기 위해 import 한다.


# 한 건의 대화 정보를 저장하는 클래스 => 질문과 답변을 한 쌍으로 저장한다.
class Conversation:
    # 생성자 => 클래스의 객체(클래스로 만든 변수)가 생성될 때 자동으로 실행되는 함수로
    #          클래스의 멤버 변수(self가 붙은 변수)를 초기화시키는 목적으로 주로 사용된다.
    # 클래스 내부에서 정의한는 모든 함수는 무조건 첫번째 인수로 자기 자신의 객체가 메모리에 생성된 주소가 넘어온다.
    # => 클래스 내부에서 정의하는 함수의 첫 번째 인수는 무조건 'self'를 써야 한다.
    #def __init__(self):
    #    print('Conversation 클래스의 생성자가 자동으로 실행됩니다.')
    #    print(self)
    def __init__(self, question, answer):
        # 생성자의 인수로 넘겨받은 데이터로 멤버 변수를 초기화 시킨다.
        # 멤버 변수는 자기 자신의 객체가 메모리에 생성된 주소가 저장된 self를 사용해서 선언해야 한다.
        # self를 사용해서 만든 변수를 멤버 변수라 부르고 클래스 내부의 모든 함수에서 사용할 수 있다.
        # 하지만 self를 사용해서 만들지 않은 변수는 지역 변수라 부르고 변수가 선언된 함수 내부에서만 사용할 수 있다.
        self.question = question        # 질문을 기억하는 멤버 변수를 선언하고 초기화 시킨다.
        self.answer = answer            # 답변을 기억하는 멤버 변수를 선언하고 초기화 시킨다.

    # 클래스로 선언한 객체를 출력할때 출력할 데이터를 만드는 함수 => 출력할 데이터의 형태를 만들어 반드시 문자열로 리턴시킨다.
    # 이 함수를 만들지 않고 객체를 출력하면 객체에 저장된 내용이 아니라 객체가 메모리에 생성된 주소가 출력된다.
    # 반드시 문자열 return 해줘야 한다. => 안그럼 에러 발생!
    def __str__(self):
        return '질문 : ' + self.question + '\n답변 : ' + self.answer


# 클래스의 객체 생성 방법
# 객체(변수)이름 = 클래스이름([생성자로 전달할 데이터]) => 전달할 데이터가 없다고 해서 ()를 생략하면 안된다.
#obj = Conversation()
obj = Conversation('넌 이름이 뭐니?', '제 이름은 홍길동입니다.')
print(obj)

########################################################################################################


# 75개의 대화 주제와 세부 대화 내용의 url을 크롤링하여 리턴하는 함수
def getSubject():
    subjects = []           # 대화 주제를 저장해서 리턴시킬 빈 리스트를 만든다.
    contentLinks = []       # 대화 주제에 따른 세부 대화 내용의 url을 저장해서 리턴시킬 빈 리스트를 만든다.

    request = requests.get('https://basicenglishspeaking.com/daily-english-conversation-topics/')
    html = request.text
    soup = BeautifulSoup(html, 'html.parser')

    divs = soup.findAll('div', {'class', 'tcb-col'})
    for div in divs:
        chapters = div.findAll('a')
        for chapter in chapters:
            #print(chapter)
            #print(chapter.text)
            subjects.append(chapter.text)
            # 대화 내용의 url을 리스트에 추가한다.
            # get('속성이름') : 인수로 지정된 속성의 값을 얻어온다.
            #print(chapter.get('href'))
            contentLinks.append(chapter.get('href'))
        # 대화 주제가 저장된 리스트와 대화 주제에 따른 대화 내용의 url이 저장된 리스트를 리턴시킨다.
        # 데이터를 ','로 구분해서 나열하면 ()로 묶지 않아도 자동으로 튜플로 인식한다.
        return subjects, contentLinks       # 리스트 2개를 리턴하는 것이 아니고 튜플 1개를 리턴하는 것이다.


if __name__ == '__main__':
    #subjects = getSubject()

    subjects, contentLinks = getSubject()
    #for i in range(len(subjects)):
    #    print('{0:2d}. {1} - {2}'.format(i + 1, subjects[i], contentLinks[i]))
    print('총 {}개의 대화 주제를 찾았습니다.'.format(len(subjects)))

    # 대화 주제에 따른 모든 대화 내용을 저장할 빈 리스트를 만든다.
    conversation = []       # 질문과 대답이 한 쌍으로 저장된 Conversation 클래스 객체가 저장된다.

    i = 0                   # 대화 주제의 개수를 카운트 하는 변수
    # 대화 주제의 개수만큼 반복하여 대화 내용을 얻어온다.
    for subject in subjects:
        #print(subject)
        conversation.append('{0:2d}. {1} - {2}'.format(i, subjects[i], contentLinks[i]))

        # 대화 주제별 대화 내용을 크롤링할 페이지를 요청한다.
        request = requests.get(contentLinks[i])

        # time 모듈을 import 하면 sleep() 메소드를 사용할 수 있다.
        # sleep() 메소드는 인수로 지정된 시간만큼 프로그램을 멈춘다. => 시간은 초 단위로 지정한다.
        # 대형 포털 사이트는 짧은 간격으로 많은 요청이 들어오면 자기네 사이트가 공격당하는 것으로 판단할 수 있기 때문에
        # 일정한 시간 간격을 두고 사이트의 정보를 요청하는 것이 좋다.
        # 어떤 페이지를 요청했을때 요청한 페이지가 로딩되는 시간만큼 기다리기 위해 일정한 시간 간격을 두고 정보를 요청하기도 한다.
        time.sleep(1)

        html = request.text
        soup = BeautifulSoup(html, 'html.parser')

        # 주제에 따른 대화 내용은 class 속성이 'sc_player_container1'인 div 태그의 바로 다음 형제이다.
        divs = soup.findAll('div', {'class': 'sc_player_container1'})   # ▶ 버튼을 얻어온다.
        #print(divs)

        # 각각의 대화 주제에 따른 대화 내용을 플레이하는 버튼의 개수만큼 반복한다.
        for div in divs:
            # index() : 인수로 지정된 객체의 index(일련) 번호를 얻어온다.
            # divs.index(div) => 대화 내용 전체(divs)에서 특정 대화(div)의 index를 얻어온다.
            # index() 메소드의 실행 결과가 짝수면 질문이고 홀수면 답변이다.
            #print(divs.index(div))

            # 크롤링할 데이터가 특정 태그 내부에 있지 않고 class 속성이 'sc_player_container1'인 div 태그의 다음 형제로 작성되어 있다.
            # next_sibling      => 다음 형제 노드로 접근한다.
            # previous_sibling  => 이전 형제 노드로 접근한다.
            if divs.index(div) % 2 == 0:        # index가 짝수인가? = 질문인가?
                question = div.next_sibling     # 인덱스 번호가 짝수면 질문 변수에 질문을 저장한다.
                #print('question : ' + question)
            else:
                answer = div.next_sibling       # 인덱스 번호가 홀수면 답변 변수에 질문을 저장한다.
                #print('answer : ' + answer)

                # 질문과 답변이 한 쌍이 되었으므로 Conversation 클래스 객체를 생성하고 질문과 답변을 저장한다.
                c = Conversation(question, answer)
                #print(c)
                # 질문과 답변이 한 쌍으로 저장된 Conversation 클래스 객체를 대화 내용을 저장하는 conversation 리스트에 저장한다.
                conversation.append(c)

        # 대화 주제 1건이 처리 완료되었으므로 다음 대화를 처리하기 위해 i의 값을 1증가시킨다.
        i += 1

for c in conversation:
    print(c)
