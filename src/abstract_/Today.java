package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);

		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();

		// 내 생일 => 19910505 => yyyyMMddHH
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHH");
		Scanner scan = new Scanner(System.in);
		System.out.print("생일 날짜 입력 (yyyyMMddHH) : ");
		String birth = scan.next();

		Date birth_date = input.parse(birth); // String =>Date 변환
		System.out.println("내 생일 : " + sdf.format(birth_date));
		System.out.println();

		//시스템의 날짜와 시간을 기준으로 생성
		// Calendar cal = new Calendar();
		//Calendar cal = new GregorianCalendar(); //추상이라 subclass이용해서 생성
		Calendar cal = Calendar.getInstance(); // 메소드 이용
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String weekOfDay = null;
		switch(week) {
		case 1:
			weekOfDay = "일"; break;
		case 2:
			weekOfDay = "월"; break;
		case 3:
			weekOfDay = "화"; break;
		case 4:
			weekOfDay = "수"; break;
		case 5:
			weekOfDay = "목"; break;
		case 6:
			weekOfDay = "금"; break;
		case 7:
			weekOfDay = "토"; break;
		
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+weekOfDay+"요일 "+hour+":"+minute+":"+second);
	
	}

}
