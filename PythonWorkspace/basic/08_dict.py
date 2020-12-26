# 딕셔너리 만들기
# 대응관계를 나타내는 자료형으로 key 와 key 에 할당되는 데이터(value)가 한 쌍이 되는 자료형이다.
# {key: value, key: value, ...}와 같은 형태를 가지는 자료형이다.
# key 는 일반적으로 string 형태로 만들어 사용하거 value 는 딕셔너리에 저장할 데이터를 입력한다.

# 빈 딕셔너리 만들기
a = {}
print(a)
print(type(a))
# 생성자 함수를 사용해서 딕셔너리를 만들 수 있다.
b = dict()
print(b)
print(type(b))

a = {'name': '홍길동', 'phone': '010-1234-5678', 'age': 20}
print(a)
print(type(a))

# 딕셔너리에 데이터 추가 및 수정하기
# 존재하지 않는 key 에 value 를 할당하면 데이터가 추가되고 존재하는 key 에 데이터를 할당하면 데이터가 수정된다.
# 딕셔너리이름[key] = value
a['gender'] = '남자'  # 추가
print(a)
a['gender'] = '여자'  # 수정
print(a)

# 딕셔너리에 저장된 데이터 삭제하기
# del 딕셔너리이름[key]
del a['gender']
print(a)

# 딕셔너리에 저장된 데이터 얻어오기
# 딕셔너리이름[key] 또는 딕셔너리이름.get(key)
print(a['name'])
print(a.get('phone'))

# 딕셔너리 메소드
# keys() 메소드는 딕셔너리에서 key 목록만 얻어온다.
print(a.keys())
# values() 메소드는 딕셔너리에서 value 목록만 얻어온다.
print(a.values())
# items() 메소드는 딕셔너리에서 key와 value를 쌍으로 묶은 튜플을 얻어온다.
print(a.items())

# clear() 메소드는 딕셔너리에 저장된 모든 데이터를 삭제한다.
a.clear()
print(a)

# del 명령을 사용하면 딕셔너리 자체를 삭제할 수 있다.
del a
#print(a)   # 에러 : NameError: name 'a' is not defined
