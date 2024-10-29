package class__;

class StaticTest {
	int a; // 필드(초기화가 완료되어있음),new로 생성, 인스턴스 변수
	static int b; // 필드(초기화가 완료되어있음), static으로 잡아서 new 안해도 사용가능, 클래스 변수

	static {
		System.out.println("static 초기화 영역\n");
		b=7;
	}
	
	public StaticTest() {
		System.out.println("default 생성자");
		this.a = 7;
	}

	public void calc() {
		a++;
		b++;
	}

	public void disp() {
		System.out.println("a = " + this.a + "\t b = " + StaticTest.b);
	}

	public static void output() {
		System.out.println("static method...");
		// System.out.println("a = " + this.a + "\t b = " + StaticTest.b); --- error(static 메소드에서는 this를 참조 할 수 없다.)
	}
}

// --------
public class StaticMain {

	public static void main(String[] args) {
		// StaticTest st = new StaticTest();
		// System.out.println("a = " + st.a);
		// System.out.println("b = " + StaticTest.b);

		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();

		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();

		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output(); // 클래스명.메소드로 호출가능
		aa.output(); // 객체명.메소드로도 호출가능
		
		
	}

} // class StaticMain
