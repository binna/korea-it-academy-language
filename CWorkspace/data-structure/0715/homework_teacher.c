#include<stdio.h>

int main() {
	int arr[18];
	int i = 0;
	while (1) {
		scanf("%d", &arr[i]);
		if (arr[i] == 0) {
			break;
		}
		i++;
	}
	printf("현재까지 데이터의 개수 %d개\n", i);
	int cnt = 1;
	for (int a = 1; a <= i; a++) {
		if (arr[a - 1] == arr[a]) {
			cnt++;
		}
		else {
			printf("%d %d ", cnt, arr[a - 1]);
		}
	}

	printf("\n\n");

	int x;		// 현재입력에 대한 변수
	int xx;	// 이전입력에 대한 변수
				// 이전이후입력 체크하여 배열에 결과를 저장->출력
	int data[18];
	int index = 0;
	int count = 1;
	scanf("%d", &xx);
	while (xx != 0) {
		scanf("%d", &x);
		if (xx == x) {
			count++;
		}
		else {
			data[index++] = count;
			data[index++] = xx;
			count = 1;
		}
		xx = x;
	}
	for (int i = 0; i < index; i++) {
		printf("%d ", data[i]);
	}

	return 0;
}