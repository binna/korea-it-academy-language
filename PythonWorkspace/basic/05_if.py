# if 명령의 형식
#if 조건식:
#    조건식이 참일 경우 실행할 문장
#    ...
#else:
#    조건식이 거짓일 경우 실행할 문장
#    ...

#조건을 만족하지 않을 때 아무 일도 하지 않는다면 else 이하를 생략할 수 있다.

# 관계(비교) 연산자 => 연산 결과는 무조건 참(True) 또는 거짓(False)이다.
# >  : 크다, 초과
# >= : 크거나 같다, 이상
# <  : 작다, 미만
# <= : 작거나 같다, 이하
# == : 같다
# != : 같지 않다

# 논리 연산자 => 연산 결과는 무조건 참(True) 또는 거짓(False)이다.
# and : 논리곱, 두 조건이 모두 참일 경우에만 참, ~이고, ~이면서, ~중에서
# or  : 논리합, 두
# not : 논리 부정

age = int(input('나이를 입력하세요 : '))
if age >= 19:
    print('성인입니다. 어서오세요~~~~~')
else:
    print('청소년 여러분 이제는 집으로 가야 할 시간입니다.')

jumin = input('주민등록번호 13자리를 "-"없이 입력하세요 : ')
print(jumin)
print(jumin[6])
print(type(jumin[6]))

# 성별
if jumin[6] == '1' or jumin[6] == '3' or jumin[6] == '5':
    print('남자')
else:
    print('여자')

if jumin[6] in ('1', '3', '5'):     # in과 반대 작업을 실행하는 not in도 있다.
    print('남자')
else:
    print('여자')

if int(jumin[6]) == 1 or int(jumin[6]) == 3 or int(jumin[6]) == 5:
    print('남자')
else:
    print('여자')

if int(jumin[6]) in (1, 3, 5):
    print('남자')
else:
    print('여자')

if int(jumin[6]) % 2 == 1:
    print('남자')
else:
    print('여자')

# 나이
jumin = input('주민등록번호 13자리를 "-"없이 입력하세요 : ')
#print(jumin[:2])

year = int(jumin[:2])
#print(type(year))

"""
if jumin[6] <= '2':
    year = year + 1900
else:
    # year = year + 2000
    # 대입 연산자 => '='와 같이 사용된다. => +=, -=, *=, /=, //=, %=
    year += 2000
"""

# if 명령의 조건 비교 결과 참 또는 거짓일 때 실행할 문장이 각각 1문장 씩 일 경우 삼항 연산자를 사용해서 처리할 수 있다.
# 삼항 연산자 형식 => 조건이 참일 때 실행할 문장 if 조건식 else 조건이 거짓일 경우 실행할 문장
year += 1900 if jumin[6] <= '2' else 2000

print('당신의 출생년도는 {}년 이고 {}살 입니다.'.format(year, 2020 - year))


# 3과목 점수를 한 번에 입력받아서 평균을 계산한 후 A, B, C, D, F를 출력한다.
python, java, android = map(int, input('3과목 점수를 입력하세요 : ').split())
total = python + java + android
average = total / 3
print('총점 : {0:3d}점, 평균 : {1:5.1f}'.format(total, average))

# 파이썬은 아래와 같은 비교를 허용하지만 다른 언어에서는 허용하지 않는다.
if average >= 90:
    print('평균 : {0:5.1f}, 등급 : A'.format(average))
if 90 > average >= 80:
    print('평균 : {0:5.1f}, 등급 : B'.format(average))
if 80 > average >= 70:
    print('평균 : {0:5.1f}, 등급 : C'.format(average))
if 70 > average >= 60:
    print('평균 : {0:5.1f}, 등급 : D'.format(average))
if average < 60:
    print('평균 : {0:5.1f}, 등급 : F'.format(average))


python, java, android = map(int, input('3과목 점수를 입력하세요 : ').split())
total = python + java + android
average = total / 3
print('총점 : {0:3d}점, 평균 : {1:5.1f}'.format(total, average))

if average >= 90:
    print('평균 : {0:5.1f}, 등급 : A'.format(average))
elif 90 > average >= 80:
    print('평균 : {0:5.1f}, 등급 : B'.format(average))
elif 80 > average >= 70:
    print('평균 : {0:5.1f}, 등급 : C'.format(average))
elif 70 > average >= 60:
    print('평균 : {0:5.1f}, 등급 : D'.format(average))
elif average < 60:
    print('평균 : {0:5.1f}, 등급 : F'.format(average))


python, java, android = map(int, input('3과목 점수를 입력하세요 : ').split())
total = python + java + android
average = total / 3
print('총점 : {0:3d}점, 평균 : {1:5.1f}'.format(total, average))

if average >= 90:
    print('평균 : {0:5.1f}, 등급 : A'.format(average))
elif average >= 80:
    print('평균 : {0:5.1f}, 등급 : B'.format(average))
elif average >= 70:
    print('평균 : {0:5.1f}, 등급 : C'.format(average))
elif average >= 60:
    print('평균 : {0:5.1f}, 등급 : D'.format(average))
else:
    print('평균 : {0:5.1f}, 등급 : F'.format(average))


# 윤년, 평년 판별식
# 년도가 4로 나눠 떨어지고(and) 100으로 나눠 떨어지지 않거나(or) 400으로 나눠 떨어지면 윤년
year = int(input('윤년 평년을 판별할 년도를 입력하세요 : '))

# 프로그램에서 여러 번 사용되는 상수나 연산식의 결과는 변수에 저장시켜 사용하면 관리가 편리해진다.
# 논리값을 기억하는 변수는 이름을 'is'로 시작하는 것이 관행이다.
isLeapYear = year % 4 == 0 and year % 100 != 0 or year % 400 == 0

if isLeapYear:
    print('{}년은 윤년입니다.'.format(year))
else:
    print('{}년은 평년입니다.'.format(year))

print('{}년은 {}년입니다.'.format(year, '윤' if isLeapYear else '평'))


# 가위(1), 바위(2), 보(3)
# 컴퓨터가 랜덤하게 뽑아낸 가위, 바위, 보와 사용자가 입력한 가위, 바위, 보를 비교한다.

# 난수를 발생시키기 위해 random 모듈을 import 시킨다.
import random

# 난수 발생은 randrange(a, b) 메소드를 사용하고 a 부터 b-1 사이의 난수를 발생시킨다.
cpu = random.randrange(1, 4)
print('cpu : {}'.format(cpu))

user = int(input('가위(1), 바위(2), 보(3) : '))
print('user : {}'.format(user))

# 승리 조건 => cpu == 1 이고 user == 2 또는 cpu == 2 이고 user == 3 또는 cpu == 3 이고 user == 1
# 패배 조건 => cpu == 1 이고 user == 3 또는 cpu == 2 이고 user == 1 또는 cpu == 3 이고 user == 2
# 승리 조건과 패배 조건을 모두 만족하지 않으면 비김 조건이 된다.
if cpu == 1 and user == 2 or cpu == 2 and user == 3 or cpu == 3 and user == 1:
    print('이겼다~~~~~')
elif cpu == 1 and user == 3 or cpu == 2 and user == 1 or cpu == 3 and user == 2:
    print('졌어... ㅜㅜ')
else:
    print('비겼다... 한판 더?')
