package class__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("인원수 입력 :");
		int size = scan.nextInt();

		Exam[] ar = new Exam[size];
		for (int i = 0; i < size; i++) {
			ar[i] = new Exam();
			ar[i].compare();
		}

		// 출력
		System.out.println();
		System.out.println("이름\t1 2 3 4 5\t점수");
		for (int i = 0; i < size; i++) {
			System.out.print(ar[i].getName() + "\t");

			for (int j = 0; j < ar[i].getox().length; j++) {
				System.out.print(ar[i].getox()[j] + " ");
			}
			System.out.println("\t" + ar[i].getScore());

		}

	}

}
