file = open('./data/input.txt', 'r')

# readline() 메소드로 텍스트 파일의 내용을 한 줄 씩 읽어들인 내용을 저장할 빈 리스트를 선언한다.
lines = []

# 텍스트 파일에 저장된 데이터가 몇 줄인지 알 수 없으므로 무한 루프를 돌려서 읽는다.
while True:
    # readline() 메소드로 텍스트 파일의 데이터를 한 줄씩 읽어올 수 있다.
    line = file.readline()
    # 텍스트 파일에서 읽어들인 데이터가 없을 경우 무한 루프를 탈출한다.
    if not line:    # readline() 메소드로 텍스트 파일에서 읽어드린 데이터가 없는가?
        break
    # 읽어들인 데이터가 빈 줄(읽어들인 데이터가 모두 공백)이면 읽어들인 내용을 저장하지 않는다.
    if len(line.strip()) != 0:
        #print(line, end='')
        #print(line.strip())
        lines.append(line.strip())
file.close()
print('input.txt 파일에서 읽기 완료!')
print(lines)

file = open('./data/input.txt', 'r')

# readlines() 메소드로 텍스트 파일의 전체를 한꺼번에 읽어서 리스트로 얻어온다.
lines = file.readlines()
#print(type(lines))  # <class 'list'>

file.close()
print('input.txt 파일에서 읽기 완료!')
print(lines)

for line in lines:
    if len(line.strip()) != 0:
        print(line, end=' ')
