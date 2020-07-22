#include<stdio.h>
#include<stdlib.h>

typedef struct student {
	char name[10];
	int score;
	int num;
}S;

void f1(S *s, int index, int num) {
	printf("�̸��Է�: ");
	scanf("%s", s[index].name);
	printf("�����Է�: ");
	scanf("%d", &s[index].score);
	s[index].num = num;
}

void f3(S *s, int index) {
	for (int i = 0; i < index; i++) {
		printf("%d. %s : %d\n", s[i].num, s[i].name, s[i].score);
	}
}

void f4(S *s, int index, int x) {
	for (int i = 0; i < index; i++) {
		if (s[i].num == x) {
			// ������������
			printf("%s�л��� �������Է�: ", s[i].name);
			scanf("%d", &s[i].score);
			return;
		}
	}
	printf("��ġ�ϴ� ��ȣ�� �����ϴ�!\n");
}

int main() {

	int n;
	scanf("%d", &n); // �л���
	S *stu = (S *)malloc(n * sizeof(S));
	int index = 0; // ����,�ε�����ȣ
	int act;
	int num = 1001;
	while (1) {
		printf("1.�Է� 2.���� 3.��� 4.���� 5.����\n");
		printf("�����ҹ�ȣ�Է�: ");
		scanf("%d", &act);
		if (act == 1) {
			// ���ʻ����� �л������� ������ �Է��Ҽ�����!
			if (index == n) {
				printf("���̻��ԷºҰ�!\n");
				continue;
			}
			f1(stu, index, num);
			index++;
			num++;
		}
		else if (act == 2) {
			// ���帶������ �߰����л� ����
			// -1���� �Ұ���!
			if (index == 0) {
				printf("���̻�����Ұ�!\n");
				continue;
			}
			index--;
		}
		else if (act == 3) {
			f3(stu, index);
		}
		else if (act == 4) {
			printf("�������л���ȣ�Է�: ");
			int x;
			scanf("%d", &x);
			f4(stu, index, x);
			// �������л��� ��ȣ�Է�->������������
		}
		else {
			printf("���α׷�����\n");
			break;
		}
	}


	return 0;
}