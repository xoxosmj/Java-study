package school.dao;

import java.sql.*;
import java.util.Scanner;

public class SchoolMain {
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";

    private Connection con; // 전역으로 빼준다
    private PreparedStatement ps;
    private ResultSet rs;

    public SchoolMain() {
        try {
            Class.forName(driver); // 진짜 클래스가아니라 class 타입임
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

    public void insertArticle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("1. 학생");
        System.out.println("2. 교수");
        System.out.println("3. 관리자");
        System.out.println("4. 이전메뉴");
        System.out.println("***************");
        System.out.println("번호 선택 : ");
        String name = null;
        String value = null;

        int menu = scanner.nextInt();

        if (menu == 4) return;

        switch (menu) {
            case 1:
                System.out.println("이름 입력 : ");
                name = scanner.next();
                System.out.println("학번 입력 : ");
                value = scanner.next();
                break;

            case 2:
                System.out.println("이름 입력 : ");
                name = scanner.next();
                System.out.println("과목 입력 : ");
                value = scanner.next();
                break;

            case 3:
                System.out.println("이름 입력 : ");
                name = scanner.next();
                System.out.println("부서 입력 : ");
                value = scanner.next();
                break;

        }

        getConnection();

        try {
            ps = con.prepareStatement("INSERT into school values (?,?,?)");
            ps.setString(1, name);
            ps.setString(2, value);
            ps.setInt(3, menu);
            int i = ps.executeUpdate();
            System.out.println(i + "개의 행이 삽입되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

       /* else if (menu == 1) {
            System.out.println("이름 입력 : ");
            String name = sc.next();
            System.out.println("학번 입력 : ");
            String studentID = sc.next();
            getConnection();
            try {
                ps = con.prepareStatement("INSERT into school values (?,?,'1')");
                ps.setString(1, name);
                ps.setString(2, studentID);

                int i = ps.executeUpdate();
                System.out.println(i + "개의 행이 삽입되었습니다.");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }//case 1

        else if (menu == 2) {
            System.out.println("이름 입력 : ");
            String name = sc.next();
            System.out.println("과목 입력 : ");
            String subject = sc.next();
            getConnection();
            try {
                ps = con.prepareStatement("INSERT into school values (?,?,'2')");
                ps.setString(1, name);
                ps.setString(2, subject);

                int i = ps.executeUpdate();
                System.out.println(i + "개의 행이 삽입되었습니다.");
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }//case 2

        else if (menu == 3) {
            System.out.println("이름 입력 : ");
            String name = sc.next();
            System.out.println("부서 입력 : ");
            String department = sc.next();
            getConnection();
            try {
                ps = con.prepareStatement("INSERT into school values (?,?,'3')");
                ps.setString(1, name);
                ps.setString(2, department);

                int i = ps.executeUpdate();
                System.out.println(i + "개의 행이 삽입되었습니다.");
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }//case 3*/

    public void selectArticle() {
        System.out.println("검색할 이름 입력 : ");
        String name = new Scanner(System.in).next();

        getConnection();

        try {
            ps = con.prepareStatement("select * From school where name = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();

                while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" + rs.getString("value") + "\t" + rs.getString("code"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteArticle() {
        System.out.println("삭제할 이름 입력 : ");
        String name = new Scanner(System.in).next();
        getConnection();

        try {
            ps = con.prepareStatement("DELETE FROM school where name = ?");
            ps.setString(1, name);
            int i = ps.executeUpdate();
            System.out.println(i + "개의 행이 삭제되었습니다");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("***************");
            System.out.println("\t관리");
            System.out.println("***************");
            System.out.println("1. 입력 ");
            System.out.println("2. 검색 ");
            System.out.println("3. 삭제 ");
            System.out.println("4. 종료 ");
            System.out.println("***************");
            System.out.print("번호 선택 : ");
            int menu = scanner.nextInt();

            if (menu == 4) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (menu == 1) {
                insertArticle();
            } else if (menu == 2) {
                selectArticle();
            } else if (menu == 3) {
                deleteArticle();
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }// while
    }


    public static void main(String[] args) {
        SchoolMain main = new SchoolMain();
        main.menu();
    }
}
