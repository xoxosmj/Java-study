package member.main;


import member.service.LoginService;
import member.service.Member;
import member.service.WriteService;


import java.util.Scanner;


public class IndexMain {
   Member inter = null;


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println();
            System.out.println("***************");
            System.out.println("    1. 회원가입");
            System.out.println("    2. 로그인");
            System.out.println("    3. 회원정보수정");
            System.out.println("    4. 회원탈퇴");
            System.out.println("    5. 종료");
            System.out.println("***************");
            System.out.print("  번호 : ");
            option = scanner.nextInt();

            if (option == 5) break;

           if (option == 1)
               inter = new WriteService();
           else if (option == 2)
               inter = new LoginService();
           else if (option == 3){}

           inter.execute();

        }//while
    } //menu


    public static void main(String[] args) {
        IndexMain main = new IndexMain();
        main.menu();
        System.out.println("프로그램 종료");

    }
}

/* 데이터 : 이름(name), 아이디(id) , 비밀번호(pwd), 핸드폰(phone)
   테이블 : member
   컬럼 : name , 15자리
          id, 30자리
          pwd, 50자리
          phone, 20자리
* */