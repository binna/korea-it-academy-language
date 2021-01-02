# 사용자가 만든 파이썬 파일을 import 시켜서 사용할 수 있다. => import 할 모듈의 이름은 반드시 문자로 시작해야 한다.
import calendarModule

year, month = map(int, input('달력을 출력할 년, 월을 입력하세요 : ').split())
print('=' * 28)
print('        {0:4d}년{1:2d}일'.format(year, month))
print('=' * 28)
print('  일  월  화  수  목  금  토 ')
print('=' * 28)

# 1일이 출력될 요일의 위치를 맞추기 위해서 1일의 요일만큼 반복하여 빈칸을 출력한다. => 빈 칸은 반복당 4칸씩 띄운다.
print('    ' * calendarModule.weekDay(year, month, 1), end='')

# 1일부터 달력을 출력할 달의 마지막 날짜까지 반복하여 달력을 출력한다.
for i in range(1, calendarModule.lastDay(year, month) + 1):
    print(' {0:2d} '.format(i), end='')
    # 출력할 날짜(i)가 토요일이면 줄을 바꾼다.
    if calendarModule.weekDay(year, month, i) == 6 and i != calendarModule.lastDay(year, month):
        print()
print('\n' + '=' * 28)
