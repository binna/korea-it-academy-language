# LinkedList 에 저장할 데이터를 기억하는 클래스 => 노드
class Node:
    def __init__(self, data=None):
        self.data = data    # 실제 데이터
        self.next = None    # 다음 데이터의 위치(주소)

# LinkedList 자체를 의미하는 클래스
class LinkedList:
    def __init__(self):
        self.head = None    # LinkedList 의 시작 위치
        self.count = 0      # LinkedList 에 저장된 데이터의 개수

    # 데이터를 입력하는 경우는 모두 3가지 경우가 있다.
    # 1. LinkedList 의 맨 뒤에 데이터를 추가하는 경우
    # 2. LinkedList 의 맨 앞에 추가하는 경우
    # 3. LinkedList 의 특정 위치에 데이터를 삽입하는 경우

    # 1. LinkedList 의 맨 뒤에 데이터를 추가하는 함수
    def appendLast(self, data):
        # LinkedList 에 저장된 데이터의 개수를 증가시킨다.
        self.count += 1
        # LinkedList 의 맨 뒤에 추가할 데이터를 넘겨받아 Node 클래스(LinkedList 에 저장할 데이터) 객체를 만든다.
        newNode = Node(data)
        # LinkedList 가 비어있을 경우와 비어있지 않을 경우에 따라서 LinkedList 에 데이터를 추가하는 방법이 다르다.
        # LinkedList 가 비어있나 물어봐서 비어있을 경우 head 바로 다음에 추가한다.
        if self.head is None:
            # LinkedList 가 비어있다면 head 바로 다음에 데이터를 추가한다. => head 에 newNode 가 메모리에 생성된 주소를 넣는다.
            self.head = newNode
            # 데이터를 head 다음 위치에 추가했으므로 함수를 return 시켜서 종료한다.
            return
        # =======================
        # if self.head is None: 조건을 만족하지 않는다면(LinkedList 가 비어있지 않다면...!)
        #                       LinkedList 에 저장된 데이터가 있는 것이므로 LinkedList 의 마지막 위치로 이동해서 데이터를 추가한다.
        #                       LinkedList 의 시작 위치를 저장한다.
        last = self.head
        # head 부터 시작해서 LinkedList 의 마지막 데이터로 이동한다. => last.next 가 None 이면 마지막 데이터이다.
        # while 명령의 조건 부분에  None 이 나오면 False 를 의미하고 None 이 아니면 True 를 의미한다.
        while last.next:    # LinkedList 에 저장된 다음 리스트가 있는가?
            last = last.next
        # 더이상 다음 데이터가 없으면 마지막 데이터이므로 이곳에 새 데이터를 추가한다.
        last.next = newNode

    # 2. LinkedList 의 맨 앞에 추가하는 함수
    def appendFirst(self, data):
        self.count += 1
        newNode = Node(data)
        # LinkedList 의 맨 앞에 데이터를 추가할 때 순서를 반드시 지켜야 한다.
        # 맨 앞에 삽입할 데이터(newNode)의 다음 데이터를 기억하는 next 에 head 에 저장된 값(첫번재 데이터의 주소)을 넣어준다.
        newNode.next= self.head
        # head 에는 새로 삽입되는 데이터(newNode)의 주소를 넣어준다.
        self.head = newNode

    # 3. LinkedList 의 특정 위치에 데이터를 삽입하는 함수
    def appendInsert(self, position, data):
        # 데이터가 삽입될 위치가 올바른가 검사한다. => 올바른 위치가 아니면 메시지를 출력하고 함수를 종료한다.
        if position < 1 or position > self.count - 1:
            print('{} 데이터가 삽입될 위치가 올바르지 않습니다.'.format(data))
            return
        # =======================
        # 데이터가 삽입될 위치가 올바르므로 position 번째 위치에 데이터를 삽입한다.
        self.count += 1
        # 데이터가 삽입될 위치를 찾아가기 위해 head 를 저장한다.
        last = self.head
        newNode = Node(data)
        # 데이터가 삽입될 위치를 찾는다.
        for i in range(position - 1):
            last = last.next
        # 데이터를 삽입할 위치를 찾았으므로 데이터를 삽입한다.
        newNode.next = last.next
        last.next = newNode

    # LinkedList 에 저장된 모든 데이터를 출력하는 함수
    def listPrint(self):
        # LinkedList 에 저장된 모든 데이터를 출력하기 위해 리스트의 시작 위치를 저장한다.
        last = self.head
        # Node 클래스 객체의 멤버 변수 next 에 저장된 값이 None 이 아니면 True, None 이면 False
        if last:
            print('LinkedList 에 저장된 데이터가 {}개 있습니다.'.format(self.count))
            # LinkedList 에 저장된 데이터의 개수만큼 반복하며 데이터를 출력한다.
            for i in range(self.count):
                print(last.data, end=' ')
                # 다음에 출력할 데이터로 이동한다.
                last = last.next
            print()
        else:
            print('LinkedList 에 저장된 데이터가 없습니다.')

    # LinkedList 에 저장된 데이터를 찾아서 제거하는 메소드
    def remove(self, data):
        last = self.head
        if last:
            # 제거할 데이터가 0번째 index의 데이터일 경우
            if last.data == data:
                # 1번째 index 의 데이터 위치를 head 에 넣어준다.
                self.head = last.next
                # LinkedList 에 저장된 데이터의 개수를 1감소 시킨다.
                self.count -= 1
                return
            # =======================
            # 제거할 데이터가 0번째 index 이후의 데이터일 경우 제거할 데이터를 찾아서 제거한다.
            while last is not None:
                if last.data == data:   # 제거할 데이터를 찾았는가?
                    break               # 제거할 데이터를 찾았으므로 while 루프를 탈출한다.
                prev = last             # 삭제할 데이터 이전 데이터를 저장한다.
                last = last.next        # 다음 데이터로 이동한다.
            # 여기까지 왔을때 break 명령이 실행되서 온 경우에는 삭제할 데이터를 찾은 경우이고
            # 반복이 정상적으로 종료되서 왔다면 삭제할 데이터가 LinkedList 에 없다는 것이다.
            if last== None:             # 삭제할 데이터를 찾지 못했는가?
                print('{}는 리스트에 존재하지 않습니다.'.format(data))
                return
            # =======================
            # 리스트에서 찾은 데이터를 제거한다.
            prev.next = last.next
            self.count -= 1
        else:
            print('LinkedList 가 비어 있습니다.')

