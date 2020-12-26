# 리스트 만들기
# 리스트를 만들 때는 데이터를 []로 감싸주고 각각의 데이터는 ','로 구분한다.

# 빈 리스트 만들기
a = []
print(a)
print(type(a))
# 빈 리스트는 생성자 함수를 이용해서도 만들 수 있다.
b = list()
print(b)
print(type(b))

c = [1, 2, 3]
c = ['A', 'B', 'C', 'D']
c = [1, 2, 'A', 'B']
c = [1, 2, ['A', 'B']]
c = [[1, 2], ['A', 'B']]
print(c)

# 리스트 인덱싱
d = [10, 20, 30, 40, 50]
print(d)
print(d[0])
print(d[-1])

e = [10, 20, 30, ['a', 'b', 'c']]
print(e)
print(e[0])
print(len(e))       # 리스트에서 len() 함수를 사용하면 리스트를 구성하는 데이터의 개수를 얻어온다.
print(e[-1])
print(len(e[-1]))
print(e[-1][1])

f = [10, 20, ['a', 'b', ['life', 'is']]]
print(f)
print(len(f))
print(f[2])
print(f[2][-1])
print(f[2][-1][0])

# 리스트 슬라이싱
g = [10, 20, 30, 40, 50]
print(g[0])         # 10 => 인덱싱을 사용하면 인덱싱 결과를 상수로 얻어온다.
print(type(g[0]))
print(g[0:1])       # [10] => 슬라이싱을 사용하면 슬라이싱 결과를 리스트로 얻어온다.
print(type(g[0:1]))
print(g[:3])
print(g[3:])
print(g[:])

# 리스트 연산자
# '+'는 두 개의 리스트를 연결하고 '*'는 리스트 지정한 횟수 만큼 반복한다.
h = [1, 2, 3]
i = [4, 5, 6, 7]
print(h + i)
print(h * 3)

# 리스트의 수정 및 삭제
# 리스트를 인덱싱을 사용해 수정하려면 상수를 넣어줘야 하고 슬라이싱을 사용해 수정하려면 리스트를 넣어줘야 한다.
j = [10, 20, 30]
print(j)
j[1] = 40
print(j)
#j[1:2] = 100   # 슬라이싱 결과는 리스트이기 때문에 상수를 넣을 수 없으므로 에러가 발생된다.
j[1:2] = ['a', 'b', 'c']
print(j)
# 리스트를 인덱싱을 사용해 수정할 때 상수가 아닌 리스트를 넣어주면 리스트 자체로 수정된다.
j[2] = ['AAA', 'BBB', 'CCC']
print(j)

# 인덱싱 방식은 del 명령으로 삭제한다.
del j[1]
print(j)
# 슬라이싱 방식은 빈 리스트를 넣어주면 삭제되는 것 처럼 보인다.
j[1:3] = []
print(j)
j[:] = []
print(j)
# del 명령 뒤에 리스트 이름만 쓰면 리스트 자체가 삭제된다.
del j
#print(j)

# 리스트 메소드
# append() 메소드는 리스트의 맨 뒤에 인수로 지정한 데이터를 추가한다.
a = [1, 2, 3]
print(a)
a.append(100)
print(a)

# insert() 메소드는 리스트의 index 번째 위치에 인수로 지정한 데이터를 삽입한다.
a = [1, 2, 3]
print(a)
a.insert(1, 100)
print(a)

# sort() 메소드는 리스트에 저장된 데이터를 오름차순으로 정렬한다.
a = [1, 5, 2, 3, 6, 4]
print(a)
a.sort()
print(a)

b = ['d', 'b', 'c', 'a']
print(b)
b.sort()
print(b)

c = ['홍길동', '임꺽정', '장길산', '일지매']
print(c)
c.sort()
print(c)

# sort() 메소드에 reverse = True 옵션을 지정하면 내림차순으로 정렬된다.
a.sort(reverse=True)
print(a)
b.sort(reverse=True)
print(b)
c.sort(reverse=True)
print(c)

# reverse() 메소드는 리스트에 저장된 데이터의 순서를 뒤집는다.
a = [4, 1, 3, 2]
print(a)
a.reverse()
print(a)

a.sort()
print(a)
a.reverse()
print(a)

# index() 메소드는 인수로 지정된 데이터가 리스트에 저장되어 있을 경우 첫번째 데이터의 위치를 얻어온다.
# index() 메소드의 실행 결과가 0 이상이라면 지정된 데이터가 리스트에 포함되어 있다는 의미로 사용할 수 있다.
a = [1, 2, 3, 4, 3, 5, 3]
print(a)
print(a.index(3))
#print(a.index(6))      # 에러 : ValueError: 6 is not in list
                        # index() 메소드의 인수로 지정된 데이터가 리스트에 없을 경우 에러가 발생된다.

# count() 메소드는 인수로 지정된 데이터가 리스트에 포함되어 있는 개수를 얻어온다.
# count() 메소드의 실행 결과가 1 이상이면 인수로 지정된 데이터가 리스트에 포함되어 있다는 의미로 사용할 수 있다.
# count() 메소드의 실행 결과가 2 이상이면 인수로 지정된 데이터가 중복되서 리스트에 포함되어 있다는 의미로 사용할 수 있다.
# count() 메소드의 실행 결과가 0 이면 인수로 지정된 데이터가 리스트에 없다는 의미로 사용할 수 있다.
a = [1, 2, 3, 4, 3, 5, 3]
print(a)
print(a.count(3))

# remove() 메소드는 인수로 지정된 데이터를 리스트에서 제거한다. => 첫번째 데이터만 제거한다.
a = [1, 2, 3, 4, 3, 5, 3]
print(a)
result = a.remove(3)
print(result, a)


# pop() 메소드는 리스트에 저장된 마지막 데이터를 얻어온 후 제거한다.
a = [1, 2, 3, 4, 3, 5, 3]
print(a)
a.pop()
print(a)
a.pop()
print(a)
result = a.pop()
print(result, a)

# pop() 메소드의 인수로 인덱스를 지정하면 지정된 인덱스 위치의 데이터를 얻어온 후 제거한다.
a.pop(0)
print(a)

# extend() 메소드는 리스트를 확장한다. => '+' 연산이 실행된다.
a = [1, 2, 3]
print(a)
a.extend([4, 5])
print(a)
a = a + [4, 5]
print(a)
