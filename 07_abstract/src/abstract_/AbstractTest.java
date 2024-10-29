package abstract_;

public abstract class AbstractTest { //POJO형식 (Plain Old Java Object)
	String name;

	
	public AbstractTest() {}
	
	public AbstractTest(String name) {
		super();
		this.name = name;
	}

	public String getName() { //구현
		return name;
	}

	public abstract void setName(String name); //추상메소드
	//추상 메소드를 가지면 그 클래스도 추상 클래스여야 한다 
	//하지만 추상클래스를 만들엇다고해서 추상메소드를 반드시 포함해야되는건 아니다

}
