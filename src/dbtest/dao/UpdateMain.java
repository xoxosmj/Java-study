package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";
    private Connection con;
    private PreparedStatement ps;

    public UpdateMain() {
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
            e.printStackTrace();
        }
    }

    public void updateArticle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 입력 : ");
        String search = sc.next();

        getConnection(); // this.생략가능

        try {
            ps = con.prepareStatement("update dbtest set age=age+1 where name like ?");
            //?에 데이터를 매핑해야함

            ps.setString(1, "%" + search + "%");

            int su = ps.executeUpdate(); // 실행 및 실행 개수 리턴
            System.out.println(su +"개의 행이 삽입되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UpdateMain().updateArticle();


    }
 }

