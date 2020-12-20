#include<stdio.h>
#include<stdlib.h>
int check(int *d, int a) {
	for (int i = 0; i < a; i++) {
		if (d[i] != 0) {
			return 1;
		}
	}
	return 0;
}
int main() {

	int a, b;
	scanf("%d%d", &a, &b); // 7 3
	int *data = (int *)malloc(a * sizeof(int));
	// [1 0 0 4 5 0 0]
	// "절대 사용하지않을 데이터"
	for (int i = 0; i < a; i++) {
		data[i] = i + 1;
	}
	int i = 0;
	int cnt = 0;
	while (check(data, a)) {
		if (data[i] == 0) {
			i++;
			if (i == a) {
				i = 0;
			}
			continue;
		}
		cnt++;
		if (cnt == b) {
			cnt = 0;
			printf("%d ", data[i]);
			data[i] = 0;
		}
		i++;
		if (i == a) {
			i = 0;
		}
	}

	printf("\n");
	return 0;
}