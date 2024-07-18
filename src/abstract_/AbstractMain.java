package abstract_;

public class AbstractMain extends AbstractTest {

	@Override
	public void setName(String name) {
		this.name = name;

	}

	public static void main(String[] args) {
		// AbstractTest at = new Abstract(); // err-- 추상클래스는 new가 불가능
		AbstractTest at = new AbstractMain();

		at.setName("홍길동"); //call
		// 부모 = 자식
		System.out.println("이름 = "+at.getName());

	}

}
