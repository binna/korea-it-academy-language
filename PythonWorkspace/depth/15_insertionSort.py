# insertion Sort 는 이미 정렬된 파일에 새로운 데이터를 위치에 맞게 삽입한다.

# 새 데이터를 key 에 새 데이터의 위치를 index 에 넣는다.
# key 에 저장된 데이터와 이미 정렬된 파일의 마지막 위치 데이터부터 첫번째 위치 데이터 방향으로 비교한다.
# key 에 저장된 데이터가 이미 정렬된 파일의 데이터보다 작으면 정렬된 파일의 데이터를 다음 위치로 보내고 index 를 1 감소시킨다.
# 비교 작업이 모두 완료된 후 key 에 저장된 데이터를 index 번째 위치에 넣어준다.
for i in range(1, 5):
    for j in range(i - 1, -1, -1):
        print('i = {}, j = {}'.format(i, j))

print()
sortData = [8, 3, 4, 9, 1]
for i in range(1, len(sortData)):   # 새 데이터의 위치
    # 이미 정렬된 파일에 새 데이터가 삽입될 위치를 찾기 위해 새 데이터와 인덱스를 각각 key 와 index 에 저장한다.
    key = sortData[i]
    index = i
    # 새 데이터가 삽입될 위치를 찾는다.
    for j in range(i - 1, -1, -1):
        if sortData[j] > key:
            # 정렬된 파일의 데이터가 크기 때문에 정렬된 파일
            # 데이터를 인덱스가 1 큰 위치로 이동시키고 삽입할 데이터의 인덱스를 1 감소시킨다.
            sortData[j + 1] = sortData[j]
            index -= 1
        else:
            # 삽입될 데이터가 이미 정렬된 파일의 데이터와 같거나 더 크다는 의미이므로
            # 이미 정렬된 데이터 앞의 데이터와 더이상 비교할 필요가 없으므로 반복할 필요가 없어진다. => 반복을 탈출시킨다.
            break
        # ===== end if
    # ===== end for j => 회전끝
    # 새 데이터를 정렬된 파일의 위치에 맍게 삽입한다.
    sortData[index] = key
    print('{} 회전 결과 : {}'.format(i,sortData))
# ===== end for i => 정렬 끝
print('정렬 결과 : {}'.format(sortData))
