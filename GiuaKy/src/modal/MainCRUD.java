package modal;

public class MainCRUD {
	public static void main(String[] args) {
		ManagerEmployee employeeManagement = new ManagerEmployee();
		
		
		  	employeeManagement.addEmployee(new Experience("1", "Lê Huyền", "2005-3-31", "0123456789", "lehuyenxinhgai@gmail.com", "Experience", 5, "Java"));
	        employeeManagement.addEmployee(new Fresher("2", "Thanh Hương", "2005-1-21", "9876543210", "thanhhuongxx@gmail.com", "Fresher", "2027-01-01", "Tốt", "Kỹ thuật phần mềm"));
	        employeeManagement.addEmployee(new Intern("3", "Chu Hoang", "2005-06-17", "1212121212", "hoangcn@gmail.com", "Intern", "Kỹ thuật phầm mềm", "summer 2028", "VKU"));
	
	
	        
	        employeeManagement.showAllEmployee();
	        
	        employeeManagement.deleteEmployee("2");

	        // hiển thị thông tin sau khi xóa
	        employeeManagement.showAllEmployee();

	        // tìm theo id
	        employeeManagement.findEmployeeByID("1");

        	// hiên thị thông tin lại lần nữa khi
	        employeeManagement.showAllEmployee();
	    }
        	
	}
