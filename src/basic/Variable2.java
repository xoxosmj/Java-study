package basic;

public class Variable2 {
	int a; //필드 , 이미 초기화 되어있다 0으로
	static int b; //필드
	static String c; //클래스 타입의 초기값은 null
	
	// c = "apple"; -- error(모든 명령은 함수 안에 써야함) 
	
	public static void main(String[] args) {
		int a = 100; //local variable(지역변수), 쓰레기값이 존재하기때문에 반드시 초기화
		System.out.println(a);

		// int a; -- error 

		System.out.println("필드 a = " + new Variable2().a);
	//	System.out.println("필드 b = " + b);
		System.out.println("필드 b = " + Variable2.b);
		
		c = new String("apple");
		// c = "apple"; 리터럴 생성. String 클래스만 new를 안쓰고 바로 사용 가능
	}


}
