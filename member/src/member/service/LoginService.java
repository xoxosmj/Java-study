package member.service;

import lombok.NoArgsConstructor;
import member.dao.MemberDAO;

import java.util.Scanner;

@NoArgsConstructor

public class LoginService implements Member {


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        MemberDAO dao = MemberDAO.getInstance();
        while (true) {
            boolean login = false;
            System.out.println();
            System.out.print("아이디를 입력하세요 : ");
            String id = scanner.next();
            System.out.print("비밀 번호를 입력하세요 : ");
            String pwd = scanner.next();
            login = dao.login(id, pwd);
            if (login) {
                System.out.print(dao.loginname(id, pwd) + "님 로그인"); // 그냥 login(id,pw) 메서드가 사용자이름을 반환하게하고 반환값이 null이면 로그인실패 메세지 출력하는게 깔끔할듯
                break;

            } else
                System.out.println("아이디 혹은 비밀번호가 올바르지 않습니다");


        }

    }
}
