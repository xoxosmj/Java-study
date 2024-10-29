package inheritance;

public class Super {

	protected double weight, height; // protected는 부모와 자식 클래스에서 접근 가능
	
	public Super() {
		System.out.println("Super 기본 생성자");
		
	}
	
	public Super(double weight, double height) {
		System.out.println("Super 생성자");
		this.weight = weight;
		this.height = height;
				
	}
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}

	

	

}
