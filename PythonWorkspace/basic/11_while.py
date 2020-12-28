# while 은 조건이 참인 동안 반복하다가 조건이 거짓이 되는 순간 반복이 종료된다.
# while 로 진입하는 최초 조건이 거짓일 경우 한 번도 반복을 실행하지 않는다.
# for 는 반복을 몇 번 해야 하는지 알 경우 사용하고 while 은 반복을 하기는 해야겠는데 몇 번이나 반복해야 하나 반복 횟수를 정확히 모를 경우 사용한다.
'''
while 조건식:
    조건식이 참일 경우 실행할 문장
    ...
'''

# 1 부터 10 까지의 합계
total = 0
for i in range(1, 11):
    total += i
print(total)

i = 0
total = 0
while i < 10:
    i += 1
    total += i
print(total)

# while 명령의 조건식이 항상 참이면 무한 루프가 된다.
# 사용자가 의도적으로 무한 루프를 발생시켰다면 반드시 무한 루프를 탈출하는 처리를 해야한다. => 반복 탈출시 break 명령을 사용한다.
# break 명령은 for 와 while 같은 반복문의 실행을 중시지킨다.
# break 명령은 break 명령 이후의 문장을 실행하지 않고 반복을 탈출하고 continue 명령은 continue 명령 이후의 문장을 실행하지 않고 다시 반복을 실행한다.
while True:
    print('=' * 40)
    print(' 1.입력  2.보기  3.수정  4.삭제  5.종료 ')
    print('=' * 40)
    menu = int(input('원하는 메뉴를 입력하세요 : '))

    # 메뉴에 1 부터 5 사이의 값이 입력되었다면 무한 루프를 탈출시킨다.
    #if 1 <= menu <= 5:
    if menu >= 1 and menu <= 5:     # 요거 권장
    #if menu in [1, 2, 3, 4, 5]:
    #if menu in [i for i in range(1, 6)]:
    #if menu in list(range(1, 6)):
    #if menu in range(1, 6):
        break;      # 반복문의 실행을 중지시킨다.
    else:
        print('메뉴는 1 부터 5 사이의 값만 입력 가능합니다.')

# 로또 1등 번호 만들기
import random
lotto = set()
# 1등 번호
while True:
    lottoNumber = random.randrange(1, 46)
    # print(lottoNumber, end = ', ')
    lotto.add(lottoNumber)
    # print(lotto)
    if len(lotto) == 6:
        break
print('1등 번호 : {}'.format(lotto), end = ', ')

# 보너스 번호
while True:
    bonus = random.randrange(1, 46)
    if bonus not in lotto:
        break
print('보너스 번호 : {}'.format(bonus))

# 미국 로또(파워볼)는 1 ~ 69 사이에 5개, 1 ~ 26 사이에 1개
import random
powerball = set()
# 흰공
while True:
    powerballNumber = random.randrange(1, 70)
    powerball.add(powerballNumber)
    if len(powerball) == 5:
        break
print('흰공 : {}'.format(powerball), end = ', ')

# 빨강공 => 파워볼
redball = random.randrange(1, 27)
print('파워볼 : {}'.format(redball))
