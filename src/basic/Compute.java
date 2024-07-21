package basic;

import java.text.DecimalFormat;
//기본 패키지가 java.lang이기 때문에 아래의 문장은 쓸 필요가 없다.
import java.lang.String;
import java.lang.System;

public class Compute {

	
	public static void main(String[] args) {		
	/* 
	[문제] 변수를 이용하여 320(a), 258(b)의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
	[실행결과]
	320 + 258 = xxx
	320 - 258 = xxx
	320 * 258 = xxx  3자리마다 , 표시 
	320 / 258 = xxx  소수 이하 2째자리까지 출력하시오
	 */
	short a = 320;
	short b = 258;
	
	int sum = a+b;
	int sub = a-b;
	int mul = a*b;
	double div = (double)a/b;
	
	System.out.println(a + " + " + b + " = "+ sum);
	System.out.println(a + " - " + b + " = "+ sub);
	System.out.println(a + " * " + b + " = "+ new DecimalFormat().format(mul)); //static 이 아니라서 new해줘야함
	System.out.println(a + " / " + b + " = "+ String.format("%.2f", div)); 
	
	}

}

