#include<stdio.h>

// 공용체 -> 공간절약
union check {
	int i;
	char c;
};

// 열거형 -> 가독성 증가를 위해 활용
enum WEEK {
	SUN, MON, TUE, WEN, THU, FRI, SAT
};

int main() {

	/*
	union check U;
	printf("공용체 U의 크기는 %d이다.\n", sizeof(U));
	// 속성들 중에 메모리 크기가 가장 큰 속성으로 설정됨

	U.i = 97;
	printf("i=%d, c=%c\n", U.i, U.c);
	U.c = 'A';
	printf("i=%d, c=%c\n", U.i, U.c);
	*/

	enum WEEK week;
	week = SUN;
	printf("%d\n", week); // 0
	week = SAT;
	printf("%d\n", week); // 6
	for (int i = SUN; i <= SAT; i++) {
		printf("%d ", i);
	}
	printf("\n");

	enum level { low = 10, mid = 50, high = 100 };
	int exp;
	scanf("%d", &exp);
	if (exp < low) {
		printf("브론즈");
	}
	else if (exp < mid) {
		printf("실버");
	}
	else if (exp < high) {
		printf("골드");
	}
	else {
		printf("플래티넘");
	}

	return 0;
}