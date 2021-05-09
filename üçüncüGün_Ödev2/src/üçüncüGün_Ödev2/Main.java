package üçüncüGün_Ödev2;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor2 = new Instructor(26,"Yazılım Uzmanı");
		ınstructor2.setFirstName("Buse");
		ınstructor2.setLastName("Aydın");
		InstructorManager manager = new InstructorManager();
		manager.lading(ınstructor2);
		
	
		Student manager3 = new Student(296,"3.Günün Ödevi");
		manager3.setFirstName("Kübra");
		manager3.setLastName("Arslan");
		StudentManager student = new StudentManager();
		student.add(manager3);
		
		
		UserManager manager2 = new UserManager();
		manager2.entery(ınstructor2);
		manager2.entery(manager3);
		
	}

}
