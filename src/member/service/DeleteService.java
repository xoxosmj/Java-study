package member.service;

import member.dao.MemberDAO;

import java.util.Scanner;

public class DeleteService implements Member {


    @Override
    public void execute() {
        MemberDAO dao = MemberDAO.getInstance();
        Scanner scanner = new Scanner(System.in);
        String id, pwd;
        boolean login = false;

        while (true) {
            System.out.println();
            System.out.print("탈퇴할 아이디 입력 : ");
            id = scanner.next();
            System.out.print("비밀번호 입력 : ");
            pwd = scanner.next();
            login = dao.login(id, pwd);
            if (!login) {
                System.out.println("아이디 혹은 비밀번호가 올바르지 않습니다");

            } else {
                int su = dao.delete(id, pwd);
                System.out.println(su + "개의 행이 삭제되었습니다");
                break;
            }

        }
    }//While
}
