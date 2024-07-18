package inheritance;

import java.util.Scanner;

class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);

	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}

	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}

	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
}

//-------

class SamTest extends ShapeTest {
	protected int base, height;

	public SamTest() {
		System.out.println("SamTest 기본생성자");

		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이:");
		height = scan.nextInt();
	}

	public void calcArea() {
		area = base * height / 2.;
	}

	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
		System.out.println();
	}
}
//사각형

class SaTest extends ShapeTest {
	protected int width, height;

	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();

	}

	public void calcArea() {
		area = width * height;
	}

	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
		System.out.println();
	}
}
//사다리꼴

class SadariTest extends ShapeTest {

	protected int top, bottom, height;

	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();

	}

	public void calcArea() {
		area = (top + bottom) * height / 2.;
	}

	public void dispArea() {
		System.out.println("사다리꼴 넓이 = " + area);
		System.out.println();
	}

}

public class ShapeMain {

	public static void main(String[] args) {
		/*
		SamTest sam = new SamTest(); // 1:1관계,결합도 100%
		//부모는 모든 자식클래스를 참조할수 있다(상속의 주 목적),다형성
		
		sam.calcArea();
		sam.dispArea();

		// 사각형

		SaTest sa = new SaTest();
		sa.calcArea();
		sa.dispArea();
		// 사다리꼴

		SadariTest sada = new SadariTest();
		sada.calcArea();
		sada.dispArea();
		 */
		
		ShapeTest shape;
		shape = new SamTest(); // 다형성, 부모=자식
		shape.calcArea();
		shape.dispArea();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
				
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		
		//다형성하려면 override 되어잇어야함
				
	}

}
