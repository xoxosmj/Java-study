package multiArray;

public class MultiArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = { "홍길동", "프로도", "라이언" };
		int[][] jumsu = { { 90, 95, 100 }, { 100, 89, 76 }, { 75, 80, 48 } };
		int[] sum = new int[3];
		double[] avg = new double[3];
		char[] grade = new char[3];

		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu[i].length; j++) {
				sum[i] += jumsu[i][j];
			}
			avg[i] = sum[i] / 3.0;
			if (avg[i] >= 90)
				grade[i] = 'A';
			else if (avg[i] >= 80)
				grade[i] = 'B';
			else if (avg[i] >= 70)
				grade[i] = 'C';
			else if (avg[i] >= 60)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}

		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "학점");
		for (int i = 0; i < grade.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < grade.length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.print(sum[i] + "\t");
			System.out.printf("%.2f\t", avg[i]);
			System.out.println(grade[i]);
		}

	}
}

/*
 * [문제] 성적 계산
 * 
 * 1. 공식 총점 = 국어 + 영어 + 수학 평균 = 총점 / 과목수 학점은 평균이 90이상이면 A 80이상이면 B 70이상이면 C
 * 60이상이면 D 그 외는 F
 * 
 * 2. 평균은 소수이하 2째자리까지 출력
 * 
 * ---------------------------------------------------- 이름 국어 영어 수학 총점 평균 학점
 * ---------------------------------------------------- 홍길동 90 95 100 프로도 100 89
 * 76 라이언 75 80 48 ----------------------------------------------------
 */