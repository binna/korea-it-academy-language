/*
	정수 1개 입력 : 10
	2 3 -2 0 10 0 0 4 5 0
	[ 2 4 ] -> 6
*/
#include <stdio.h>
#include <stdlib.h>

int main() {

	int n;
	printf("몇 개의 정수를 입력 받을지 입력하세요 : ");
	scanf("%d", &n);

	int* s = (int*)malloc(n * sizeof(int));
	int index = 0;

	for (int i = 0; i < n; i++) {
		int num;
		scanf("%d", &num);

		if (num) {
			// 0이 아닐때 puch를 진행
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