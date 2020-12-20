#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// 선택 정렬 함수
void select_sort(int* arr, int n) {
	for (int i = 0; i < n; i++) {
		int min = arr[i];
		int min_index = i;
		for (int j = i; j < n; j++) {
			if (min > arr[j]) {
				min = arr[j];
				min_index = j;
			}
		}
		int tmp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = tmp;
	}
}
// 이진탐색 == 이분탐색
int binarySearch(int* arr, int data, int start, int end) {
	int m = (start + end) / 2;

	while (start <= end) {
		if (arr[m] == data) {
			return m;
		}
		else if (arr[m] < data) {
			start = m + 1;
		}
		else {
			end = m - 1;
		}
		m = (start + end) / 2;
	}
	return -1;
}

int main() {
	// 1. 1~100까지 랜덤의 수 10개를 배열에 담기
	srand(time(NULL));
	int arr[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = rand() % 100 + 1;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}

	// 2. 선택 정렬을 이용하여 오름차순으로 정렬
	printf("\n");
	select_sort(arr, 10);
	for(int i = 0; i < 10; i++) {
		printf("%d, ", arr[i]);
	}

	// 3. 몇 번방에 있는지 찾고자 하는 정수 입력 받기
	printf("\n");
	printf("찾을 정수 입력 : ");
	int f;
	scanf("%d", &f);


	// 4. 이진 탐색 미사용, 입력한 정수가 몇 번 방인지 확인
	printf("\n이진탐색 미사용\n");
	int sw = 0;	// 스위치OFF
	int i;
	for (i = 0; i < 10; i++) {
		if (arr[i] == f) {
			printf("[%d]\n", i);
			sw = 1;
			break;
		}
	}
	if (i == 10) {		// break 사용 시 구현 가능
		printf("[-1]");
	}
	if (sw == 0) {
		printf("[-1]");
	}
	printf("\n\n");
	

	// 5. 이진탐색 사용, 입력한 정수가 몇 번 방인지 확인
	// 이진탐색==이분탐색
	printf("이진탐색 사용\n");
	printf("[%d]\n\n", binarySearch(arr, f, 0, 9));

	return 0;
}