#include<stdio.h>
#include<stdlib.h>

/*
	정수 1개 탑의 개수
	탑 : int 금액, int 높이
	금액 X 높이 = 탑을 만들때 사용되는 총 금액
	최종 비용 출력
*/

typedef struct TOP {
	int money;
	int height;
}TOP;

int main() {
	int N;
	scanf("%d", &N);

	TOP* top = (TOP*)malloc(N * sizeof(TOP));

	int totalMoney = 0;

	for (int i = 0; i < N; i++) {
		printf("금액과 높이를 입력 : ");
		scanf("%d%d", &top[i].money, &top[i].height);
		totalMoney += top[i].money * top[i].height;
	}
	printf("%d\n", totalMoney);

	return 0;
}