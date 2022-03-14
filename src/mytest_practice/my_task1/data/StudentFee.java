package mytest_practice.my_task1.data;


import java.util.Date;

public class StudentFee {

    public StudentFee(){

    }

    private Student rollno;
    private Date date;
    private double amount;


    @Override
    public String toString() {
        return "StudentFee{" +
                "rollno='" + rollno + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }



    public Student getRollno() {
        return rollno;
    }

    public void setRollno(Student rollno) {
        this.rollno = rollno;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StudentFee(Student rollno, double amount, Date date) {
        this.rollno = rollno;
        this.amount = amount;
        this.date = date;
    }



}