if __name__ == '__main__':
    # LinkedList 를 만든다.
    print('LinkedList 를 만든다.')
    linkedList = LinkedList()       # LinkedList 를 막 만들었으므로 비어있는 리스트이다.
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 의 맨 뒤에 데이터를 추가한다.')
    linkedList.appendLast('일요일')
    linkedList.listPrint()
    linkedList.appendLast('월요일')
    linkedList.listPrint()
    linkedList.appendLast('화요일')
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 의 맨 앞에 데이터를 추가한다.')
    linkedList.appendFirst('토요일')
    linkedList.listPrint()
    linkedList.appendFirst('금요일')
    linkedList.listPrint()
    linkedList.appendFirst('목요일')
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 의 맨 처음과 맨 마지막을 제외한 위치에 데이터를 추가한다.')
    linkedList.appendInsert(0, 'zero_연휴!!')
    linkedList.appendInsert(6, 'six_연휴!!')
    linkedList.appendInsert(1, 'one_연휴!!')
    linkedList.listPrint()
    linkedList.appendInsert(6, 'six_six_연휴s')
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 의 index 가 0인 데이터를 제거한다.')
    linkedList.remove('목요일')
    linkedList.listPrint()
    linkedList.remove('one_연휴!!')
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 의 특정 데이터를 제거한다.')
    linkedList.remove('six_six_연휴s')
    linkedList.listPrint()
    linkedList.remove('일요일')
    linkedList.listPrint()
    print('=' * 50)

    print('LinkedList 에 없는 데이터를 제거하려고 시도한다.')
    linkedList.remove('졸려ㅜㅜ')
    linkedList.listPrint()
