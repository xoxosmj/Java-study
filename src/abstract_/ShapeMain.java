package abstract_;

import java.util.Scanner;

//추상클래스
abstract class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);

	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}

	public abstract void calcArea(); // 추상 메소드 자식클래스에서 override해서씀

	public abstract void dispArea();
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

	}

}
