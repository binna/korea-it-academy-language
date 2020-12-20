#include<stdio.h>
#include<stdlib.h>

// 기호상수
#define MAX 5

int main() {
	int arr[5] = { 1, 2, 3,4, 5 };
	int* p = arr;	// &arr[0] == arr
	for (int i = 0; i < 5; i++) {
		printf("%u ", &arr[i]);
	}
	printf("\n");
	printf("%u ", p + 1);
	// 포인터의 연산은 [값]을 추가하는 것이 아니라
	// [주소]를 이동시키는 연산이다!!

	p = &arr[2];
	// 인덱스를 초과해서 출력하면 쓰레기 값이 출력이 된다.
	//for (int i = 0; i < MAX; i++) {
	for (int i = 0; i < MAX - 2; i++) {
		printf("%d ", *(p + i));	// 연산자 우선순위 주의!
	}

	return 0;
}