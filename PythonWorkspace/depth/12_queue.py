class Queue:
    def __init__(self, size=5):
        self.queue = []     # 큐 역할을 할 빈 리스트
        self.size = size    # 큐의 크기
        self.rear = 0       # 큐의 뒤쪽 포인터 => 큐에 데이터가 입력될 때 마다 1씩 증가한다.
        self.front = 0      # 큐의 앞쪽 포인터 => 큐에서 데이터가 제거될 때 마다 1씩 증가한다.

    # add => 큐에 데이터를 입력한다.
    def add(self, data):
        if data not in self.queue:
            if self.rear < self.size:       # overflow 인지 if 문을 이용하여 확인
                self.queue.append(data)     # 큐에 데이터를 추가한다.
                self.rear += 1              # 큐에 데이터를 추가했으므로 rear 를 1증가 시킨다.
                print('큐에 {}을(를) 저장합니다.'.format(data), end=' ')
                print('rear = {}, front = {}'.format(self.rear, self.front))
            else:
                print('overflow... 큐가 가득차서 {}를(을) 저장할 수 없습니다.'.format(data))
        else:
            print('{}는(은) 중복된 데이터 입니다.'.format(data))
        self.view()

    # remove => 큐에 저장된 데이터를 제거한다.
    def remove(self):
        if self.rear <= 0 or self.rear == self.front:
            print('큐에 저장된 데이터가 없습니다.', end='')
        else:
            data = self.queue[self.front]   # 큐에 저장된 데이터를 얻어온다.
            self.queue[self.front] = ''     # 얻어온 데이터를 제거한다.
            self.front += 1
            print('큐에서 제거된 데이터 : {}'.format(data), end=' ')
            print('rear = {}, front = {}'.format(self.rear, self.front))
            self.view()

    # view => 큐에 저장된 데이터를 출력한다.
    def view(self):
        print('큐에 저장된 데이터 => ', end='')
        # 큐는 underflow 조건이 2가지가 있다.
        # 큐에 데이터가 한 개도 없을 경우 rear 가 0이므로 underflow 가 발생된다.
        # 큐에 데이터가 입력된 후 입력된 데이터가 모두 제거되면 rear 와 front 가 같아지게 되면서 underflow 가 발생된다.
        if self.rear <= 0 or self.rear == self.front:
            print('없음', end='')
        else:
            # 큐에 저장된 데이터가 있으므로 front 번째 인덱스의 데이터부터 rear - 1번째 인덱스의 데이터를 출력한다.
            for i in range(self.front, self.rear):
                if i > self.front:
                    print(', ', end='')
                print(self.queue[i], end=' ')
        # ===== if
        print()


if __name__ == '__main__':
    queue = Queue()
    queue.view()
    queue.add(11)
    queue.add(11)
    queue.add(12)
    queue.add(13)
    queue.add(14)
    queue.add(15)
    queue.add(16)
    queue.view()
    queue.remove()
    queue.remove()
    queue.remove()
    queue.remove()
    queue.remove()
