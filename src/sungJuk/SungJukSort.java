package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	
//	public void menu() {
//		while(true) {
//		int num=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("********************");
//		System.out.println("1.총점으로 내림차순");
//		System.out.println("2.이름으로 오름차순");
//		System.out.println("3.이전 메뉴");
//		System.out.println("********************");
//		System.out.println("번호 입력 : ");
//		num = scan.nextInt();
//		if (num==3) { SungJukService sungJukService = new SungJukService();
//		sungJukService.menu();}
//		else if(num==1) { 
//					
//		}
//		else if(num==2) {}
//		
//		else continue;
//	
//		}
//		
//	}

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
//		SungJukSort sungJukSort = new SungJukSort();
//		sungJukSort.menu();
		Collections.sort(list);
		for(SungJukDTO sungJukDTO : list) {
			System.out.println(sungJukDTO);
		}
		
		
		
	}
	
	

}
