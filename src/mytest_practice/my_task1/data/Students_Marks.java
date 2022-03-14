package mytest_practice.my_task1.data;


public class Students_Marks {


    private Student rollno;
    private Student year;
    private Subjects subjectNo;
    private int marks;

    public Students_Marks() {

    }

    public Students_Marks(Student rollno, Student year, Subjects subjectNo, int marks) {
        this.rollno = rollno;
        this.year = year;
        this.subjectNo = subjectNo;
        this.marks = marks;
    }


    public Student getRollno() {
        return rollno;
    }

    public void setRollno(Student rollno) {
        this.rollno = rollno;
    }

    public Student getYear() {
        return year;
    }

    public void setYear(Student year) {
        this.year = year;
    }

    public Subjects getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Subjects subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
