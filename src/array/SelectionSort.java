package array;

public class SelectionSort {

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
		
		//SelectionSort
		
		int temp;
		for(int i = 0; i<ar.length-1; i++) {
			for(int j = i + 1; j<ar.length; j++) {
				//if(ar[i] > ar[j]) { // 오름차순
				if(ar[i] < ar[j]) { // 내림차순
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					
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
