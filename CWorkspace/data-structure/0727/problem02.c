/*
	���� 1�� �Է� : 10
	2 3 -2 0 10 0 0 4 5 0
	[ 2 4 ] -> 6
*/
#include <stdio.h>
#include <stdlib.h>

int main() {

	int n;
	printf("�� ���� ������ �Է� ������ �Է��ϼ��� : ");
	scanf("%d", &n);

	int* s = (int*)malloc(n * sizeof(int));
	int index = 0;

	for (int i = 0; i < n; i++) {
		int num;
		scanf("%d", &num);

		if (num) {
			// 0�� �ƴҶ� puch�� ����
			s[index++] = num;
		}
		else {
			// pop
			index--;
		}
	}
	int sum = 0;
	for (int i = 0; i < index; i++) {
		printf("%d ", s[i]);
		sum += s[i];
	}
	printf("\n%d\n", sum);

	return 0;
}