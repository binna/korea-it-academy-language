string = 'We are the champions, My friends!'
# len() 함수는 문자열을 구성하는 문자의 개수를 얻어온다.
print(len(string))

string = 'We are the champions, My friends!'
# count() 메소드는 인수로 지정된 문자열의 출연 횟수를 얻어온다.
# count() 메소드는 인수로 지정된 문자열이 특정 문자열에 포함되어있나 알 수 있다. => 결과가 1 이상이면 포함, 0은 불포함
print(string.count('e'))
print(string.count('We'))
print(string.count('we'))

string = 'We are the champions, My friends!'
# find() 메소드는 인수로 지정된 문자열이 최초로 나타나는 인덱스를 얻어온다. => 인수로 지정된 문자열이 포함되어있지 않으면 -1이 리턴된다.
# find() 메소드의 인수로 지정된 문자열이 특정 문자열에 포함되어있나 알아낼 수 있다. => 0 이상이면 포함, -1은 불포함
print(string.find('e'))
print(string.find('We'))
print(string.find('we'))

string = 'We are the champions, My friends!'
# index() 메소드는 인수로 지정된 문자열이 최초로 나타나는 인덱스를 얻어온다. => 인수로 지정된 문자열이 포함되어있지 않으면 에러가 발생된다.
# index() 메소드의 인수로 지정된 문자열이 특정 문자열에 포함되어있나 알아낼 수 있다. => 0 이상이면 포함, 에러가 발생되면 불포함
print(string.index('e'))
print(string.index('We'))
#print(string.index('we'))   # 에러 - ValueError: substring not found

string = 'KoreaIT'
# join() 메소드로 인수로 지정된 문자열을 특정 문자열의 문자 사이에 삽입한다.
print('/'.join(string))
print('^^;'.join(string))
print('~(^^~);'.join(string))
print(' '.join(string))

string = 'KoreaIT'
# upper() 메소드는 문자열을 무조건 대문자로 변환하고 lower() 메소드는 문자열을 무조건 소문자로 변환한다.
print(string.upper())
print(string.lower())

string = '    python    '
print(len(string))
print(string)
# lstrip() 메소드는 문자열의 왼쪽(앞)의 불필요한 공백을 제거한다.
print(len(string.lstrip()))
print(string.lstrip())
# rstrip() 메소드는 문자열의 오른쪽(뒤)의 불필요한 공백을 제거한다.
print(len(string.rstrip()))
print(string.rstrip())
# strip() 메소드는 문자열의 앞, 뒤의 불필요한 공백을 제거한다.
print(len(string.strip()))
print(string.strip())

string = 'We are the champions, My friends!'
# replace(oldString, newString) 메소드는 문자열의 모든 oldString을 newString으로 치환한다.
print(string.replace('My', 'Your'))
print(string.replace('e', '뷁'))

string = 'We are the champions, My friends!'
# split() 메소드는 문자열을 인수로 지정된 구분자를 이용해서 나눈다. => split() 메소드의 실행 결과는 list 타입으로 리턴된다.
print(string.split())       # 구분자를 생략하면 공백이 기본 구분자로 사용된다.
print(type(string.split()))
print(string.split(','))    # 구분자를 지정하면 지정된 구분자로 문자열을 나눈다.

# strip() 메소드 응용편
# strip() 메소드는 인수를 생략하면 기본값으로 문자열의 양 끝 공백을 제거한다.
print('    python    '.strip())
# strip() 메소드가 꼭 공백만을 제거하는 것은 아니다.
# 인수로 지정된 문자가 더 이상 양 끝에 나타나지 않을 때까지 인수로 지정된 문자를 제거한다. => 인수에 입력한 문자 순서와 제거하는 순서는 상관없다.
print('www.example.com'.strip('w.com'))

string = '            Hello                                          python               '
print(string)
print(string.strip())

# replace() 메소드를 사용한 모든 공백 제거
print(string.replace(' ', ''))

# split(), join() 메소드를 사용해서 문자열 앞, 뒤의 모든 빈 칸을 제거하고 문자열 사이에 2칸 이상 띄어쓰기를 한 곳은 1칸만 띄어쓰기가 되게 한다.
print(string.split())
print(' '.join(string.split()))
