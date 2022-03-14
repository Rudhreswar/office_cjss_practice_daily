package mytest_practice.my_task1.test;

import mytest_practice.my_task1.data.Student;
import mytest_practice.my_task1.data.StudentFee;
import mytest_practice.my_task1.data.Students_Marks;
import mytest_practice.my_task1.data.Subjects;
import mytest_practice.my_task1.util.StudentUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestStudentClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollno("15691A03D4");
        student1.setName("RUDHRESWAR ENAMALA");
        student1.setBranch("MECHANICAL ENGINEERING");
        student1.setYear(1);

        Student student2 = new Student();
        student2.setRollno("15691A03D1");
        student2.setName("YUVASREE");
        student2.setBranch("MECHANICAL ENGINEERING");
        student2.setYear(2);

        Student student3 = new Student();
        student3.setRollno("15691A03D2");
        student3.setName("SREE");
        student3.setBranch("MECHANICAL ENGINEERING");
        student3.setYear(1);

        Student student4 = new Student();
        student4.setRollno("15691A0301");
        student4.setName("YUVA");
        student4.setBranch("MECHANICAL ENGINEERING");
        student4.setYear(1);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        TestStudentClass testStudentClass = new TestStudentClass();
        StudentUtil studentUtil = new StudentUtil();

        StudentFee studentFee1 = new StudentFee();

        studentFee1.setRollno(student1);
        studentFee1.setAmount(900000);
        studentFee1.setDate(new Date());

        StudentFee studentFee2 = new StudentFee();
        studentFee2.setRollno(student2);
        studentFee2.setAmount(800000);
        studentFee2.setDate(new Date());

        StudentFee studentFee3 = new StudentFee();
        studentFee3.setRollno(student3);
        studentFee3.setAmount(700000);
        studentFee3.setDate(new Date());

        StudentFee studentFee4 = new StudentFee();
        studentFee4.setRollno(student4);
        studentFee4.setAmount(600000);
        studentFee4.setDate(new Date());


        List<StudentFee> studentFeeList = new ArrayList<>();
        studentFeeList.add(studentFee1);
        studentFeeList.add(studentFee2);
        studentFeeList.add(studentFee3);
        studentFeeList.add(studentFee4);

// Add Subjects ..........................................

        Subjects subjects1 = new Subjects();
        subjects1.setSubjectNo("sub1");
        subjects1.setSubjectName("Maths");

        Subjects subjects2 = new Subjects();
        subjects2.setSubjectNo("sub2");
        subjects2.setSubjectName("Java");

        Subjects subjects3 = new Subjects();
        subjects3.setSubjectNo("sub3");
        subjects3.setSubjectName("Physics");

        Subjects subjects4 = new Subjects();
        subjects4.setSubjectNo("sub4");
        subjects4.setSubjectName("OracleSQL");
/*
        Subjects subjects5 = new Subjects();
        subjects5.setSubjectNo("sub5");
        subjects5.setSubjectName("SAP_HYBRIS");
*/
        List<Subjects> subjectsList = new ArrayList<>();
        subjectsList.add(subjects1);
        subjectsList.add(subjects2);
        subjectsList.add(subjects3);
        subjectsList.add(subjects4);
        //  subjectsList.add(subjects5);


        // Adding Students marks...................................................
        Students_Marks students_marks1 = new Students_Marks();
        students_marks1.setRollno(student1);
        students_marks1.setYear(student1);
        students_marks1.setSubjectNo(subjects1);
        students_marks1.setMarks(100);

        Students_Marks students_marks2 = new Students_Marks();
        students_marks2.setRollno(student2);
        students_marks2.setYear(student2);
        students_marks2.setSubjectNo(subjects2);
        students_marks2.setMarks(90);

        Students_Marks students_marks3 = new Students_Marks();
        students_marks3.setRollno(student3);
        students_marks3.setYear(student3);
        students_marks3.setSubjectNo(subjects3);
        students_marks3.setMarks(80);

        Students_Marks students_marks4 = new Students_Marks();
        students_marks4.setRollno(student4);
        students_marks4.setYear(student4);
        students_marks4.setSubjectNo(subjects4);
        students_marks4.setMarks(70);

        List<Students_Marks> students_marksList = new ArrayList<>();
        students_marksList.add(students_marks1);
        students_marksList.add(students_marks2);
        students_marksList.add(students_marks3);
        students_marksList.add(students_marks4);

        studentUtil.studentDetailsTask1A(studentList);
        studentUtil.allStudentsTask1B(studentList, studentFeeList);
        studentUtil.allStudentsTask1C(studentList, subjectsList, students_marksList);
        studentUtil.allStudentsTask1D(studentList, subjectsList, students_marksList);

    }
}
