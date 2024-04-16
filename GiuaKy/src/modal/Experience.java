package modal;

import java.io.Serializable;

public class Experience extends Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int ExpInYear;
	private String ProSkill;

	public Experience(int expInYear, String proSkill) {
		ExpInYear = expInYear;
		ProSkill = proSkill;
	}

	public Experience(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type,
			int ExpInYear, String ProSkill) {
		super(ID, FullName, BirthDay, Phone, Email, Employee_type);
		this.ExpInYear = ExpInYear;
		this.ProSkill = ProSkill;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("số năm kinh nghiêm: " + this.ExpInYear);
		System.out.println("Kĩ năng chuyên môn: " + this.ProSkill);
	}
}
