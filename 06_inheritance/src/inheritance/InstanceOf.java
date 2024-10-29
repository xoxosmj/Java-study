package inheritance;

class AAA {
}

class BBB extends AAA {
}

//---------

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB();

		AAA aa3 = aa;
		if (aa instanceof AAA)
			System.out.println("1. True");
		else
			System.out.println("1. False");

		AAA aa4 = bb; // 부모 = 자식
		if (bb instanceof AAA)
			System.out.println("2. True");
		else
			System.out.println("2. False");

		BBB bb2 = (BBB) aa2;
		if (aa2 instanceof BBB)
			System.out.println("3. True");
		else
			System.out.println("3. False");

		// BBB bb3 = (BBB)aa; // ClassCastException
		if (aa instanceof BBB)
			System.out.println("4. True");
		else
			System.out.println("4. False");
	}
}
