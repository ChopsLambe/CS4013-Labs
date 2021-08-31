 package lab03;

public class StudentResult {

	private String id;
  private TestResult testResult;

	public StudentResult(String id){
		this.id = id;
	}
	public StudentResult(String id, int tests){
			this.id = id;
			this.testResult = new TestResult(tests);
	}
	public String getID(){
		return id;
	}
	public void addResult(int testId, double value){
		testResult.setScore(testId, value);
	}
	public String toString(){
    String result = "";
    for (int i = 0; i < testResult.scores.length; i++) {
      result = result + " " + testResult.getScore(i);
    }
    return getID() + " " + result + " " + testResult.getGrade() + "\n";
	}
}
