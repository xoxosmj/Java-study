package member.service;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateService implements Member {

    @Override
    public void execute() {
        MemberDAO dao = MemberDAO.getInstance();
        MemberDTO dto; //값을 다가져와야함

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("아이디로 검색 : ");
            String id = scanner.next();
            dto = dao.getMember(id);

            if (dto == null) {
                System.out.println("검색 결과 없음");

            } else {
                System.out.println(dto.getName() + "\t" + dto.getId() + "\t" + dto.getPwd() + "\t" + dto.getPhone());
                System.out.print("수정 할 이름 입력 : ");
                String name = scanner.next();
                System.out.print("수정 할 비밀번호 입력 : ");
                String pwd = scanner.next();
                System.out.print("수정 할 핸드폰번호 입력 : ");
                String phone = scanner.next();

                Map<String, String> map = new HashMap<>();
                map.put("name", name);
                map.put("id", id);
                map.put("pwd", pwd);
                map.put("phone", phone);

                int su = 0;
                su = dao.update(map);
                System.out.print(su + "개의 행을 수정하였습니다");
                break;
            }
        }
    }
}
