#include <stdio.h>
#include <stdlib.h>
/*
	정수 1개 -> 학생 구조체 배열
	int s1, int s2가 멤버로 존재
	학생의 평균 점수를 소수점 뒤 둘째자리까지 출력
	출력은 show라는 함수를 이용하여 출력
*/

// 2. 학생 구조체를 만든다
typedef struct STUDENT {
	int s1;
	int s2;
}STU;

// 5. 출력 show() 함수 만들기
// 학생의 평균 점수를 소수점 뒤 둘째자리까지 출력
void show(STU* student, int N) {
	int* sum = (int*)malloc(N * sizeof(int));

	for (int i = 0; i < N; i++) {
		printf("%.2lf\n", (double)(student[i].s1 + student[i].s2) / N);
	}

}
int main() {
	// 1. 정수 1개를 입력받는다.
	int N;
	scanf("%d", &N);

	// 3. 입력된 정수를 이용, 동적 배열 만든다
	STU* student = (STU*)malloc(N * sizeof(STU));

	// 4. 학생들 점수 받기
	for (int i = 0; i < N; i++) {
		printf("%d번째 학생 점수 입력 : ", i + 1);
		scanf("%d%d", &student[i].s1, &student[i].s2);
	}

	// 6. 함수 실행
	show(student, N);

	return 0;
}