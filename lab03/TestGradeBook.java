package lab03;

public class TestGradeBook {
public static void main(String[] args) {
    GradeBook a = new GradeBook("cs4013", 1);
    GradeBook b = new GradeBook("cs4023", 1);
    a.addStudentResult("19264267", 0, 69);
    a.addStudentResult("poo", 0, 70);

    b.addStudentResult("19264267", 0, 2);
    b.addStudentResult("poo", 0, 96);

    System.out.println(a);
    System.out.println(b);
    }
}









