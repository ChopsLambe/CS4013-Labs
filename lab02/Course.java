package lab02;

public class Course {
	  private String courseName;
	  private String[] students = new String[4];
	  private int numberOfStudents;

	  public Course(String courseName) {
	    this.courseName = courseName;
	  }

	  /** this code takes a students name and adds it to the array */
		public void addStudent(String student) {
			if (numberOfStudents == students.length) {
					resizeArray();
			}
	    students[numberOfStudents] = student;
	    numberOfStudents++;

	  }
		/** resizes the size of the array */
		private void resizeArray(){
			String[] bigger = new String[students.length * 2];
		 	for(int i = 0; i < students.length; i++){
			 		bigger[i] = students[i];
			 }
		 	students = bigger;
	 }
	 	public void printStudents(){
			for (int i = 0; i < students.length; i++){
	            if(students[i] != null){
	                System.out.println(students[i]);
	      }

		}
	  }
	  /** returns the array of students */
		public String[] getStudents() {
	    return students;
	  }

	  /** returns how many students are in the list */
		public int getNumberOfStudents() {
	    return numberOfStudents;
	  }

	  /** returns the course name */
		public String getCourseName() {
	    return courseName;
	  }

	  /** removes student from array */
		public void dropStudent(String student){
			for (int i = 0; i <students.length ; i++ ) {
					if (students[i] == student) {
							students[i] = null;
							numberOfStudents--;
					}
			}
	  }
	 }
