package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

    int year, mon, first, last = 0;


    public CalendarEx() {

        Scanner scan = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        this.year = scan.nextInt();
        System.out.print("월 입력 : ");
        this.mon = scan.nextInt();

    }

    public void calc() {
        System.out.println("calc() 메서드 시작: year=" + this.year + ", mon=" + this.mon);//디버깅
        Calendar cal2 = Calendar.getInstance(); //시스템 날짜 기준으로 생성
        cal2.set(this.year, this.mon - 1, 1); // ★Calendar 는 월을 0부터 시작함★
        this.first = cal2.get(Calendar.DAY_OF_WEEK);

//		cal2.set(this.year, this.mon, 0);
//		System.out.println("cal2 설정 확인: " + cal2.get(Calendar.YEAR) + "년 " + (cal2.get(Calendar.MONTH) + 1) + "월 " + cal2.get(Calendar.DATE) + "일");
//
        this.last = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
        // cal.add(Calendar.DAY_OF_MONTH, -1);

    }

    public void display() {

        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int count = 0;

        for (int i = 1; i < this.first; i++) {
            System.out.print("\t");
            count++;
            if (count >= 7) {
                System.out.println();
                count = 0;
            }
        }

        for (int i = 0; i < this.last; i++) {
            System.out.print(i + 1 + "\t");
            count++;
            if (count >= 7) {
                System.out.println();
                count = 0;

            }
        }

    }
}
