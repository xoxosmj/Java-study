package class__;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;                                    
import static java.lang.Math.*; // 와일드카드, 모든 것(all) - 비추천
import static java.util.Arrays.sort;
import static java.lang.System.out;

import java.util.Arrays;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + random());
		out.println("2의 5승 = " + pow(2, 5));

		int[] ar = { 25, 78, 32, 40, 55 };
		sort(ar);
		for (int data : ar)
			out.print(data + "  ");

		out.println();

		String[] ar2 = { "apple", "strawberry", "Applemango", "pipneapple", "tomato" };
		sort(ar2);
		for (String data : ar2)
			out.print(data + "  ");

	}

}
