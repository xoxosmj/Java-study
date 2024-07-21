package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a , b;
		int dab;
		int count;
		String yn;
		
		while(true) {
				count = 0;
			for(int i = 1; i<=5; i++) {
				a = (int)(Math.random()* 90 + 10);
				b = (int)(Math.random()* 90 + 10);
		
				for(int j=1; j<=2; j++) { //틀리면 1번 더 기회
						System.out.print("[" + i + "번] "+a + " + " + b + " = ");
						dab = scan.nextInt();
						
						if(dab == a+b) {
							System.out.println("정답입니다.");
							count++;
							break; // for j 를 벗어나라
						}else {
							if (j==2) System.out.println("오답입니다. 정답은 " + (a+b)); // 2번다 틀렸을 경우
							else System.out.println("오답입니다.");
						}
				} //for j
					System.out.println();
					
					
			}
			
			System.out.println();
			System.out.println("당신은 총 " + count + "문제를 맞추어서 점수 "+ count*20 + "점 입니다.");
			
			
			System.out.println();
			do {
			System.out.println("또 할래(Y/N) : ");
			yn = scan.next();
			}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
			if(yn.equals("N") || yn.equals("n")) break;
				}
		System.out.println("프로그램을 종료합니다.");
		}
}
