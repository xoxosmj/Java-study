package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑");
		list.add("사자");
		list.add("호랑"); // 중복허용
		// coll.add(25);
		// coll.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		for(int i =0; i<list.size(); i++)	{
			System.out.println(list.get(i));
		}

		System.out.println("----------------");
		
		for(String data : list) {
			System.out.println(data);
			
		}
	}
}
