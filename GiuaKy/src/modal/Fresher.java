package modal;

import java.io.Serializable;

public class Fresher extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Graduation_date;
	private String Graduation_rank;
	private String Education;

	public Fresher() {
	}

	public Fresher(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type,
		String Graduation_date, String Graduation_rank, String Education) {
		
		super(ID, FullName, BirthDay, Phone, Email, Employee_type);
		this.Graduation_date = Graduation_date;
		this.Graduation_rank = Graduation_rank;
		this.Education = Education;
	}

	public void showinfo() {
		super.showInfo();
		System.out.println("Thời gian tốt nghiệp: " + this.Graduation_date);
		System.out.println("Xếp loại tốt nghiệp: " + this.Graduation_rank);
		System.out.println("Trường tốt nghiệp: " + this.Education);
	}
}
