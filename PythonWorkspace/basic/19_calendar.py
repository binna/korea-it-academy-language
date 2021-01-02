# import 된 모듈의 특정 함수만 import 해서 사용하려면 아래와 같이 import 시키면 된다.
# form 모듈이름 import 함수이름 => from 다음에 지정한 모듈의 모든 함수를 import 시키지 않고 지정한 함수만 import 시킨다.
# 이런 방식으로 import를 사용하면 함수 앞에 모듈 이름을 써줄 필요가 없고 현재 파일에서 작성한 함수처럼 사용할 수 있다.
#from calenderModule import weekDay      # calenderModule의 weekDay() 함수만 import 시킨다.
#from calenderModule import lastDay      # calenderModule의 lastDay() 함수만 import 시킨다.

# 위의 2문장에서 import 시키는 함수 weekDay()와 lastDay()는 모두 calendarModule 의 함수이므로 아래와 같이 1줄로 줄여서 사용할 수 있다.
#from calenderModule import weekDay, lastDay

# 아래와 같이 코딩하면 calenderModule의 모든 함수를 import 시켜서 사용할 수 있다.
from calendarModule import *

year, month = map(int, input('달력을 출력할 년, 월을 입력하세요 : ').split())
print('=' * 28)
print('        {0:4d}년{1:2d}일'.format(year, month))
print('=' * 28)
print('  일  월  화  수  목  금  토 ')
print('=' * 28)

# 1일이 출력될 요일의 위치를 맞추기 위해서 1일의 요일만큼 반복하여 빈칸을 출력한다. => 빈 칸은 반복당 4칸씩 띄운다.
print('    ' * weekDay(year, month, 1), end='')

# 1일부터 달력을 출력할 달의 마지막 날짜까지 반복하여 달력을 출력한다.
for i in range(1, lastDay(year, month) + 1):
    print(' {0:2d} '.format(i), end='')
    # 출력할 날짜(i)가 토요일이면 줄을 바꾼다.
    if weekDay(year, month, i) == 6 and i != lastDay(year, month):
        print()
print('\n' + '=' * 28)
