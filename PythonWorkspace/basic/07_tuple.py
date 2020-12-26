# 튜플 만들기
# 튜플은 리스트와 비슷하지만 리스트는 데이터를 []로 둘러싸고 튜플은 ()로 둘러싼다는 것과
#       리스트는 데이터의 수정, 삭제가 가능하지만 튜플은 수정, 삭제가 불가능하다.

# 빈 튜플 만들기
a = ()
print(a)
print(type(a))

# 생성자 함수를 이용해 빈 튜플 만들기
b = tuple()
print(b)
print(type(b))

# 데이터가 1개인 튜플 만들기
a = [1]
print(a)
print(type(a))
b = (1)         # ()를 일반적인 연산식에 사용하는 ()로 인식해서 상수를 기억하는 변수가 만들어진다.
print(b)
print(type(b))
c = (1,)        # 데이터를 1개만 가지는 튜플을 만들어 사용해야 한다면 반드시 데이터 뒤에 ','를 찍어야 한다.
print(c)
print(type(c))

print(a)
print(type(a))
b = ('a', 'b', 'c')
print(b)
print(type(b))
c = (1, 2, 'a', 'b', 'c')
print(c)
print(type(c))
d = (1, 2, ('a', 'b'))
print(d)
print(type(d))
e = (1, 2, ['a', 'b'])
print(e)
print(type(e))
f = [1, 2, ('a', 'b')]
print(f)
print(type(f))

# 튜플은 ()를 생략하더라도 변수에 데이터를 ','로 구분해서 여러개를 넣어주면 자동으로 튜플로 인식한다.
a = 1, 2, 3, 4, 5, 6, 7
print(a)
print(type(a))

# 튜플은 리스트처럼 인덱싱과 슬라이싱이 가능하다.
a = 1, 2, 3, 4, 5, 6, 7
print(a)
print(a[0])
print(a[-1])
print(a[2:4])
print(a[:4])
print(a[2:])

# 튜플은 리스트 처럼 '+', '*' 연선이 가능하다.
a = 1, 2, 3
print(a)
b = 'a', 'b'
print(a + b)
print(a * 3)

# 튜플은 리스트와 달리 수정과 삭제를 할 수 없다. => 한 번 생성한 데이터를 변경할 수 없다.
a = 1, 2, 3, 4, 5, 6, 7
print(a)
#a[0] = 'z' # 에러 : TypeError: 'tuple' object does not support item assignment
            # 튜플에 저장된 데이터를 수정하려 했으므로 에러가 발생된다.
#del a[0]   # 에러 : TypeError: 'tuple' object doesn't support item deletion
            # 튜플에 저장된 데이터를 삭제하려 했으므로 에러가 발생된다.
del a       # del 명령으로 튜플 자체를 제거하는 것은 가능하다. => 즉, 통째로 날리는 것은 가능하다.
#print(a)   # 에러 : NameError: name 'a' is not defined

# 두 기억장소에 저장된 데이터 교환하기
a = 3
b = 4
print('a = {}, b = {}'.format(a, b))

temp = a
a = b
b = temp
print('a = {}, b = {}'.format(a, b))

[a, b] = [b, a]
print('a = {}, b = {}'.format(a, b))

a, b = b, a
print('a = {}, b = {}'.format(a, b))
