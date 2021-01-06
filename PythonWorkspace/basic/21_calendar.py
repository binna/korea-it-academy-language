from calendarModule import *
from datetime import datetime as dt

menu = input('이번달 => 1, 특정달 => 2 : ')

if menu == '1':
    # 달력 프로그램이 시작되면 컴퓨터의 년, 월을 얻어와서 이번달 달력을 출력한다.
    now = dt.now()
    year = now.year
    month = now.month
else:
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
