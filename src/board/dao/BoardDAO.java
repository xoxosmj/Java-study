package board.dao;

import board.bean.BoardDTO;

import java.net.SocketTimeoutException;
import java.sql.*;

public class BoardDAO {
    private static BoardDAO instance;

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    private BoardDAO() {
        try {
            Class.forName(driver);
            System.out.println("driver loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static BoardDAO getInstance() { //싱글톤처리, 생성자보다 밑에있어야함
        if (instance == null) { //static은 null이 실행시 한번밖에 안됨
            synchronized (BoardDAO.class) {
                instance = new BoardDAO();
            }
        }
        return instance;
    }


    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public int write(BoardDTO boardDTO) {
        int su = 0;
        getConnection();
        String sql = "insert into board_java values(Board_JAVA_SEQ.NEXTVAL,?,?,?,?,sysdate)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDTO.getId());
            ps.setString(2, boardDTO.getName());
            ps.setString(3, boardDTO.getSubject());
            ps.setString(4, boardDTO.getContent());
            su = ps.executeUpdate();
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

        return su;

    }

    public void list() {
        getConnection();
        String sql = "select * from board_java";
    }

    public void view(int choice) {
        getConnection();
        String sql = "select * from board_java where seq = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, choice);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("글번호 : " + rs.getInt("seq"));
                System.out.println("아이디 : " + rs.getString("id"));
                System.out.println("이름 : " + rs.getNString("name"));
                System.out.println("날짜 : " + rs.getDate("logtime"));
                System.out.println("제목 : " + rs.getString("subject"));
                System.out.println("내용 : " + rs.getString("content"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }


}
