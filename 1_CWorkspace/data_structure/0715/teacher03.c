#include <stdio.h>
#include <stdlib.h>

typedef struct tower {
	int m;
	int h;
}T;

// 1.����� ���߱�
// 2.�������� �����ϱ�

int f(T *t, int i) {
	return t[i].m*t[i].h;
}
int main() {
	int n;
	scanf("%d", &n);
	T *t = (T *)malloc(n * sizeof(T));
	for (int i = 0; i < n; i++) {
		printf("%d�� ž�� �ݾ�,���� �Է�: ", i + 1);
		scanf("%d%d", &t[i].m, &t[i].h);
	}
	int sum = 0;
	for (int i = 0; i < n; i++) {
		sum += f(t, i);
	}
	printf("�����ݾ��� %d�Դϴ�.\n", sum);

	return 0;
}