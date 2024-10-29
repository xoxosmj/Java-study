package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		// NumberFormat nf = new NumberFormat(); -err 추상임

		NumberFormat nf = new DecimalFormat();
		// DecimalFormat df = new DecimalFormat();

		// 3자리 마다 , 찍고 소수이하 3째자리까지 제공
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();

		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		// 유효숫자가 아닌것은 표현하지 않는다.
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0를 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//기본이 3자리마다 , 찍고 소수이하 3째자리 => 소수이하 2째자리로변경
		//메소드 이용해서 생성
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // W 표시
		nf4.setMaximumFractionDigits(2); //소수이하 2째자리까지 강제변경
		nf4.setMinimumFractionDigits(2); //0을 강제표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
	}

}
