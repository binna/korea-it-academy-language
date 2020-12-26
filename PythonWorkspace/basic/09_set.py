# set 만들기
# set 은 수학의 집합과 비슷한 형태로 중복되는 데이터 입력을 허용하지 않는 장점이 있지만
# 데이터를 입력하는 순서와 데이터가 실제로 저장되는 순서가 다르다.
# 딕서너리처럼 {}를 사용해서 선언하지만 key 가 존재하지 않고 value 만 존재한다.
a = {}
print(a)
print(type(a))
# 빈 set 을 만들어 사용해야 한다면 반드시 생성자 함수를 이용해서 만들어야 한다.
b = set()
print(b)
print(type(b))

a = {1, 2, 3, 4}
print(a)
print(type(a))

a = {1, 2, 3, 4, 5, 1, 4, 6, 1, 3, 1}
print(a)
print(type(a))

# add() 메소드는 set에 데이터를 추가한다. => 데이터를 저장하는 순서와 실제 저장되는 순서가 다르다.
a = {'홍길동'}
print(a)
a.add('임꺽정')
print(a)
a.add('장길산')
print(a)
a.add('일지매')
print(a)
# set 은 데이터를 입력하는 순서와 저장되는 순서가 다르기 때문에 인덱싱과 슬라이싱을 지원하지 않는다.
#print(a[0])   # 에러 : TypeError: 'set' object is not subscriptable
#print(a[0:2]) # 에러 : TypeError: 'set' object is not subscriptable

# update() 메소드를 사용하면 리스트 또는 튜플을 사용해서 set 에 여러건의 데이터를 한 번에 추가할 수 있다.
a.update(['손오공', '크리닝', '천진반'])
print(a)
a.update(('베지터', '브루마', '트랭크스'))
print(a)

# remove() 메소드로 set 에 저장된 데이터를 지정해서 제거할 수 있다.
a.remove('베지터')
print(a)
#a.remove('베지터')     # 에러 : KeyError: '베지터'

# discard() 메소드로 set 에 저장된 데이터를 지정해서 제거할 수 있다.
a.discard('천진반')
print(a)
# discard() 메소드는 remove() 메소드와 다르게 set 에 없는 데이터를 삭제하려 해도 에러가 발생되지 않는다.
a.discard('천진반')
print(a)

# 집합 연산자와 메소드
a = {1, 2, 3, 4, 5}
b = {3, 4, 5, 6, 7}

# 합집합 => union(), |
print(a.union(b))
print(a | b)

# 교집합 => intersection(), &
print(a.intersection(b))
print(a & b)

# 차집합 => difference(), -
print(a.difference(b))
print(a - b)

# 대칭 차집합(합집합 - 교집합) => symmetric_difference, ^
print(a.symmetric_difference(b))
print(a ^ b)
