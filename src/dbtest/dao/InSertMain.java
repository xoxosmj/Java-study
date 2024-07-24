package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InSertMain {
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";

    private Connection con; // 전역으로 빼준다
    private PreparedStatement ps;

    public InSertMain() {
        try {
            Class.forName(driver);
            System.out.println("driver loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void insertArticle() {
      Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        String name = sc.next();
        System.out.println("나이 입력 : ");
        int age = sc.nextInt();
        System.out.println("키 입력 : ");
        double height = sc.nextDouble();

        //SQL
       this.getConnection(); // 호출

        try {
            ps = con.prepareStatement("INSERT into dbtest values(?,?,?,sysdate)"); // 생성
            //?에 데이터를 매핑(입력) 한다

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setDouble(3, height);

            int su = ps.executeUpdate(); // 실행 - 개수가 리턴됨
            System.out.println(su+"개의 행이 삽입되었습니다.");
        }catch (SQLException e){
            e.printStackTrace();
        } finally { // 에러가 있던없던 무조건 실행
            try {
                if(ps!=null) ps.close(); // 무조건 실행순서의 반대로 종료
                if(con!=null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void main(String[] args) {
       new InSertMain().insertArticle();

    }
}
