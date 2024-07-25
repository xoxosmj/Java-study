package member.service;

import member.bean.MemberDTO;
import member.dao.MemberDao;

import java.util.Scanner;

public class WriteService implements Member {

    @Override
    public void execute() {

        MemberDao dao = MemberDao.getInstance();

        Scanner scanner = new Scanner(System.in);
        String name, id, pwd, phone = null;
        System.out.print("이름을 입력하세요 : ");
        name = scanner.next();
        //아이디 중복체크
        //아이디를 검색(select)
        //메소드 작성, 리턴된 값이 true면 "사용중인 아이디 입니다" 하고 출력후 다시 입력 받음
        //false 면 "사용 가능한 아이디" 라고 출력하고 비밀번호입력란으로 간다

        while (true) {
            System.out.print("아이디를 입력하세요 : ");
            id = scanner.next();

            if (dao.isExistID(id)) {
                System.out.println("사용중인 아이디입니다");

            } else {
                System.out.println("사용가능한 아이디입니다");
                break;
            }
        }

        System.out.print("비밀번호를 입력하세요 : ");
        pwd = scanner.next();
        System.out.print("핸드폰 번호(010-xxxx-xxxx)를 입력하세요 : ");
        phone = scanner.next();


        MemberDTO dto = new MemberDTO(name, id, pwd, phone);
        dto.setName(name);
        dto.setId(id);
        dto.setPwd(pwd);
        dto.setPhone(phone);

        System.out.println("입력 완료");

        //DB - 싱글톤처리
        // new로 하면 계속 생성함


        //입력
        int su = dao.write(dto);

        System.out.println(su + "건의 회원 가입 완료");

    }

}




