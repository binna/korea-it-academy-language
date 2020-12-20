#include<stdio.h>
#include<stdlib.h>

int main() {
	int N;
	scanf("%d", &N);

	int res = 0;
	int act;
	int* A = (int*)malloc(N * sizeof(int));
	int* T = (int*)malloc(N * sizeof(int));
	int index = 0;
	for (int i = 0; i < N; i++) {
		scanf("%d", &act);
		if (act) {
			// push
			scanf("%d%d", &A[index], &T[index]);
			T[index]--;
			index++;
		}
		else {
			T[index - 1]--;
		}
		if (T[index - 1] == 0) {
			// pop
			res += A[index - 1];
			index--;
		}
	}
	printf("최종점수: %d\n", res);

	return 0;
}