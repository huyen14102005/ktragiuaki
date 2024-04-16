package modal;

import java.io.Serializable;

public class Intern extends Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String Majors;
    private String Semester;
    private String University_name;
     
    public Intern() {
		
	}

	public Intern(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type, String Majors, String Semester, String University_name) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }
	
	 public void showInfo() {
	        super.showInfo();
	        System.out.println("Chuyên ngành: " + this.Majors);
	        System.out.println("Học kỳ: " + this.Semester);
	        System.out.println("Tên trường đại học: " + this.University_name);
	    }
}
