#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	// 1. 랜덤으로 숫자 10개 생성
	int number[10];
	srand(time(NULL));
	for (int i = 0; i < 10; i++) {
		// 2. 배열에 넣고 출력
		number[i] = rand() % 100 + 1;
		printf("%d ", number[i]);
	}

	printf("\n");
	// 3. 오름차순 정렬하고 출력 -> 알고리즘 사용
	for (int i = 0; i < 10; i++) {
		for (int i = 0; i < 10 - 1; i++) {
			if (number[i] > number[i + 1]) {
				int temp = number[i];
				number[i] = number[i + 1];
				number[i + 1] = number[i];
			}
		}
	}
	for (int i = 0; i < 10; i++) {
		printf("%d ", number[i]);
	}

	printf("\n");
	// 4. 0 ~ 9 중에 랜덤으로 선택, 해당 숫자를 맞춰보기
	int n = rand() % 9 + 1;
	printf("%d를 맞추는 게임..!!\n", number[n]);

	int cnt = 0;
	while (1) {
		cnt++;
		int num;
		printf("숫자를 입력 : ");
		scanf("%d", &num);

		if (num == number[n]) {
			printf("\n정답입니다!!\n당신은 %d번 만에 정답을 맞췄습니다.\n\n", cnt);
			break;
		}
	}

	return 0;
}