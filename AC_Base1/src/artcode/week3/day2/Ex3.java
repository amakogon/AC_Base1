package artcode.week3.day2;

import artcode.utils.ArrayHelper;

public class Ex3 {
	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {// ���� �� �������
			for (int j = 0; j < mas[i].length; j++) {// ���� �� ��������
				int rand = (int) (Math.random() * 100);// ��������� ����� �
														// ��������� �� 0 �� 100
				if (i % 2 == 0) {// �������� ������ �� ������
					if (rand % 2 == 0) {// �������� ������ �� ��������������
										// �����
						mas[i][j] = rand;// ��������� � �������
					} else {// ���� �������� �����
						mas[i][j] = rand + 1;
					}
				} else {// ���� �������� ������
					if (rand % 2 == 0) {// ��������� �� �������� ��������������
										// �����
						mas[i][j] = rand + 1;// ��������� ��������
					} else {// ���� ����� ��������
						mas[i][j] = rand;// ��������� ����� � �������
					}
				}

			}
		}
		
		ArrayHelper.printMatrix(mas);
		
		
		
		

	}
}
