#import datetime
#now = datetime.datetime.now()
#print(now)

#from datetime import datetime
#now = datetime.now()
#print(now)

from datetime import datetime as dt
now = dt.now()
print(now)

print('년 : {}'.format(now.year))
print('월 : {}'.format(now.month))
print('일 : {}'.format(now.day))
print('시 : {}'.format(now.hour))
print('분 : {}'.format(now.minute))
print('초 : {}'.format(now.second))
print('마이크로초 : {}'.format(now.microsecond))
print('밀리초 : {}'.format(now.microsecond // 1000))
# weekday() 메소드는 요일을 숫자로 얻어올 수 있다. => 월(0), 화(1), ... , 토(5), 일(6)
print('요일 : {}'.format(now.weekday()))
