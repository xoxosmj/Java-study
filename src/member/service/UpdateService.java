package member.service;

import member.bean.MemberDTO;
import member.dao.MemberDao;

import java.util.Scanner;

public class UpdateService implements Member {

    MemberDao dao = MemberDao.getInstance();

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디로 검색 : ");
        String id = scanner.next();

        while (true) {
            if (dao.isExistID(id)) {

                System.out.println("수정 할 이름 입력 : ");
                String name = scanner.next();
                System.out.println("수정 할 비밀번호 입력 : ");
                String pwd = scanner.next();
                System.out.println("수정 할 핸드폰번호 입력 : ");
                String phone = scanner.next();

                MemberDTO dto = new MemberDTO(name, id, pwd, phone);
                int su = dao.update(dto);
                System.out.println(su+"개의 행을 수정하였습니다");
                break;
            } else System.out.println("검색 결과 없음");
        }
    }
}
