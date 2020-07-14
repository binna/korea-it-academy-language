#include<stdio.h>
#include<stdlib.h>		// malloc 함수를 사용하기 위해 필요한 헤더파일

// 1. call by value 값에 의한 호출
void swap(int a, int b) {
	int tmp = a;		// 임시 저장 변수
							// a의 값을 기억할 임시 저장 변수가 필요함
	a = b;
	b = tmp;
}

// 포인터? 주소를 받는다
// 2. call by reference
void swap2(int* a, int* b) {
	// 주소를 받았다 = 포인터
	// 1. 함수의 인자로 주소를 보낼때
	// 2. 외부함수(사용자정의함수)에서 main()에 영향을 주고 싶을때
	// 3. 함수의 리턴값으로 2개 이상을 보내고 싶을때

	// [교환] 알고리즘
	int temp = *a;	// 임시 저장 변수
							// a의 값을 기억할 임시 저장 변수가 필요함
	*a = *b;
	*b = temp;
}
void show(int* arr, int n) {
	printf("show() 함수 실행 : ");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
}


int main() {

	int a = 10;
	int b = 20;

	printf("원래 들어 있는 값 : %d %d\n", a, b);
	swap(a, b);	// 값이 변함이 없다
	printf("swap() 후 %d %d\n", a, b);

	// 우리는 main에 있는 a, b의 값을
	// 바꾸기 위해서는 주소 값을 줘서
	// 그 주소가 참조하고 있는 값을 변경해야 한다
	swap2(&a, &b);
	printf("swap2() 후 %d %d\n", a, b);

	// 가변적인 타입(자료형) -> 포인터
	// 4. 동적할당(동적메모리)을 할때 사용
	// 5. 함수의 인자로 배열을 보낼때 사용
	int n;
	scanf("%d", &n);
	int* arr = ((int*)malloc(n * sizeof(int)));
	for (int i = 0; i < n; i++) {
		scanf("%d", &arr[i]);
	}

	show(arr, n);	// arr == &arr[0]

	printf("\n\n");
	char str[10];
	scanf("%s", str);	// 배열의 이름은 배열의 &arr[0](즉, 첫 번째 방)주소다

	return 0;
}