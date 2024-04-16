package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connet {
	   public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/quanlinhanvien"; 
	        String user = "root"; 
	        String password = ""; 

	   
	        try (Connection connection = DriverManager.getConnection(url, user, password)) {
	            System.out.println("Kết nối với cơ sở dữ liệu thành công!");

	           
	            String insertQuery = "INSERT INTO employees (ID, FullName, BirthDay, Phone, Email, Employee_type, ExpInYear, ProSkill) VALUES ('1', 'Le Huyen', '2005-7-21', '0123456789', 'lehuyenxinhdep@gmail.com', 'Experience', 5, 'Java')";

	          
	            try (Statement statement = connection.createStatement()) {
	                int rowsAffected = statement.executeUpdate(insertQuery);
	                if (rowsAffected > 0) {
	                    System.out.println("Thông tin nhân viên đã được thêm vào cơ sở dữ liệu.");
	                } else {
	                    System.out.println("Không thể thêm thông tin nhân viên vào cơ sở dữ liệu.");
	                }
	            } catch (SQLException e) {
	                System.out.println("Lỗi khi thực thi câu truy vấn INSERT: " + e.getMessage());
	            }

	          
	            String selectQuery = "SELECT * FROM employees";
	        
	            try (Statement statement = connection.createStatement();
	                 ResultSet resultSet = statement.executeQuery(selectQuery)) {
	                while (resultSet.next()) {
	                    String ID = resultSet.getString("ID");
	                    String fullName = resultSet.getString("FullName");
	                    String birthDay = resultSet.getString("BirthDay");
	                    String phone = resultSet.getString("Phone");
	                    String email = resultSet.getString("Email");
	                    String employeeType = resultSet.getString("Employee_type");
	                    int expInYear = resultSet.getInt("ExpInYear");
	                    String proSkill = resultSet.getString("ProSkill");

	                    // Hiển thị thông tin nhân viên
	                    System.out.println("ID: " + ID);
	                    System.out.println("Họ và tên: " + fullName);
	                    System.out.println("Ngày sinh: " + birthDay);
	                    System.out.println("SDT: " + phone);
	                    System.out.println("Email: " + email);
	                    System.out.println("Loại nhân viên: " + employeeType);
	                    System.out.println("Số năm kinh nghiệm: " + expInYear);
	                    System.out.println("Kỹ năng chuyên môn: " + proSkill);
	                    System.out.println("--------------------------------");
	                }
	            } catch (SQLException e) {
	                System.out.println("Lỗi khi thực thi câu truy vấn SELECT hoặc đọc kết quả: " + e.getMessage());
	            }
	        } catch (SQLException e) {
	            System.out.println("Không thể kết nối với cơ sở dữ liệu: " + e.getMessage());
	        }
	    }
}
