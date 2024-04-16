package modal;

public class MainAddFile {
    public static void main(String[] args) {
    	

    	 ManagerEmployee employeeManagement = new ManagerEmployee();

    	 Experience exp = new Experience("1", "Lê Huyền", "2005-3-31", "0123456789", "lehuyenxinhgai@gmail.com", "Experience", 5, "Java");
         Fresher fresher = new Fresher("2", "Thanh Hương", "2005-1-21", "9876543210", "thanhhuongxx@gmail.com", "Fresher", "2027-01-01", "Tốt", "Kỹ thuật phần mềm");
         Intern intern = new Intern("3", "Chu Hoang", "2005-06-17", "1212121212", "hoangcn@gmail.com", "Intern", "Kỹ thuật phầm mềm", "summer 2028", "VKU");

        
         employeeManagement.addEmployee(exp);
         employeeManagement.addEmployee(fresher);
         employeeManagement.addEmployee(intern);
         
         
         employeeManagement.writeToFile("D:\\DSA\\employee.txt");

        
         ManagerEmployee newEmployeeManagement = new ManagerEmployee();

         
         newEmployeeManagement.readFromFile("D:\\DSA\\employee.txt");

        
         newEmployeeManagement.showAllEmployee();
    }
}
