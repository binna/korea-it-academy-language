# selection Sort 는 특정 위치(i)를 선택하여 나머지 위치(j)와 전부 비교하여 정렬한다.
for i in range(4):
    for j in range(i + 1, 5):
        print('i = {}, j = {}'.format(i, j))

print()
sortData = [8, 3, 4, 9, 1]
for i in range(4):
    for j in range(i + 1, 5):
        # 오름차순 정렬 => 두 값을 비교해서 앞의 값이 크면 위치를 교환한다.
        if sortData[i] > sortData[j]:
            # 두 기억 장소의 값을 교환한다.
            temp = sortData[i]
            sortData[i] = sortData[j]
            sortData[j] = temp
        # ===== end if
    # ===== end for j => 회전 끝
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
# ===== end for i => 정렬 끝
print('정렬 결과 : {}'.format(sortData))

print()
sortData = [8, 3, 4, 9, 1]
for i in range(4):
    for j in range(i + 1, 5):
        # 내림차순 정렬 => 두 값을 비교해서 뒤의 값이 크면 위치를 교환한다.
        # 비교할 때 부등호가 '>'면 오름차순으로 정렬되고 부등호를 '<'로 수정하면 내림차순으로 정렬된다.
        if sortData[i] < sortData[j]:
            # 두 기억 장소의 값을 교환한다.
            # 아래의 교환 방식은 파이썬에서만 가능한 방법!!
            sortData[i], sortData[j] = sortData[j], sortData[i]
        # ===== end if
    # ===== end for j => 회전 끝
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
# ===== end for i => 정렬 끝
print('정렬 결과 : {}'.format(sortData))

print()
sortData = [100, 8, 3, 4, 9, 1, 55]
for i in range(len(sortData) - 1):
    for j in range(i + 1, len(sortData)):
        if sortData[i] > sortData[j]:
            sortData[i], sortData[j] = sortData[j], sortData[i]
    print('{} 회전 결과 : {}'.format(i + 1, sortData))
print('정렬 결과 : {}'.format(sortData))
