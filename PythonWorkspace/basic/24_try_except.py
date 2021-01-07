# 에러(예외) 처리
# 프로그램을 작성할 때 잘못 동작되는 것을 방지하기 위해 오류가 발생된다. => 오류가 발생된 부분에서 프로그램이 멈춘다.
# try ~ except 를 사용하면 오류가 발생되었을 때 별도의 처리를 하거나 오류를 무시하고 프로그램을 실행할 수 있다.

# 오류가 발생될 것으로 예상되는 문장을 try 블록에 코딩하고 try 블록에 코딩된 내용을 실행하다 오류가 발생되면
# 더 이상 try 블록의 내용을 실행하지 않고 해당 오류의 except 블록에 코딩된 내용을 실행한다.

# try :                         # 필수
#   오류가 발생될 것으로 예상되는 문장
#   ...
# except [오류 이름 [as 변수]]:   # 필수 -> []안의 오류 이름은 생략할 수 있다 => 오류 이름을 생략하면 모든 오류를 의미한다.
#   오류가 발생되면 실행할 문장
#   ...
# finally:                      # 선택 => 필요하면 사용한다.
#   오류 발생 여부와 상관없이 무조건 실행해야 할 문장이 있다면 finally 블록에 코딩한다.
#   ...

#print(4 / 1)    # 이 문장은 정상적으로 실행된다.
#print(4 / 0)    # ZeroDivisionError가 발생된다 => 프로그램이 멈춘다
#print(4 / 4)    # 에러가 발생하면 이 문장은 실행되지 않는다.

try:
    print(4 / 1)    # 이 문장은 정상적으로 실행된다.
    # ZeroDivisionError 가 발생된다 => 프로그램이 멈춘다
    # => 현재 문장부터 나머지 문장은 실행되지 않고 except 블록의 문장이 실행된다.
    print(4 / 0)
    print(4 / 4)    # 에러가 발생하면 이 문장은 실행되지 않는다.
except:
    # 오류 발생시 아무런 일도 하지 않고 오류를 무시하려면 아래와 같이 pass를 사용하면 된다.
    #pass
    print('나눗셈은 0으로 할 수 없습니다.')     # 오류메시지

data = [1, 2, 3]
try:
    print(data[2])      # 이문장은 정상적으로 실행된다.
    # IndexError 가 발생된다. => 프로그램이 멈춘다.
    # => 현재 문장부터 나머지 문장은 실행되지 않고 except 블록의 문장이 실행된다.
    print(data[3])
    print(data[-1])     # 오류가 발생되면 이 문장은 실행되지 않는다.
except:
    #pass
    print('리스트의 인덱스 지정이 올바르지 않습니다.')


# 두가지 이상의 에러가 발생할 가능성 있다면 아래와 같이 코딩하면 된다.
data = [1, 2, 3]
string = "오늘이 아쉽지만 종강이에요"
try:
    #print(4 / 0)    # ZeroDivisionError
    #print(data[3])  # IndexError
    print(string)
    #print('%d' % string)   # TypeError
except ZeroDivisionError:   # ZeroDivisionError 가 발생될 때 실행된다.
    # except 뒤에 오류 이름을 쓰면 지정된 오류가 발생될 때에만 오류를 처리한다.
    print('나눗셈은 0으로 할 수 없습니다.')
except IndexError as e:     # IndexError 가 발생될 때 실행된다.
    # except 뒤에 오류 이름을 쓰고 as로 변수로 지정하면 파이썬이 내보내는 오류 메시지가 변수에 저장된다.
    print('리스트의 인덱스 지정이 올바르지 않습니다.')
    print(e)                # list index out of range
except:
    # ZeroDivisionError, IndexError 를 제외한 오류가 발생되면 이곳에 코딩한 문장이 실행된다.
    # except 뒤에 오류 이름을 지정하지 않으면 모든 오류를 처리할 수 있다.
    # => except 만 사용할 경우 반드시 맨 마지막에 코딩한다.
    print('데이터 타입이 올바르지 않습니다.')
finally:
    print('오류가 발생하던 발생하지 않던 무조건 실행할 문장이 있다면 이곳에 코딩한다.')

data = ['010', '1', '10', '111', '50']
data.sort()
print(data)
data.sort(reverse=True)
print(data)


# 숫자와 문자가 섞여서 데이터가 입력될 때 오름차순(숫자 => 문자) 정렬해서 출력하기, '999'가 입력되면 정렬을 시작한다.
number = []     # 입력되는 숫자가 저장될 빈 리스트
alpha = []      # 입력되는 문자가 저장될 빈 리스트
while True:
    temp = input('데이터를 입력하세요. 999를 입력하면 종료됩니다. : ')
    if temp == '999':
        break
    # 입력받은 데이터가 0부터 9사이의 문자로만 구성된 경우와 그렇지 않은 경우를 각각 number, alpha 리스트에 저장한다.
    try:
        number.append(int(temp))
    except ValueError:
        alpha.append(temp)
number.sort()
alpha.sort()
print(number + alpha)
