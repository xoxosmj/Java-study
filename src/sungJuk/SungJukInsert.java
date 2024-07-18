package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

import collection.PersonDTO;

public class SungJukInsert implements SungJuk {



	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);


		System.out.print("번호입력 : ");
		int no = scan.nextInt();
		System.out.print("이름입력 : ");
		String name = scan.next();
		System.out.print("국어입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학입력 : ");
		int math = scan.nextInt();

		SungJukDTO input = new SungJukDTO(no, name, kor, eng, math);
		input.calc();

		list.add(input);

		System.out.println("입력되었습니다");

		

	}

}
