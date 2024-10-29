package collection;

public class PersonDTO extends Object implements Comparable<PersonDTO> { // 모든 자바 클래스는 extends Object 가 포함되어있음
	private String name;
	private int age;

	public PersonDTO() {
	}

	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 = " + name + "\t 나이 =" + age;
	}

	@Override
	public int compareTo(PersonDTO p) {
		// 나이로 오름차순
//		if (this.age < p.age)
//			return -1;
//		else if (this.age > p.age)
//			return 1;
//		else
//			return 0;

		// 나이로 내림차순
//		if (this.age < p.age)
//			return 1;
//		else if (this.age > p.age)
//			return -1;
//		else
//			return 0;

		// 이름으로 오름차순
		return this.name.compareTo(p.name) * -1;

	}

}
