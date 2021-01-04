class BinaryTree:
    # 생성자에서 이진트리의 root 노드를 만든다.
    def __init__(self, data):
        self.left = None    # 왼쪽 자식 노드를 기억한다.
        self.data = data    # 데이터
        self.right = None   # 오른쪽 자식 노드를 기억한다.

    # 트리에 노드를 삽입하는 함수
    def insert(self, data):
        # 트리에 삼입할 데이터 값과 부모 노드의 데이터 값을 비교해서 트리에 데이터가 삽입될 위치를 결정한다.
        # 트리에 삽입할 데이터가 부모 노드의 데이터보다 작으면 부모 노드의 왼쪽에 삽입한다.
        # 트리에 삽입할 데이터가 부모 노드의 데이터보다 크면 무보 노드의 오른쪽에 삽입한다.
        print('트리에 삽입하려는 데이터 {}의 부모 노드 데이터는 {} 입니다.'.format(data, self.data))

        # 삽입하려는 데이터가 부모 데이터보다 작은가?
        if data < self.data:
            # 삽입할 데이터는 부모 노드의 왼쪽에 삽입한다.
            #print('부모 노드의 데이터가 크기 때문에 부모 노드의 왼쪽에 데이터를 삽입한다.')
            # 부모 노드의 왼쪽 링트(self.left)가 비어(None)있어야 데이터를 삽입할 수 있다.
            if self.left is None:
                # 부모 노드의 왼쪽 링크가 비어있으므로 데이터를 추가한다.
                print('부모({}) 왼쪽에 {} 추가 가능'.format(self.data, data))
                # 새 데이터를 추가해야 하므로 트리에 추가할 데이터로 BinaryTree 클래스의 객체를 생성해서
                # 부모 노드의 비어있는 왼쪽링크에 생성된 객체의 주소를 넣어준다.
                self.left = BinaryTree(data)
                print('부모({}) 왼쪽에 {} 추가 완료'.format(self.data, data))
            else:
                # 부모 노드의 왼쪽 링크가 비어있지 않기 때문에 데이터를 추가할 수 없다.
                print('부모({}) 왼쪽에 {} 추가 불가능!! 부모 왼쪽의 {}에서 재귀 호출'.format(self.data, data, self.left.data))
                self.left.insert(data)
        # 삽입하려는 데이터가 부모 데이터보다 큰가?
        elif data > self.data:
            #print('부모 노드의 데이터가 작기 때문에 부모 노드의 오른쪽에 데이터를 삽입한다.')
            # 부모 노드의 오른쪽 링크(self.right)가 비어(None)있어야 데이터를 삽입할 수 있다.
            if self.right is None:
                # 부모 노드의 오른쪽 링크가 비어있으므로 데이터를 추가한다.
                print('부모({}) 오른쪽에 {} 추가 가능'.format(self.data, data))
                # 새 데이터를 추가해야 하므로 트리에 추가할 데이터로 BinaryTree 클래스의 객체를 생성해서 부모노드의 비어있는
                # 오른쪽 링크에 생성된 객체의 주소를 넣어준다.
                self.right = BinaryTree(data)
                print('부모({}) 오른쪽에 {} 추가 완료'.format(self.data, data))
            else:
                # 부모 노드의 오른쪽 링크가 비어있지 않기 때문에 데이터를 추가할 수 없다.
                print('부모({}) 오른쪽에 {} 추가 불가능!! 부모 오른쪽의 {}에서 재귀 호출'.format(self.data, data, self.right.data))
                self.right.insert(data)
        # 삽입하려는 데이터가 이미 트리에 존재하는가?
        else:
            print('{}는 이미 트리에 존재하는 데이터입니다.'.format(data))

    # 트리를 구성하는 노드 목록을 inorder 방식으로 탐색해서 출력하는 함수
    def inorder(self):
        # 왼쪽 자식 노드가 있나 검사한다. => 데이터가 있으면 True, 없으면(None) False
        if self.left:
            self.left.inorder()
        # 더 이상 자식 노드가 없으면 출력한다.
        print(self.data, end=' ')
        # 오른쪽 자식 노드가 있나 검사한다. => 데이터가 있으면 True, 없으면(None) False
        if self.right:
            self.right.inorder()

    # 트리를 구성하는 노드 목록을 preorder 방식으로 탐색해서 출력하는 함수
    def preorder(self):
        print(self.data, end=' ')
        if self.left:
            self.left.preorder()
        if self.right:
            self.right.preorder()

    # 트리를 구성하는 노드 목록을 postorder 방식으로 탐색해서 출력하는 함수
    def postorder(self):
        if self.left:
            self.left.postorder()
        if self.right:
            self.right.postorder()
        print(self.data, end=' ')


# 이진 트리의 root 노드를 만든다.
root = BinaryTree(12)
root.insert(6)
print('=' * 50)
root.insert(20)
print('=' * 50)
root.insert(3)
print('=' * 50)
root.insert(25)
print('=' * 50)
root.insert(10)
print('=' * 50)
root.insert(15)
print('=' * 50)
root.insert(20)
print('=' * 50)

# 트리의 운행(같은 노드를 중복해서 방문하지 않고 모든 노드를 방문하는 방법)은
# 부모 노드를 언제 방문하느냐에 따라서 아래와 같이 3가지 방법이 있다.
# 1) inorder : Left => Root => Right
# 2) preorder : Root => Left => Right
# 3) postorder : Left => Right => Root
root.inorder()      # 출력 : 3 6 10 12 15 20 25
print()
root.preorder()     # 출력 : 12 6 3 10 20 15 25
print()
root.postorder()     # 출력 : 3 10 6 15 25 20 12
