#include<stdio.h>
#include<stdlib.h>

// ��ȣ���
#define MAX 5

int main() {
	int arr[5] = { 1, 2, 3,4, 5 };
	int* p = arr;	// &arr[0] == arr
	for (int i = 0; i < 5; i++) {
		printf("%u ", &arr[i]);
	}
	printf("\n");
	printf("%u ", p + 1);
	// �������� ������ [��]�� �߰��ϴ� ���� �ƴ϶�
	// [�ּ�]�� �̵���Ű�� �����̴�!!

	p = &arr[2];
	// �ε����� �ʰ��ؼ� ����ϸ� ������ ���� ����� �ȴ�.
	//for (int i = 0; i < MAX; i++) {
	for (int i = 0; i < MAX - 2; i++) {
		printf("%d ", *(p + i));	// ������ �켱���� ����!
	}

	return 0;
}