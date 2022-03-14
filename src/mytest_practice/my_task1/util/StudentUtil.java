package mytest_practice.my_task1.util;

import mytest_practice.my_task1.data.Student;
import mytest_practice.my_task1.data.StudentFee;
import mytest_practice.my_task1.data.Students_Marks;
import mytest_practice.my_task1.data.Subjects;

import java.util.Comparator;
import java.util.List;

public class StudentUtil {

    public void studentDetailsTask1A(List<Student> studentList) {
        System.out.println("Task 1: Print student rno, name, branch of 1st year students");
        int i = 1;
        for (Student st : studentList
        ) {
            if (st.getYear() == 1) {
                System.out.println("\nStudent " + i + "   : ");

                System.out.println("Student Rollno : " + st.getRollno());
                System.out.println("Student name : " + st.getName());
                System.out.println("Student Branch : " + st.getBranch());
                i++;
            }

        }
        System.out.println();
    }


    public void allStudentsTask1B(List<Student> students, List<StudentFee> studentFeeList) {
        System.out.println("\n Task 2: Print all students rno, name, branch, amount, date");
        System.out.println();

        for (int i = 0; i < students.size(); i += 1) {

            System.out.println("Student Rollno : " + students.get(i).getRollno());
            System.out.println("Student Name   : " + students.get(i).getName());
            System.out.println("Student Branch :  " + students.get(i).getBranch());
            System.out.println("Amount of fee paid :" + studentFeeList.get(i).getAmount());
            System.out.println("Date                :" + studentFeeList.get(i).getDate());

        }

   /*     for (Student student : students
        ) {

            System.out.println("Student Rollno : " + student.getRollno());
            System.out.println("Student Name   : " + student.getName());
            System.out.println("Student Branch :  " + student.getBranch());


            for (StudentFee studentFee : studentFeeList
            ) {


                System.out.println("AmountOf Fee paid : " + studentFee.getAmount());
                System.out.println("Date              :" + studentFee.getDate());

                System.out.println();
                continue;
            }

        }*/

    }

    public void allStudentsTask1C(List<Student> students, List<Subjects> subjects, List<Students_Marks> students_marks) {

        System.out.println();
        System.out.println("Task 3: Print all students rno, name, subjectName, marks");
        System.out.println();
        for (int i = 0; i < students.size(); i += 1) {
            System.out.println("Student RollNo :" + students.get(i).getRollno());
            System.out.println("Student Name :" + students.get(i).getName());

            for (int j = 0; j < subjects.size(); j += 1) {
                System.out.println("Subject Name :" + subjects.get(j).getSubjectName());
                System.out.println("Marks        :" + students_marks.get(j).getMarks());


            }
            System.out.println();
        }


/*
        for (Student student : students
        ) {
            for (Subjects subjects1 : subjects
            ) {
                for (Students_Marks students_marks1 : students_marks
                ) {
                    /////////////////////////////////////
                }

            }
        }*/


    }

    public void allStudentsTask1D(List<Student> students, List<Subjects> subjects, List<Students_Marks> students_marks) {

        students.sort(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        Integer i1 = o1.getYear();
                        Integer i2 = o2.getYear();
                        return i1.compareTo(i2);
                    }
                }
        );
        System.out.println();
        System.out.println("Task 4: Print all students rno, name, subjectName, marks order by year");
        System.out.println();
        for (int i = 0; i < students.size(); i += 1) {
            System.out.println("Student RollNo :" + students.get(i).getRollno());
            System.out.println("Student Name :" + students.get(i).getName());

            for (int j = 0; j < subjects.size(); j += 1) {
                System.out.println("Subject Name :" + subjects.get(j).getSubjectName());
                System.out.println("Marks        :" + students_marks.get(j).getMarks());


            }
            System.out.println();
        }


    }


}
