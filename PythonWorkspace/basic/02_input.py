# 변수(variable)는 처리할 데이터(상수, constant)를 저장하는 기억장소를 말한다.
# 변수명 작성방법
# 영문자(대소문자를 구분한다.), 숫자, 특수문자(_)만 사용할 수 있으며 반드시 문자로 시작해야 하고 파이썬과 약속된 예약어는 사용할 수 없다.
# 카멜 표기법 => totalCount와 같이 변수 이름이 2개 이상의 단어가 합쳐져서 구성될 때 2번째 이후 단어의 첫 문자를 대문자로 표기한다.

# 파이썬은 c/c++이나 java와 달리 변수를 선언할 때 변수의 자료형을 지정하지 않는다. => 변수에 저장되는 데이터의 타입에 따라서 자동으로 변수의 자료형이 결정된다.
# '='는 같다는 의미로 사용되지 않고 '=' 오른쪽의 데이터를 '=' 왼쪽의 기억장소에 저장하라는 의미로 사용된다. => 대입문, 배정문
# 같다는 '=='와 같이 '='를 2개 연속해서 사용해야 한다.
a = '홍길동'
print(type(a))      # <class 'str'> => 문자열
a = 100
print(type(a))      # <class 'int'> => 정수
a = 3.14
print(type(a))      # <class 'float'> => 실수
# 파이썬은 참, 거짓을 의미한 True 와 False 가 있다. => 반드시 첫 문자만 대문자로 써야한다.
a = True
print(type(a))      # <class 'bool'> => 논리값

# 더 이상 필요 없는 변수는 del 명령으로 삭제시킬 수 있다.
del a
#print(a)

# input() 함수로 키보드로 입력하는 데이터를 받을 수 있다. => 무조건 문자열 형태로 입력된다.
# input('메시지') : 인수로 지정된 메시지를 출력하고 데이터를 입력받는다.
name = input('이름을 입력하세요 : ')
print('%s님 안녕하세요' % name)
print('{}님 안녕하세요'.format(name))

# input() 함수는 무조건 문자열 형태로 데이터를 입력받기 때문에
# 정수나 실수 데이터를 입력받으려면 일단 입력받은 후 int() 함수나 float() 함수를 사용해서 숫자로 변환한 후 사용해야 한다.
age = int(input('나이를 입력하세요 : '))
print(type(age))
print('%s님은 %d살 입니다.' % (name, age))
print('{}님은 {}살 입니다.'.format(name, age))
print('{}님은 내년에 {}살 입니다.'.format(name, age + 1))

# split() 메소드를 사용하면 구분자를 경계로 문자열을 나눌 수 있다. => 구분자를 지정하지 않으면 공백이 기본 구분자로 사용된다.
print('Hello Python')
print('Hello Python'.split())

name, age = input('이름과 나이를 입력하세요 : ').split()
print('{}님은 {}살 입니다.'.format(name, age))
# 파이썬의 '+' 연산자는 숫자와 숫자, 문자열과 문자열의 연산만 가능하다.
# 숫자와 숫자는 덧셈 연산을 하고 문자열과 문자열은 두 문자열을 하나로 연결하는 연결 연산을 한다.
# 숫자와 문자열, 문자열과 숫자는 '+' 연산이 불가능하다.
print('{}님은 내년에 {}살 입니다.'.format(name, int(age) + 1))

# map() 함수를 사용하면 입력받은 데이터를 split() 메소드로 나눠서 한꺼번에 숫자로 변환할 수 있다.
# map(자료형(int 또는 float), input('메시지').split())
python, java, jsp = input('세 과목 점수를 입력하세요 : ').split()
print('총점 : {}'.format(python + java + jsp))
print('총점 : {}'.format(int(python) + int(java) + int(jsp)))

python, java, jsp = map(int, input('세 과목 점수를 입력하세요 : ').split())
print('총점 : {}'.format(python + java + jsp))
