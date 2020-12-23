class Stack:
    # Stack 클래스가 생성될 때 스택의 크기를 넘겨받으면 넘겨받은 크기 만큼의 기억공간을 가지는 스택을 생성하고
    # 크기를 넘겨받지 않으면 5개의 데이터를 저장할 수 있는 스택을 만든다. => default 인수를 사용하면 된다.
    def __init__(self, size = 5):
        #print('Stack 클래스의 객체가 생성될 때 자동으로 실행된다.')
        #print('Stack 클래스 객체가 메모리에 생성된 주소 : {}'.format(self))
        #print('스택의 크기는 {}개'.format(size))
        # 생성자 함수에서 스택을 만든다.
        self.stack = []     # stack => 빈 리스트 => 데이터는 append() 메소드로 추가한다.
        self.size = size    # 스택의 크기
        # top, SP(Stack Pointer) => stack의 몇 개의 데이터가 저장되어 있나 기억한다.
        # => 데이터가 입력되면 1증가, 출력되면 1감소
        self.top = 0

    # push => 입력
    def push(self, data):
        if data not in self.stack:      # 스택에 추가하려는 데이터가 스택에 존재하지 않는가?
            # overflow 인가 검사한다.
            # 스택의 크기(size)가 5일 때 스택으로 사용할 리스트의 인덱스 (top)은 0, 1, 2, 3, 4만 가능하다.
            if self.top < self.size:
                self.stack.append(data)     # 스택에 데이터를 추가한다.
                self.top += 1               # 스텍 데이터를 추가했으므로 SP를 1증가시킨다.
            else:
                # overflow 가 발생하면 스택이 가득찼다는 메시지를 출력한다.
                print('overflow... 스택이 가득차서 {}를(을) 저장할 수 없습니다.'.format(data))
            # ===== if
        else:
            # 추가하려는 데이터가 스택에 존재하기 때문에 중복된 데이터라는 메시지를 출력한다.
            print('{}는(은) 중복된 데이터 입니다.'.format(data))
        self.view()

    # pop => 출력
    def pop(self):
        # underflow 인가 검사한다.
        if self.top <= 0:
            print('스택에 저장된 데이터가 없습니다.')
        else:
            # 파이썬의 list 메소드 중에서 pop() 메소드를 사용해서 스택에 저장된 데이터를 얻어온 후 제거한다.
            data = self.stack.pop()     # 스택에 저장된 데이터를 얻어온 후 제거한다.
            self.top -= 1
            print('pop 데이터 : {}'.format(data), end=', ')
            self.view()

    # view => 스택에 저장된 데이터 보기
    def view(self):
        # 스택에 저장된 데이터를 출력한다.
        print('스택에 저장된 데이터 => ', end='')
        # underflow 인가 검사한다.
        if self.top <= 0:
            # 스택에 저장된 데이터가 없으므로 없다고 출력한다.
            print('없음', end='')
        else:
            # 스택에 저장된 데이터의 개수만큼 반복하며 스택에 저장된 데이터를 출력한다.
            for i in range(self.top):
                if i > 0:
                    print(', ', end='')
                print(self.stack[i], end=' ')
                # ===== if
        print()


# 현재 파일이 다른 파일에 모듈로 import 될 때,
# if __name__ == '__main__': 내부에 코딩한 내용은 자동으로 실행되지 않는다.
if __name__ == '__main__':
    stack = Stack()
    stack.view()
    stack.push(11)
    stack.push(12)
    stack.push(13)
    stack.view()
    stack.push(11)
    stack.push(15)
    stack.view()
    stack.pop()
