package mytest_practice.my_task1.data;


public class Student {

    public Student() {
        
    }

    private String rollno;
    private String name;
    private String branch;
    private int year;


    @Override
    public String toString() {
        return "Student{" +
                "rollno='" + rollno + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                '}';
    }

    public Student(String rollno, String name, String branch, int year) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
