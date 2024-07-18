package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionMain {

	@SuppressWarnings("all") // warning 억제,비추천
	public static void main(String[] args) {
		Collection coll = new ArrayList(); // 데이터가 배열처럼 들어감
		coll.add("호랑");
		coll.add("사자");
		coll.add("호랑"); // 중복허용
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");

		Iterator it = coll.iterator(); // 메소드를 통해 인터페이스 생성
		while (it.hasNext()) { // 항목이 없을때까지 반복
			System.out.println(it.next());

		}
	}

}
