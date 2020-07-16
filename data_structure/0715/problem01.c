#include<stdio.h>
#include<stdlib.h>
/*
	문제
	정수 1개 입력, 3
	배열 동적 할당, 1, 2, 3
	f() : 인자로 배열을 사용할 예정(포인터 이용하기)
	출력시 : 3 2 1 : *(p + 1) 사용
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