#include<stdio.h>
#include<stdlib.h>
#include<string.h>

// 1. ����ڰ� ���� 1�� �Է�
// 2. �ܾ� �Է� -> �⺻���� 100���ο�
// 3. ������ -10 ó����
// 4. �ܾ ���� or 0�� ����
// 5. �ܾ� ���߱� ����ڰ� ���� �Է��� ��ŭ �ݺ�
// 6. ���� ���� ��� -> ��

typedef struct WORD {
	char word[10]; // apple  kiwi
	char blind[10]; // _____  ____
	int score;
}W;
int main() {

	printf("�ܾ���Է�: ");
	int n;
	scanf("%d", &n);
	W *w = (W *)malloc(n * sizeof(W));
	for (int i = 0; i < n; i++) {
		printf("�ܾ��Է�: ");
		scanf("%s", w[i].word); // apple _____
		int j;
		for (j = 0; j < strlen(w[i].word); j++) {
			w[i].blind[j] = '_';
		}
		w[i].blind[j] = '\0'; // ���ڹ迭 => ���ڿ�
							  // a p p l e -> ���ڹ迭
							  // a p p l e \0 -> ���ڿ�
		w[i].score = 100;
	}
	char c;
	int score = 0;
	printf("\n�١ڡ١ڰ����� �����մϴ�!�١ڡ١�\n");
	// ctrl+K+F : ������
	for (int j = 0; j < n; j++) {
		while (1) { // => �ߴܽ��� �����ϱ�! (����Ȯ���ʼ�)
			printf("%s : ", w[j].blind);
			scanf(" %c", &c); // ���ۺ���
							  // �ൿ�� �ߴ���,���ߴ��� => sw����
			int sw = 1;
			for (int i = 0; i < strlen(w[j].word); i++) {
				if (c == w[j].word[i]) {
					w[j].blind[i] = c;
					sw = 0;
				}
			}
			if (sw) {
				// �ܾ ���������ߴ�.
				w[j].score -= 10;
				printf("�ش� ���ڴ� �����ϴ�!��\n");
			}
			if (w[j].score == 0 || strcmp(w[j].word, w[j].blind) == 0) {
				printf("\n������ [%s]�Դϴ�.\n", w[j].word);
				score += w[j].score;
				printf("���������� %d���Դϴ�.\n", score);
				break;
			}
		}
	}
	printf("\n���������� %d���Դϴ�.\n", score);
	if (n * 50 <= score) {
		printf("�ڡ١ڡ١ڡ�\n");
	}

	return 0;
}