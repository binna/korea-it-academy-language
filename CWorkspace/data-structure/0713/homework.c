#include<stdio.h>
#include<stdlib.h>

/*
	����

	�Է�: 1 1 0
	���: 2 1(2���� 1)

	�Է�: 1 2 1 1 0
	���: 1 1 1 2 2 1(1�� 1, 1�� 2, 2���� 1)

	�Է� : 1 1 1 1 0
	���: 4 1(4���� 1)

	������� : 10�������� �Է� ����
*/

/*
	��Ʈ1
	�����Ҵ� vs �����Ҵ�
	=> �����Ҵ��� �ڵ带 © �� ������
	�Է��� �迭�� �ƴϴٶ� �Ǵ��� ���� �� ����

	��Ʈ2
	���� �Է°� ���� �Է�(���� �Է�)�� ������ / �ٸ���?
	=> �б����� �޶����� ����

	1- �����Ҵ��Է� -> �迭x���
	2- �迭�Է��� �ƴϱ���~ -> for(;;i+=2)
*/

int main() {

	// 1. 10���� �迭�� ����
	int number[10] = { 0, };

	// 2. ���� �迭�� ����ڿ��� ���� ����
	// ���� 0�� ������ for ���� �����
	for (int i = 0; i < 10; i++) {
		scanf("%d", &number[i]);
		if (number[i] == 0) { break; }
	}

	// 3. ������ ���缭 ����ϱ�
	int cnt = 0;
	int what = 0;

	for (int i = 0; i < 10; i++) {
		if (number[i] == 0) { break; }

		if (cnt < 1) {
			cnt = 1;
			what = number[i];
		} // end if(cnt < 1)

		if (number[i] == number[i + 1]) {
			what = number[i];
			cnt += 1;
			//printf("���� ��µǴ� %d %d\n", cnt, what);
		}
		else {
			printf("%d %d ", cnt, what);
			cnt = 0;
			what = 0;
		} // end if()
	} // end for(number[i] == number[i + 1])

	printf("\n");

	return 0;
}