// ����ü
// : Ÿ���� �ٸ� �͵��� �ϳ��� ��� ����ϰ� ������ ��� ����
// �迭
#include<stdio.h>
#include<string.h>
struct student {
	char name[10];		// �������(=�Ӽ�, �ʵ�)
	int score;
	double avg;
}; // �ؾƲ
typedef struct point { // ����ü ��: ( x , y )
	int x;
	int y;
}P;	// ����ü ���� P��� �ڷ������� ����!
		// typedef ���� : ������ ����, �̽ļ� ����

int main() {
	struct student s1 = { "ȫ�浿", 70, 72.4 };
	struct student s2;
	s2.score = 71;
	s2.avg = 74.5;
	//s2.name = "�ȳ�";	// ���־� ��Ʃ����� ���ڿ��� ����� �Ҿ����ϰ� �����ϱ� ������
	// �̷������� ���� ���� ���Ƴ���.
	// �׷��ٰ� ������ �� �ƴϰ� strcpy�� ���� ��� �����ϴ�.
	strcpy(s2.name, "�Ӳ���");
	//scanf("%lf", &s2.avg);

	//struct point p1;
	//struct point p2;
	// p1�� x, y��ǥ�� p2�� x, y ��ǥ�� �Է�
	// -> ������ p3�� ���� => ���
	//struct point p3;

	// struct point -> P��� �Ҹ��� �ڷ���
	P p1;
	P p2;
	P p3;

	printf("p1�� ��ǥ�Է�(x, y): ");
	scanf("%d%d", &p1.x, &p1.y);
	printf("p2�� ��ǥ�Է�(x, y): ");
	scanf("%d%d", &p2.x, &p2.y);
	p3.x = (p1.x - p2.x) / 2;
	p3.y = (p1.y - p2.y) / 2;

	printf("���� ��ǥ�� (%d, %d)�Դϴ�.\n", p3.x, p3.y);

	P p[3];	// ����ü �迭
	for (int i = 0; i < 2; i++) {
		printf("p[%d]�� ��ǥ�Է�(x,y): ", i);
		scanf("%d%d", &p[i].x, &p[i].y);
	}
	p[2].x = (p[0].x - p[1].x) / 2;
	p[2].y = (p[0].y - p[1].y) / 2;
	printf("���� ��ǥ�� (%d, %d)�Դϴ�.\n", p[2].x, p[2].y);

	return 0;
}