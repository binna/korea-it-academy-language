#include<stdio.h>
#include<stdlib.h>

// ���ȭ ���α׷���
#include"studentFile.h"

int main() {

	printf("�л��� �Է�: ");
	int n;
	scanf("%d", &n);
	S* s = (S*)malloc(n * sizeof(S));
	// �л� ����ü �迭�� ������
	for (int i = 0; i < n; i++) {
		inputS(&s[i], i);
	}
	for (int i = 0; i < n; i++) {
		show(s[i]);
	}

	return 0;
}