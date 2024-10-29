package array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {30,36,25,45,28};
		// int[] ar;
		// ar = {25,36,30,45,28} ---error 
		System.out.println("정렬 전 : ");
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		//BubbleSort
		int temp;
			for(int i = 0; i<ar.length-1; i++) {
				for(int j = 0; j<ar.length-1-i; j++) {
					if(ar[j]<ar[j+1]) { 
						temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1] = temp;
							}
					}
				}		
					
		System.out.println("정렬 후 : ");
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

}
