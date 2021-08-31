package lab02;

public class TestCourse {

	public static void main(String [] args){
		Course c1 = new Course ("cs");
		c1.addStudent("seanie");
		c1.addStudent("luke");
		c1.addStudent("mary");
		
		c1.dropStudent("luke");
		c1.printStudents();
		System.out.println(c1.getNumberOfStudents());
		
    
    
	}
}
