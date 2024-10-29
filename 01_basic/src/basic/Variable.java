package basic;

public class Variable {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println(a);
		
		char b = 'A';
		System.out.println(b);
		
		char c = 65;
		System.out.println(c); //A
		
		// byte d = 300; -- error(byte는 -128~+127까지임)
		
		int e = 65;
		System.out.println(e);
		
		int f = 'A';
		System.out.println(f); //65
		
		long g = 25L; // long형 상수
		System.out.println(g);
			
		// float h = 43.8; -- error 실수형은 double 이 기본이라 에러
		
		// 첫번째 방법
		// float h = 43.8f; //float형 상수
		
		// 두번째 방법
		float h = (float)43.8; // Casting
		System.out.println(h);
		
	}

}

