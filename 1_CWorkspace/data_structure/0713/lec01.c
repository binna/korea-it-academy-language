#include<stdio.h>
#include<stdlib.h>		// malloc �Լ��� ����ϱ� ���� �ʿ��� �������

// 1. call by value ���� ���� ȣ��
void swap(int a, int b) {
	int tmp = a;		// �ӽ� ���� ����
							// a�� ���� ����� �ӽ� ���� ������ �ʿ���
	a = b;
	b = tmp;
}

// ������? �ּҸ� �޴´�
// 2. call by reference
void swap2(int* a, int* b) {
	// �ּҸ� �޾Ҵ� = ������
	// 1. �Լ��� ���ڷ� �ּҸ� ������
	// 2. �ܺ��Լ�(����������Լ�)���� main()�� ������ �ְ� ������
	// 3. �Լ��� ���ϰ����� 2�� �̻��� ������ ������

	// [��ȯ] �˰���
	int temp = *a;	// �ӽ� ���� ����
							// a�� ���� ����� �ӽ� ���� ������ �ʿ���
	*a = *b;
	*b = temp;
}
void show(int* arr, int n) {
	printf("show() �Լ� ���� : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
}


int main() {

	int a = 10;
	int b = 20;

	printf("���� ��� �ִ� �� : %d %d\n", a, b);
	swap(a, b);	// ���� ������ ����
	printf("swap() �� %d %d\n", a, b);

	// �츮�� main�� �ִ� a, b�� ����
	// �ٲٱ� ���ؼ��� �ּ� ���� �༭
	// �� �ּҰ� �����ϰ� �ִ� ���� �����ؾ� �Ѵ�
	swap2(&a, &b);
	printf("swap2() �� %d %d\n", a, b);

	// �������� Ÿ��(�ڷ���) -> ������
	// 4. �����Ҵ�(�����޸�)�� �Ҷ� ���
	// 5. �Լ��� ���ڷ� �迭�� ������ ���
	int n;
	scanf("%d", &n);
	int* arr = ((int*)malloc(n * sizeof(int)));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	show(arr, n);	// arr == &arr[0]

	printf("\n\n");
	char str[10];
	scanf("%s", str);	// �迭�� �̸��� �迭�� &arr[0](��, ù ��° ��)�ּҴ�

	return 0;
}