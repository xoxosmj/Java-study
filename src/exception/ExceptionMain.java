package exception;

import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {
        if (args.length != 0) System.out.println("args[0] = " + args[0]);
        System.out.println();

        try {
            int num1 = Integer.parseInt(args[0]);

            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 입력 : ");
            int num2 = sc.nextInt();

            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

        } catch (NumberFormatException e) {
            System.out.println("숫자 형식으로 입력하세요");
            e.printStackTrace(); // 빨간// 색 에러메세지도 동봉
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다");
            e.printStackTrace();
        }finally {
            System.out.println("err가 있건 없건 무조건 실행!!!!!");
        }

    }
}
