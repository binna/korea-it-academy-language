#include<stdio.h>
#include<stdlib.h>

int main() {
	// 1. 몇개의 배열의 방을 만들지 사용자에게 입력 받기
	int n;
	scanf("%d", &n);

	// 7. 예외 조건
	// 숫자가 2 이상 아니거나 음수일때 ERROR 출력
	if (n >= 2) {
		// 2. 배열 만들고 어떤 값으로 채워 넣을지 사용자에게 입력 받기
		int* arr = (int*)malloc(n * sizeof(int));
		for (int i = 0; i < n; i++) {
			scanf("%d", arr + i);
		}
		// 3. 거리 구하는 값 저장할 배열 만들기
		// 입력받은것보다 하나 적게 왜냐? 거리 구하면 하나 입력 받은것보다 하나 부족함
		int* arDistance = (int*)malloc((n - 1) * sizeof(int));

		// 4. 거리 구해서 배열에 넣기
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					arDistance[i] = arr[i] - arr[j];
				}
				else {
					arDistance[i] = arr[j] - arr[i];
				}
			}
			//printf("%d", arDistance[i]);
		}

		// 5. 짧은 거리 구하기
		// 0번 값을 저장하고 저장한 값들을 1번값부터 순차 비교
		// 작은 값 나오면 값 변경
		int min = arDistance[0];
		for (int i = 0; i < n - 1; i++) {
			if (min > arDistance[i]) {
				min = arDistance[i];
			}
		}

		// 6. 결과값 출력하기
		printf("%d\n", min);
	}
	else {
		printf("ERROR\n");
	}

	return 0;
}