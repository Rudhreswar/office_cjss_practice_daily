package com.tasks.task1.students.data;


public class Student {

    private String rno;
    private String name;
    private String branch;
    private int year;

    /*
        public Student(String rno, String name, String branch, int year) {
            this.rno = rno;
            this.name = name;
            this.branch = branch;
            this.year = year;
        }
    */
    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
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