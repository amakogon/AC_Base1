package artcode.week3.day2;

import artcode.utils.ArrayHelper;

public class Ex3 {
	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {// бегу по строкам
			for (int j = 0; j < mas[i].length; j++) {// бегу по столбцам
				int rand = (int) (Math.random() * 100);// генерирую число в
														// диапазоне от 0 до 100
				if (i % 2 == 0) {// проверяю парная ли строка
					if (rand % 2 == 0) {// проверяю парное ли сгенерированое
										// число
						mas[i][j] = rand;// записываю в матрицу
					} else {// если непарное число
						mas[i][j] = rand + 1;
					}
				} else {// если непарная строка
					if (rand % 2 == 0) {// проверяем на парность сгенерированое
										// число
						mas[i][j] = rand + 1;// записываю непарное
					} else {// если число непарное
						mas[i][j] = rand;// записываю число в матрицу
					}
				}

			}
		}
		
		ArrayHelper.printMatrix(mas);
		
		
		
		

	}
}
