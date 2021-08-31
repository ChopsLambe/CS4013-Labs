package lab03;
import java.util.*;

public class GradeBook {

private String name;
private int testNum;
private ArrayList<StudentResult> sr = new ArrayList<StudentResult>();

	public GradeBook(String name, int testNum){
		this.name = name;
		this.testNum = testNum;
	}
	public void addStudentResult(String id, int testId, double value){
		boolean found = false;
		for(StudentResult x : sr){
			if(id == x.getID()){
				x.addResult(testId, value);
				found = true;
				break;
			}
		}
		if(found == false){
			StudentResult a = new StudentResult(id, testNum);
			a.addResult(testId, value);
			sr.add(a);
		}
	}
	public String toString(){
		String result = "";
		for (int i = 0; i < sr.size(); i++) {
			result = result + sr.get(i);
		}
		return name + "\n" + result + "\n";
	}
}
