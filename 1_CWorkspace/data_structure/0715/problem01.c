#include<stdio.h>
#include<stdlib.h>
/*
	����
	���� 1�� �Է�, 3
	�迭 ���� �Ҵ�, 1, 2, 3
	f() : ���ڷ� �迭�� ����� ����(������ �̿��ϱ�)
	��½� : 3 2 1 : *(p + 1) ���
*/
void f(int* arr, int n) {
	int* p = arr;

	for (int i = 0; i < n; i++) {
		printf("%d ", *(p + i));
	}
	printf("\n");
}

int main() {

	int n;
	scanf("%d", &n);

	int* arr = (int*)malloc(n * sizeof(int));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	f(arr, n);

	return 0;
}