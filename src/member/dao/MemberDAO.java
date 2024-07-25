package member.dao;


import member.bean.MemberDTO;

import java.sql.*;
import java.util.Map;

public class MemberDAO {
    private static MemberDAO instance; //싱글톤처리

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    private MemberDAO() {
        try {
            Class.forName(driver);
            System.out.println("driver loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static MemberDAO getInstance() { //싱글톤처리, 생성자보다 밑에있어야함
        if (instance == null) { //static은 null이 실행시 한번밖에 안됨
            synchronized (MemberDAO.class) {
                instance = new MemberDAO();
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

    public int write(MemberDTO dto) {
        int su = 0;
        getConnection();
        String sql = "insert into member values(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getName());
            ps.setString(2, dto.getId());
            ps.setString(3, dto.getPwd());
            ps.setString(4, dto.getPhone());

            su = ps.executeUpdate(); // 집행

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

    public boolean isExistID(String id) {
        boolean exist = false;
        getConnection();
        String sql = "select 1 from member where id = ?";

        try {
            ps = con.prepareStatement(sql); //sql 문장 가이드를 잡고
            ps.setString(1, id); // 물음표에 데이터 맵핑
            rs = ps.executeQuery(); // 현재값을 받아와
            if (rs.next()) exist = true;
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
        return exist;
    }

    public boolean login(String id, String pwd) {
        boolean login = false;
        String sql = "select name from member where id = ? and pwd = ?";
        getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            if (rs.next()) login = true;
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
        return login;
    }

    public String loginname(String id, String pwd) {
        String loginname = null;
        try {
            con.prepareStatement("select name from member where id = ? and pwd = ?");
            ps.setString(1, id);
            ps.setString(2, pwd);
            rs = ps.executeQuery();

            if (rs.next()) loginname = rs.getString("name");
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
        return loginname;
    }

    public MemberDTO getMember(String id) {
        MemberDTO dto = null;
        getConnection();

        String sql = "select * from member where id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                dto = new MemberDTO();
                dto.setName(rs.getString("name"));
                dto.setId(rs.getString("id"));
                dto.setPwd(rs.getString("pwd"));
                dto.setPhone(rs.getNString("phone"));

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
        return dto;
    }

    public int update(Map<String, String> map) {
        int su = 0;
        getConnection();
        String sql = "update member set name=?, pwd=?, phone=? where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, map.get("name"));
            ps.setString(2, map.get("pwd"));
            ps.setString(3, map.get("phone"));
            ps.setString(4, map.get("id"));
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

    public int delete(String id, String pwd) {
        int su = 0;
        getConnection();
        String sql = "delete from member where id = ? and pwd = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pwd);
            su = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
}

