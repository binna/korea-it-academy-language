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
