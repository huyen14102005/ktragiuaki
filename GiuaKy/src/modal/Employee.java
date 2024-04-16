package modal;

public class Employee implements Interface {
		
	 protected String ID;
	    protected String FullName;
	    protected String BirthDay;
	    protected String Phone;
	    protected String Email;
	    protected String Employee_type;
	    protected int Employee_count;

	    
	    public Employee() {

		}
	    
	    public Employee(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type) {
	        this.ID = ID;
	        this.FullName = FullName;
	        this.BirthDay = BirthDay;
	        this.Phone = Phone;
	        this.Email = Email;
	        this.Employee_type = Employee_type;
	        this.Employee_count = 0;
	    }

	    
	    @Override
	    public void showInfo() {
	        System.out.println("ID: " + this.ID);
	        System.out.println("Họ và tên: " + this.FullName);
	        System.out.println("Ngày sinh: " + this.BirthDay);
	        System.out.println("SDT: " + this.Phone);
	        System.out.println("Email: " + this.Email);
	        System.out.println("Type: " + this.Employee_type);
	    }
	}
	  	  		  	
	   
		
