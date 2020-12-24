# 큰따옴표나 작은따옴표로 묶어주면 문자열 데이터로 취급한다.
memo = "Hello\nWorld"
print(memo)
memo = 'Python is Good'
print(memo)

# 큰따옴표 3개를 연속해서 사용하면 개행문자(\n)를 사용하지 않고 여러줄 문자열을 만들 수 있다.
memo = """개울가에
올챙이 한마리
꼬물꼬물 헤엄치다
앞다리가 쏘옥
뒷다리가 쑤욱
팔딱 팔딱 메뚜기 됬네"""
print(memo)

# 문자열 인덱스와 슬라이싱 => 인덱스는 0부터 시작된다.
# 인덱싱 => 문자열에서 특정 위치의 문자 1개를 얻어온다.
# 슬라이싱 => 문자열에서 지정된 범위의 문자열을 얻어온다. => 여러 개를 얻어온다.

# 문자열 인덱싱
string = 'We are the champions, My friends!'
print(string[0])
print(string[11])
print(string[32])
# len() 함수는 문자열을 구성하는 문자의 개수를 얻어온다.
print(len(string))
print(string[len(string) - 1])
# 파이썬 음수 인덱싱이 가능하다. 인덱스에 '-'를 붙여주면 맨 뒤부터 인덱싱을 할 수 있다.
print(string[-1])
print(string[-2])

# 문자열 슬라이싱
# 슬라이싱 범위는 [시작위치:끝위치] 형태로 지정하며 시작 위치부터 끝 위치 - 1번째 문자까지 얻어온다.
string = 'We are the champions, My friends!'
print(string[0:1])
print(string[11:20])
# 시작 위치를 생략하면 처음부터 슬라이싱하고 끝 위치를 생략하면 마지막까지 슬라이싱한다.
print(string[0:20])
print(string[:20])
print(string[22:33])
print(string[22:])
print(string[:])
