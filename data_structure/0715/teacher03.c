#include <stdio.h>
#include <stdlib.h>

typedef struct tower {
	int m;
	int h;
}T;

// 1.입출력 맞추기
// 2.문법오류 수정하기

int f(T *t, int i) {
	return t[i].m*t[i].h;
}
int main() {
	int n;
	scanf("%d", &n);
	T *t = (T *)malloc(n * sizeof(T));
	for (int i = 0; i < n; i++) {
		printf("%d번 탑의 금액,높이 입력: ", i + 1);
		scanf("%d%d", &t[i].m, &t[i].h);
	}
	int sum = 0;
	for (int i = 0; i < n; i++) {
		sum += f(t, i);
	}
	printf("최종금액은 %d입니다.\n", sum);

	return 0;
}