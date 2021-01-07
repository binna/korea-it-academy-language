# class 는 데이터와 데이터를 처리하는 함수(클래스 내부에서 만든 함수를 메소드라 부른다)를 가지고 있는 사용자 정의 자료형이다.
# 설계도
'''
class 클래스이름:    # 클래스 이름은 다른 변수와 헷갈리지 않게 하기 위해서 일반적으로 첫 문자를 대문자로 만들어 사용한다.
    # 생성자(초기자) 함수를 만든다. => __init__
    # 생성자(Constructor)란 객체(클래스로 만든 변수)가 생성될때 자동으로 실행되는 함수이다.
    # 클래스 내부에서 정의하는 모든 함수의 첫 번째 인수로 무조건 self 를 써야한다.
    # => self 로 클래스의 객체가 메모리에 생성된 주소가 자동으로 넘어온다.
    def __init__(self[, 인수, ... ):
        # 멤버 변수 초기화
        # 변수 앞에 'self.'이 붙여있는 변수를 멤버변수라 부르고 멤버 변수는 클래스 전체에서 사용할 수 있다.
        # 변수 앞에 'self.'가 붙여있지 않은 변수를 지역 변수라 부르고 지역 변수는 변수 자신이 선언된 함수에서만 사용할 수 있다.

    # 클래스에 저장된 데이터 출력에 사용하는 함수 __str(self)__는 java 의 toString() 메소드와 같은 기능이 실행된다.
    # __str(self)__ 함수를 선언하지 않으면 객체를 출력하면 객체에 저장된 데이터가 아닌 객체가 메모리에 생성된 주소가 출력된다.
    def __str__(self):
        # return 뒤에 클래스 객체를 출력할 때 출력될 내용을 반드시 문자열 형태로 만들어 리턴시킨다.
        return '출력할 내용'
'''


class Score:
    # 생성자 함수로 Score 클래스 객체가 생성될 때 이름과 3과목의 점수를 넘겨받아 멤버 변수를 초기화 시키고 총점, 평균을 계산한다.
    def __init__(self, name, python, java, jsp):
        #print('Score 클래스의 객체가 생성될 때 자동으로 실행됩니다.')
        #print(self)
        #print('생성자 : ', self)
        # 생성자 함수의 인수로 넘겨받은 데이터로 멤버 변수를 초기화 시킨다.
        self.name = name
        self.python = python
        self.java = java
        self.jsp = jsp
        # 총점과 평균을 계산해 총점, 평균 멤버 변수에 저장시킨다.
        self.total = python + java + jsp
        self.mean = self.total / 3
    def __str__(self):
        return '이름 : {}, python : {}, java : {}, jsp : {}, 총점 : {}, 평균 : {}'.format(\
                self.name, self.python, self.java, self.jsp, self.total, self.mean)


# class 객체(변수) 선언 방법
# 객체이름 = 클래스이름([생성자로 전달된 데이터, ... ])
# 클래스의 객체를 선언하면 클래스의 객체가 메모리에 생성된 주소가 생성자의 인수 self로 전달된다.
score1 = Score('홍길동', 100, 90, 80)
#score2 = Score()
# 클래스에서 __str(self)__ 한수를 선언하지 않고 클래스 객체를 출력하면 객체가 메모리에 생성된 주소가 출력된다.
print(score1)

score2 = Score('임꺽정', 45, 67, 58)
print(score2)

# 클래스로 생성한 객체 멤버 변수에 접근하려면 객체 이름에 '.'을 찍어서 접근하면 된다.
print(score1.name)
print(score2.name)
