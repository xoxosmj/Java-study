package school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolMainAnswer {
	private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";
    
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public SchoolMainAnswer() {
    	try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
    
    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
            System.out.println("       관리");
            System.out.println("********************");
            System.out.println("   1. 입력");
            System.out.println("   2. 검색");
            System.out.println("   3. 삭제");
            System.out.println("   4. 종료");
            System.out.println("********************");
            System.out.print("  번호 선택 : ");
            num = scan.nextInt();
            
            if(num==4) break;
            if(num==1) insertArticle();
            else if(num==2) selectArticle();
            else if(num==3) deleteArticle();
		}//while
		
	}//menu()

	private void deleteArticle() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		//DB
		getConnection();
		
		String sql = "delete school where name = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,name);
			int su = pstmt.executeUpdate();

            System.out.println(su + "개의 행이 삭제되었습니다.");
            
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try {
                if(pstmt != null) pstmt.close();
                if(con != null)con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
	}//deleteArticle()

	private void selectArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
	        System.out.println("    1. 이름 검색  ");
	        System.out.println("    2. 전체 검색  ");
	        System.out.println("    3. 이전메뉴 ");
	        System.out.println("********************");
	        System.out.print("  번호선택 : ");
	        num = scan.nextInt();
	        
	        if(num==3) break;
	        
	        System.out.println();
	        String name = null;
	        if(num==1) {
	        	System.out.print("검색할 이름 입력 : ");
		        name = scan.next();
	        }
	        
	        //DB
	        getConnection();
	        
	        String sql;
	        if(num==1)
	        	sql = "SELECT * FROM SCHOOL WHERE NAME LIKE ?";
	        else
	        	sql = "SELECT * FROM SCHOOL";
	        
	        try {
				pstmt = con.prepareStatement(sql);
				if(num==1) pstmt.setString(1, "%"+name+"%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print("이름 = " + rs.getString("name") + "\t");
					
					if(rs.getInt("code") == 1)
						System.out.println("학변 = " + rs.getString("value"));
					else if(rs.getInt("code") == 2)
						System.out.println("과목 = " + rs.getString("value"));
					else if(rs.getInt("code") == 3)
						System.out.println("부서 = " + rs.getString("value")); 
				}//while
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
	            try {
	            	if(rs != null) rs.close();
	                if(pstmt != null) pstmt.close();
	                if(con != null)con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        	
		}//while
		
	}//selectArticle()

	private void insertArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
	        System.out.println("    1. 학생  ");
	        System.out.println("    2. 교수  ");
	        System.out.println("    3. 관리자  ");
	        System.out.println("    4. 이전메뉴 ");
	        System.out.println("********************");
	        System.out.print("  번호선택 : ");
	        num = scan.nextInt();
	        
	        if(num==4) break;
	        
	        System.out.println();
	        String name = null;
	        String value = "";
	        System.out.print("이름 입력 : ");
	        name = scan.next();
	        
	        if(num==1) {
	        	System.out.print("학번 입력 : ");
	            value = scan.next();
	            
	        }else if(num==2) {
	        	System.out.print("과목 입력 : ");
	        	value = scan.next();
	        	
	        }else if(num==3) {
	        	System.out.print("부서 입력 : ");
	            value = scan.next();
	            
	        }
	        
	        //DB
	        getConnection();
	        
	        String sql = "insert into school values(?,?,?)";
	        try {
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, name);
	            pstmt.setString(2, value);
	            pstmt.setInt(3, num);
	            
	            int su = pstmt.executeUpdate();
	            
	            System.out.println(su + "개의 행이 삽입되었습니다.");
	            
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
	            try {
	                if(pstmt != null) pstmt.close();
	                if(con != null)con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
		}//while
		
	}//insertArticle()
	
	public static void main(String[] args) {
		SchoolMainAnswer schoolMainAnswer = new SchoolMainAnswer();
		schoolMainAnswer.menu();
		System.out.println("프로그램을 종료합니다");
	}

}





















