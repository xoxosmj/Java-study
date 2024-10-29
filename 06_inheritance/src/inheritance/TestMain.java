package inheritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : " + a + " ");
	}
}

class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB aa = new BB();
		aa.disp(); //BB:13
		System.out.println("aa : "+aa.a); //aa:13
		System.out.println();
		
		AA bb = new BB(); // 부모가 자식클래스를 참조(캐스팅),다형성
		bb.disp(); //오버라이딩을 시키면 무조건 우선권을 자식이 가짐
		System.out.println("bb : "+bb.a); //오버라이드는 메소드에만 해당되기때문에 변수는 AA에서 출력됨
		System.out.println();
		
		BB cc = (BB)bb;
		cc.disp();
		System.out.println("cc : "+cc.a);
		
		AA dd = new AA();
		dd.disp(); // 8 부모는 자식의 존재를알수없음 부모클래스를 잡으면 부모만 잡힘.
		System.out.println("dd : "+dd.a);
		System.out.println();

		BB ee = (BB)dd; // 부모만 잡앗기 때문에 형변환이 불가능 ClassCastException
	}

}
