#include<stdio.h>

// ����ü -> ��������
union check {
	int i;
	char c;
};

// ������ -> ������ ������ ���� Ȱ��
enum WEEK {
	SUN, MON, TUE, WEN, THU, FRI, SAT
};

int main() {

	/*
	union check U;
	printf("����ü U�� ũ��� %d�̴�.\n", sizeof(U));
	// �Ӽ��� �߿� �޸� ũ�Ⱑ ���� ū �Ӽ����� ������

	U.i = 97;
	printf("i=%d, c=%c\n", U.i, U.c);
	U.c = 'A';
	printf("i=%d, c=%c\n", U.i, U.c);
	*/

	enum WEEK week;
	week = SUN;
	printf("%d\n", week); // 0
	week = SAT;
	printf("%d\n", week); // 6
	for (int i = SUN; i <= SAT; i++) {
		printf("%d ", i);
	}
	printf("\n");

	enum level { low = 10, mid = 50, high = 100 };
	int exp;
	scanf("%d", &exp);
	if (exp < low) {
		printf("�����");
	}
	else if (exp < mid) {
		printf("�ǹ�");
	}
	else if (exp < high) {
		printf("���");
	}
	else {
		printf("�÷�Ƽ��");
	}

	return 0;
}