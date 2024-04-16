package modal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManagerEmployee {
	
	private ArrayList<Employee> employees;
	
	public ManagerEmployee() {
		this.employees = new ArrayList<>();	
	}
	
	private boolean checkID(String ID) {
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                return true;
            }
        }
        return false;
    }
	// thêm nhân viên 
	public void addEmployee(Employee employee) {
		if(!checkID(employee.ID)) {
			this.employees.add(employee);
			employee.Employee_count++;
			System.out.println("Thêm thành công");
		}else {
			System.out.println("Thêm thất bại");
		}
	}
	
	// hiển thị nhân viên
	public void showAllEmployee() {
		if(employees.isEmpty()) {
			System.out.println("Không có sinh viên để hiển thị");
		}else {
			for(Employee employee : employees) {
				employee.showInfo();
				System.out.println(); // xuống hàng
			}
		}
	}
	
	// xóa nhân viên
	
	public void deleteEmployee(String id) {
		boolean timthay = false;
		for(int i = 0; i < employees.size(); i++) {
			 if (employees.get(i).ID.equals(id)) {
	                employees.remove(i);
	                timthay = true;
	                System.out.println("Xóa nhân viên thành công.");
	                break;
	          }
		}
		
		if(!timthay) {
			System.out.println("Không tìm thấy nhân viên có id này");
		}
	}
	
	// tìm kiếm nhân viên
	public void findEmployeeByID(String ID) {
        boolean timthay = false;
        for (Employee employee : employees) {
            if (employee.ID.equals(ID)) {
                employee.showInfo();
                timthay = true;
                break;
            }
        }
        if (!timthay) {
            System.out.println("Không tìm thấy nhân viên cần tìm");
        }
    }
	
	  public void writeToFile(String filename) {
	        try (FileOutputStream fileOut = new FileOutputStream(filename);
	             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
	            objectOut.writeObject(employees);
	            System.out.println("Thông tin nhân viên được thêm vào file thành công.");
	        } catch (IOException e) {
	            System.out.println("Lỗi ghi thông tin vào file: " + e.getMessage());
	        }
	    }

	  
	    public void readFromFile(String filename) {
	        try (FileInputStream fileIn = new FileInputStream(filename);
	             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
	            employees = (ArrayList<Employee>) objectIn.readObject();
	            System.out.println("Thông tin nhân viên đã được đọc.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Không thể đọc thông tin nhân viên từ file: " + e.getMessage());
	        }
	    }
	
}
