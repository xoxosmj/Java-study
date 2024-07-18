package inheritance;

enum ColorEnum {
	RED,GREEN,BLUE
}


//
class Final {
	public final String FRUIT = "사과"; // 상수화
	public final String FRUIT2; // 상수화

	public static final String ANIMAL = "호랑이"; // 스태틱으로 선언해서 Final.ANIMAL로 바로접근 가능
	public static final String ANIMAL2;
	

//	public static final int RED = 0;
//	public static final int GREEN = 1;
//  public static final int BLUE = 2;

	static {
		ANIMAL2 = "기린"; // 스태틱 구s역에서 초기화

	}

	public Final() { // 생성자. 초기값을 줌.
		FRUIT2 = "딸기";
		// ANIMAL2; ="기린";//err--스태틱은 생성자에서 초기화가 안댐
	}
}

public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		System.out.println(AGE);

		final String NAME;
		NAME = "홍";
		System.out.println(NAME);

		Final f = new Final();

		System.out.println(f.FRUIT);
		System.out.println(f.FRUIT2);
		System.out.println(Final.ANIMAL);
		System.out.println(Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = "+ColorEnum.RED.ordinal()); //숨어있는값을 보여줌 ordinal() 
		System.out.println();
	
		
		for(ColorEnum data:ColorEnum.values()) {
			System.out.println(data.ordinal()+ " : " +data);
		}
	
	
	}

}
