package com.tasks.task1.stream.students;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class PrintDetails {

    public void method() {
        Scanner scanner = new Scanner(System.in);

        { // TASK 1  Print student rno, name, branch, year

            List<Student> list_students = new ArrayList<>();


            System.out.println("Enter details Of Student ( rno,name,branch,year ) ");

            Student student1 = new Student();
            System.out.print("Enter Details of Student 1");
            System.out.print("\nRollNo :");
            student1.setRno(scanner.nextLine());
            System.out.print("      Name :");
            student1.setName(scanner.nextLine());
            System.out.print("      Branch :");
            student1.setBranch(scanner.nextLine());
            System.out.print("      Year  :");
            student1.setYear(Integer.parseInt(scanner.nextLine()));

            System.out.println();
            System.out.println(" Enter Student 2 Details : ");

            Student student2 = new Student();


            System.out.print("\nRollNo :");
            student2.setRno(scanner.nextLine());
            System.out.print("       Name :");
            student2.setName(scanner.nextLine());
            System.out.print("       Branch :");
            student2.setBranch(scanner.nextLine());
            System.out.print("       Year  :");
            student2.setYear(Integer.parseInt(scanner.nextLine()));


            System.out.println();
            Student student3 = new Student();

            System.out.println("Enter Student 3 Details : ");


            System.out.print("\nRollNo :");
            student3.setRno(scanner.nextLine());
            System.out.print("      Name :");
            student3.setName(scanner.nextLine());
            System.out.print("      Branch :");
            student3.setBranch(scanner.nextLine());
            System.out.print("       Year  :");
            student3.setYear(Integer.parseInt(scanner.nextLine()));


            System.out.println();
            System.out.println("Enter Student 4 Details : ");

            Student student4 = new Student();
            System.out.print("\nRollNo :");
            student4.setRno(scanner.nextLine());
            System.out.print("         Name :");
            student4.setName(scanner.nextLine());
            System.out.print("         Branch :");
            student4.setBranch(scanner.nextLine());
            System.out.print("         Year  :");
            student4.setYear(Integer.parseInt(scanner.nextLine()));


            list_students.add(student1);
            list_students.add(student2);
            list_students.add(student3);
            list_students.add(student4);

            // Task 1 Complete....,.


            // Task2  PRINT ALL STUDENTS rno, name, branch, amount, date


            List<StudentFee> studentFeeList = new ArrayList<>();
            StudentFee studentFee = new StudentFee();

            System.out.println();

            studentFee.setStudentList(list_students);
            System.out.println("Enter the Amount of Fee");
            studentFee.setAmount(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter the Date of fee Paid");
            studentFee.setDate(scanner.nextLine());

            studentFeeList.add(studentFee);

            // Task 2 Complete


// Subject Details i.e Task 3
            // Task 3 Print All Students rno, name, subject name, marks
            {
                List<Subject> list_subjects = new ArrayList<>();

                Subject sub1 = new Subject();

                sub1.setStudentListSub(list_students);
                System.out.println("Enter name of Subject1 :");
                sub1.setSubjectName(scanner.nextLine());
                System.out.println("Enter Number of Subject  :");
                sub1.setSubjectsNo(scanner.nextLine());

                Subject sub2 = new Subject();
                sub2.setStudentListSub(list_students);
                System.out.println("Enter name of Subject2 :");
                sub2.setSubjectName(scanner.nextLine());
                System.out.println("Enter Number of Subject  :");
                sub2.setSubjectsNo(scanner.nextLine());

                Subject sub3 = new Subject();
                sub3.setStudentListSub(list_students);
                System.out.println("Enter name of Subject3 :");
                sub3.setSubjectName(scanner.nextLine());
                System.out.println("Enter Number of Subject  :");
                sub3.setSubjectsNo(scanner.nextLine());

                Subject sub4 = new Subject();
                sub4.setStudentListSub(list_students);
                System.out.println("Enter name of Subject4 :");
                sub4.setSubjectName(scanner.nextLine());
                System.out.println("Enter Number of Subject  :");
                sub4.setSubjectsNo(scanner.nextLine());


                list_subjects.add(sub1);
                list_subjects.add(sub2);
                list_subjects.add(sub3);
                list_subjects.add(sub4);


                List<StudentMarks> list_students_marks = new ArrayList<>();
                StudentMarks studentMarks1 = new StudentMarks();
                System.out.println("Enter Subject1 Marks :");
                studentMarks1.setListStudentMarks(list_subjects);
                studentMarks1.setMarks(Integer.parseInt(scanner.nextLine()));

                StudentMarks studentMarks2 = new StudentMarks();

                System.out.println("Enter Subject2 Marks :");
                studentMarks2.setListStudentMarks(list_subjects);
                studentMarks2.setMarks(Integer.parseInt(scanner.nextLine()));


                StudentMarks studentMarks3 = new StudentMarks();

                System.out.println("Enter Subject3 Marks :");
                studentMarks3.setListStudentMarks(list_subjects);
                studentMarks3.setMarks(Integer.parseInt(scanner.nextLine()));

                StudentMarks studentMarks4 = new StudentMarks();

                System.out.println("Enter Subject3 Marks :");
                studentMarks4.setListStudentMarks(list_subjects);
                studentMarks4.setMarks(Integer.parseInt(scanner.nextLine()));

                list_students_marks.add(studentMarks1);
                list_students_marks.add(studentMarks2);
                list_students_marks.add(studentMarks3);
                list_students_marks.add(studentMarks4);

                //Printing Task One Values

                System.out.println("FIRST TASK : .................Using Streams.................................");
/*
                for (Student student : list_students
                ) {

                    if (student.getYear() == 1) {
                        System.out.println("\n Roll No : " + student.getRno() + ", Name Of Student : " + student.getName() + ",
                         Branch : " + student.getBranch() + ", year : " + student.getYear());
                    }
                }

 */

                list_students.forEach(student ->  System.out.println("\n Roll No : " + student.getRno() + "," +
                        " Name Of Student : " + student.getName() + ", Branch : " + student.getBranch() + ", year : " + student.getYear()));

                // Task 1 Print Complete

                // Printing Task 2 Values
            /*    System.out.println("SECOND TASK :............................................... ");

                for (Student student : list_students

                ) {
                    System.out.println("Student RollNo  :" + student.getRno() + "     Student Name : " + student.getName() + "     Student Branch" + student.getBranch());

                    for (StudentFee sf1 : studentFeeList
                    ) {
                        System.out.println("        Amount :" + sf1.getAmount() + "         Date Of Paid : " + sf1.getDate());
                    }*/

                System.out.println("SECOND TASK :...................Using Streams............................ ");

                list_students.forEach(student -> {
                    System.out.println("Student RollNo  :" + student.getRno() + "     Student Name : " + student.getName() + "     Student Branch" + student.getBranch());
                    studentFeeList.forEach(studentFee1 -> System.out.println("        Amount :" + studentFee1.getAmount() + "         Date Of Paid : " + studentFee1.getDate()));
                });

                // Task 2 Complete

                // Printing Task 3 values
/*
                System.out.println("Task 3 Values /...............................                       Task 3");
                for (Student s : list_students
                ) {

                    System.out.println("Student Roll no :" + s.getRno() + "    Student name :" + s.getName());
                    for (Subject subForEach : list_subjects
                    ) {
                        System.out.println("Name Of Subject : " + subForEach.getSubjectName());
                        for (StudentMarks sm : list_students_marks
                        ) {
                            System.out.println(" Marks  : " + sm.getMarks());
                        }
                    }

                }*/
            System.out.println("Third TASK :...................Using Streams............................ ");

            list_students.forEach(student -> {
                System.out.println("Student Roll no :" + student.getRno() + "    Student name :" + student.getName());
                list_subjects.forEach(subject -> {
                    System.out.println("Name Of Subject : " + subject.getSubjectName());
                    list_students_marks.forEach(studentMarks -> {
                        System.out.println(" Marks  : " + studentMarks.getMarks());
                    });
                });
            });

                // Task 3 Complete

                list_students.sort(
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
              //  System.out.println("Task Values : ................................................................Task 4");


                System.out.println();

     /*           for (Student s : list_students
                ) {

                    System.out.println("Student Roll no :" + s.getRno() + "    Student name :" + s.getName() + "   Year :" + s.getYear());
                    for (StudentMarks sm : list_students_marks
                    ) {

                        for (Subject subject : list_subjects
                        ) {
                            System.out.println("Marks  : " + sm.getMarks());
                        }
                    }

                }*/
                System.out.println("Task Values : .........................Using Streams.......................................Task 4");

                list_students.forEach(student -> {
                    System.out.println("Student Roll no :" + student.getRno() + "    Student name :" + student.getName());
                    list_subjects.forEach(subject -> {
                        System.out.println("Name Of Subject : " + subject.getSubjectName());
                        list_students_marks.forEach(studentMarks -> {
                            System.out.println(" Marks  : " + studentMarks.getMarks());
                        });
                    });
                });
            }
        }

    }

    public static void main(String[] args) {
        PrintDetails printDetails = new PrintDetails();
        printDetails.method();

    }
}
