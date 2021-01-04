# import 된 모듈의 이름이 길어서 사용하기 불편할 경우 'as' 예약어를 사용해서 모듈의 별명을 지정할 수 있다.
# 모듈에 별명을 지정하면 더 이상 모듈 이름을 사용할 수 없고 지정된 별명을 사용해야 한다.
import calendarModule as cm

year, month = map(int, input('달력을 출력할 년, 월을 입력하세요 : ').split())
print('=' * 28)
print('         {0:4d}년{1:2d}월'.format(year, month))
print('=' * 28)
print(' 일  월  화  수  목  금  토 ')
print('=' * 28)

# 1일이 출력될 요일의 위치를 맞추기 위해서 1일의 요일만큼 반복하여 빈칸을 출력한다. => 빈 칸은 반복당 4칸씩 띄운다.
print('    ' * cm.weekDay(year, month, 1), end='')

# 1일부터 달력을 출력할 달의 마지막 날짜까지 반복하여 달력을 출력한다.
for i in range(1, cm.lastDay(year, month) + 1):
    print(' {0:2d} '.format(i), end='')
    # 출력할 날짜(i)가 토요일이면 줄을 바꾼다.
    if cm.weekDay(year, month, i) == 6 and i != cm.lastDay(year, month):
        print()
print('\n' + '=' * 28)
