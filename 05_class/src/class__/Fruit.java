package class__;

public class Fruit {
	private String pum = null;
	private int jan, feb, mar, tot = 0;
	private static int sumJan, sumFeb, sumMar = 0;

	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		
	
	}

	public void calcTot() {
		tot = jan + feb + mar;

		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;

	}

	public void display() {
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
	}

	public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar + "\t" + (sumJan + sumFeb + sumMar));
	}
}
