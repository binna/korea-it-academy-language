# for 명령은 반복 횟수가 몇 번인지 알 경우 사용한다.
'''
숫자 리스트를 만들어주는 함수는 range() 함수와 같이 사용하는 for
for 변수 in range([초기치, ]최종치[, 증가치]): => [] 안의 내용은 생략할 수 있다.
    반복할 문장
    ...
'''
# range([초기치, ]최종치[, 증가치]) : 초기치부터 최종치를 넘어가지 않을 때까지 증가치만큼 증가하는 숫자 리스트를 만든다.
# 초기치와 증가치는 생략할 수 있으며 초기치를 생략하면 0, 증가치를 생략하면 1이 기본값으로 사용된다.
# range(0, 10, 1)와 range(10)은 의미가 같다.

a = list(range(0, 10, 1))
print(a)
b = list(range(10, 0, -1))
print(b)
c = list(range(10))
print(c)

# 1 ~ 100의 합계 => 5050
total = 0  # 변수가 최초로 사용되기 전에 반드시 초기화가 되어야 한다.
for i in range(1, 101):
    total = total + i
print('1 ~ 100의 합계 : {}'.format(total))

# 주사위를 10번 굴렸을 때 각각의 눈이 나타난 개수를 계산한다. - 변수 사용
import random
num1, num2, num3, num4, num5, num6 = 0, 0, 0, 0, 0, 0;
# 한 문장이 너무 길어서 여러줄로 나눠서 코딩하려면 줄이 바뀌는 곳에 '\'를 입력하고 다음줄에 이어서 코딩하면 된다
for i in range(10):
    r = random.randrange(1, 7)      # 랜덤하게 주사위 눈을 발생시킨다.
    print('{0:2d}번째 주사위가 데구르르~~~~ 굴러서 {1}이 나왔습니다.'.format(i + 1, r))

    # 주사위 눈의 개수를 센다.
    if r == 1:
        num1 += 1
    elif r == 2:
        num2 += 1
    elif r == 3:
        num3 += 1
    elif r == 4:
        num4 += 1
    elif r == 5:
        num5 += 1
    else:
        num6 += 1
# end for ==================================

print('1의 개수 : {}'.format(num1))
print('2의 개수 : {}'.format(num2))
print('3의 개수 : {}'.format(num3))
print('4의 개수 : {}'.format(num4))
print('5의 개수 : {}'.format(num5))
print('6의 개수 : {}'.format(num6))

# 주사위를 10번 굴렸을 때 각각의 눈이 나타난 개수를 계산한다. - 리스트(배열) 사용
# 1 ~ 6 사이의 숫자를 기억할 0으로 초기화된 리스트를 만든다.
#count = [0, 0, 0, 0, 0, 0]
# 빈 리스트를 만들고 0을 6번 추가한다.
count = []
for i in range(6):
    count.append(0)
# 0이 6번 반복되는 리스트를 만든다.
#count = [0 for i in range(6)]
#print(count)

for i in range(10):
    r = random.randrange(1, 7)
    print('{0:2d}번째 주사위가 데구르르~~~~ 굴러서 {1}이 나왔습니다.'.format(i + 1, r))

    if r == 1:
        count[0] += 1
    elif r == 2:
        count[1] += 1
    elif r == 3:
        count[2] += 1
    elif r == 4:
        count[3] += 1
    elif r == 5:
        count[4] += 1
    else:
        count[5] += 1
# end for ==================================

print('1의 개수 : {}'.format(count[0]))
print('2의 개수 : {}'.format(count[1]))
print('3의 개수 : {}'.format(count[2]))
print('4의 개수 : {}'.format(count[3]))
print('5의 개수 : {}'.format(count[4]))
print('6의 개수 : {}'.format(count[5]))

count = []
for i in range(6):
    count.append(0)

for i in range(10000000):
    r = random.randrange(1, 7)
    #print('{0:2d}번째 주사위가 데구르르~~~~ 굴러서 {1}이 나왔습니다.'.format(i + 1, r))
    count[r - 1] += 1

for i in range(6):
    print('{}의 개수 : {}'.format(i + 1, count[i]))

# 리스트와 for
# range() : 초기치 부터 최종치 - 1 까지 증가치 만큼 증가하는 숫자 리스트를 만든다.
print(range(1, 11, 1))
print(list(range(1, 11, 1)))

# range() 함수에 의해 생성된 숫자 리스트의 값이 0번째 인덱스 부터 마지막 인덱스 까지 변수에 저장되며 반복한다.
for i in range(1, 11, 1):
    print(i, end = ' ')
print()

for i in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
    print(i, end = ' ')
print()

a = ['Life', 'is', 'too', 'short']
print(a)
print('=' * 80)

# 리스트에 저장된 데이터의 개수가 변하지 않는다면 리스트의 크기만큼 반복시킨다.
for i in range(4):
    print(a[i])
print('=' * 80)

# 리스트에 저장된 데이터의 개수가 변한다면 len 함수를 사용해 리스트에 저장된 데이터의 개수를 얻어와서 데이터의 개수만큼 반복시킨다.
for i in range(len(a)):
    print(a[i])
print('=' * 80)

for i in a:
    print(i)
print('=' * 80)

for i in a[1:3]:
    print(i)

# 튜플과 for
a = 'Life', 'is', 'too', 'short'
print(a)
print('=' * 80)

for i in range(4):
    print(a[i])
print('=' * 80)

for i in range(len(a)):
    print(a[i])
print('=' * 80)

for i in a:
    print(i)
print('=' * 80)

for i in a[1:3]:
    print(i)

# set 과 for
a = {'Life', 'is', 'too', 'short'}
print(a)
print('=' * 80)

'''
for i in range(4):
    print(a[i]) # set은 인덱싱을 지원하지 않기 때무넹 에러가 발생된다.
print('=' * 80)

for i in range(len(a)):
    print(a[i])
print('=' * 80)
'''

for i in a:
    print(i)
print('=' * 80)

'''
for i in a[1:3]: # set은 슬라이싱을 지원하지 않기 때문에 에러가 발생된다.
    print(i)
'''
pass

# 딕셔너리와 for
a = {'apple': 1000, 'banana': 3500, 'melon': 10000, 'mango': 5000}
print(a)
print(type(a))
print(a.keys())
print(a.values())
print(a.items())

for key in a.keys():
    print(key)
print('=' * 80)
for key in ['apple', 'banana', 'melon', 'mango']:
    print(key)
print('=' * 80)
# 딕셔너리 이름만 쓰면 딕셔너리이름.keys()와 같은 의미로 사용된다.
for key in a:
    print(key)

for value in a.values():
    print(value)
print('=' * 80)
for value in [1000, 3500, 10000, 5000]:
    print(value)
print('=' * 80)
for key in a.keys():
    print(a[key])
print('=' * 80)
for key in a.keys():
    print(a.get(key))

for item in a.items():
    print(item)
print('=' * 80)
for item in a.items():
    print(item[0])
print('=' * 80)
for item in a.items():
    print(item[1])
print('=' * 80)

for item in a.items():
    print('{0:6s}는 {1:6d}원 입니다.'.format(item[0], item[1]))
print('=' * 80)
for key, value in a.items():
    print('{0:6s}는 {1:6,d}원 입니다.'.format(key, value))
