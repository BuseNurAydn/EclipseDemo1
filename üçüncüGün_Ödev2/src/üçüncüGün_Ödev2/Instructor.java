package üçüncüGün_Ödev2;

public class Instructor extends User {
	private int id;
	private String department;
	
	public Instructor() {
		
	}

	public Instructor(int id, String department) {
		super();
		this.id = id;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
