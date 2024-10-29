package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SungJukOX {
	static final String JUNG = "11111"; // 필드-정답이라 상수화(상수기때문에 대문자로 표기)

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		int p = scan.nextInt();

		String[] name = new String[p];
		String[] dap = new String[p];
		char[][] ox = new char[p][5];
		int[] score = new int[p];

		// 답안 제출
		for (int i = 0; i < p; i++) {
			System.out.println("이름 입력 : ");
			name[i] = scan.next();

			System.out.println("답안지 입력 : ");
			dap[i] = scan.next();

			System.out.println();

		}
		// 채점
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < 5; j++) {
				if (dap[i].charAt(j) == JUNG.charAt(j)) {
					ox[i][j] = 'o';
					score[i] += 20;
				} else
					ox[i][j] = 'x';
			}
		}	

		System.out.println("***성적표***");
		System.out.println("이름" + "\t" + "1 2 3 4 5" + "\t" + "점수");

		// 출력
		for (int i = 0; i < p; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < 5; j++) {
				System.out.print(ox[i][j] + " ");
			}
			System.out.println("\t"+score[i]);
		}
		System.out.println();
	}


}

/*

[문제] 성적처리 프로그램
- 5문제는 사지선다형 문제이다
- 정답은 "11111"
  static final String JUNG = "11111"; //상수화
- 1문제당 20점씩 한다.
  
[실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답안지 입력 : 12311

이름 입력 : 코난
답안지 입력 : 11311

 *** 성적표 ***
이름 	1 2 3 4 5	점수
홍길동	O X X O O	60
코난 	O O X O O	80

*/