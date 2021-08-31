package lab03;

public class TestResult {

double[] scores;
private String[][] table = { { "0", "NG" }, { "1", "F" }, { "30", "D2" }, { "35", "D1" }, { "40", "C3" },
    { "48", "C2" }, { "52", "C1" }, { "56", "B3" }, { "60", "B2" }, { "64", "B1" }, { "72", "A2" }, { "80", "A1" } };

public TestResult (int tests){
  scores = new double[tests];
}
public TestResult (){
  scores = new double[3];
}
public void setScore(int i, double value){
 scores[i] = value;
}
public double getScore(int i){
  return scores[i];
}
public  double getTotal(){
  double total = 0;
    for (int i = 0; i < scores.length; i++){
      total = total + scores[i];
    }
  return total;
}
public double getAverage(){
  return getTotal() / scores.length;
}
public String getGrade(){
  String g = "";
   for(int i = 0; i < table.length;i++){
			if(getAverage() <= Double.parseDouble(table[i][0])){
				g = table[i-1][1];
        break;
      }
	  } 
		if(getAverage() > Double.parseDouble(table[11][0])) {
			g = table[11][1];
    }
  return g;
}

  public String toString(){
    String result ="";
    for(int i = 0; i < scores.length; i++){
      result = scores[i] + "";
    }
    result = result + getGrade();
    return result + "\n";
  }
}
