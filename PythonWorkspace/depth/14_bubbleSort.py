# bubble Sort 는 인접한 두 데이터를 비교하며 정렬한다.
for i in range(4):
    for j in range(5 - i - 1):
        print('i = {}, j = {}'.format(i, j))
print()

sortData = [8, 3, 4, 9, 1]
for i in range(len(sortData) - 1):
    for j in range(len(sortData) - i - 1):
        if sortData[j] > sortData[j + 1]:
            sortData[j], sortData[j + 1] = sortData[j + 1], sortData[j]
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
print('정렬 결과 : {}'.format(sortData))

print()
sortData = [8, 3, 4, 9, 1]
for i in range(len(sortData) - 1):
    for j in range(len(sortData) - i - 1):
        if sortData[j] < sortData[j + 1]:
            sortData[j], sortData[j + 1] = sortData[j + 1], sortData[j]
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
print('정렬 결과 : {}'.format(sortData))

print()
# 버블 정렬은 데이터가 어느정도 정렬된 상태일 경우 정해진 회전을 모두 실행하지 않더라도 중간에 정렬이 완료되면 종료가 가능하다.
sortData = [9, 1, 3, 4, 8]
for i in range(len(sortData) - 1):
    # 정렬 작업을 시작하기 전에 flag 변수를 True 로 초기화 한다.
    flag = True
    for j in range(len(sortData) - i - 1):
        if sortData[j] > sortData[j + 1]:
            # 값 교환 작업이 이루어지면 정렬 작업이 진행중이라는 의미이다.
            sortData[j], sortData[j + 1] = sortData[j + 1], sortData[j]
            # 정렬 작업이 진행되면 flag 변수의 값을 False 로 변경한다.
            flag = False
        # ===== end if
    # ===== end for j => 회전 끝
    if flag:
        # flag 변수의 값이 True 면 이미 리스트에 저장된 데이터가 정렬이 완료되었다는 의미이므로
        # 더 이상 반복하면 정렬할 필요가 없기 때문에 break 명령을 사용하여 반복을 중지한다.
        break       # 반복문 중지(탈출)
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
# ===== end for i => 정렬끝
