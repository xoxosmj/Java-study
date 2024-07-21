package array;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int[] ar;  //배열 선언
		ar = new int[10]; //배열 생성
		
		System.out.println("배열명 ar = " + ar); // 클래스명@16진수 로 나옴
		System.out.println("배열 크기 = "+ar.length);
		ar[0]= 25;
		ar[1]= 36;
		ar[2]= 42;
		ar[3]= 17;
		ar[4]= 95;
		
		for(int i=0; i<ar.length; i++) {
		System.out.println("ar[" + i + "] = " +ar[i]);
		} //for i
		System.out.println();
		System.out.println("거꾸로 출력");
		
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " +ar[i]);
		}
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 ==1)
				System.out.println("ar[" + i + "] = " +ar[i]);
			}
		
		System.out.println();
		
		System.out.println("첨자가 짝수인 것만 출력");
		
		for(int i=0; i<ar.length; i++) {
			if(i%2==0) System.out.println("ar[" + i + "] = " +ar[i]);
		}
		
		System.out.println();
		System.out.println("오름차순 정렬");
		
		Arrays.sort(ar);//SelectionSort 가 내장되어있음
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]  + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("확장 for문");
		for(int data : ar) { // ar.length 를 안써도 배열크기만큼 for문이 돈다
			System.out.print(data  + " ");
		}
		
	}
}
