package com.tasks.task1.students.data;

import com.tasks.task1.students.data.Student;

import java.util.List;

public class Subject {

    private List<Student> studentListSub;
    private String subjectsNo;
    private String subjectName;

    public List<Student> getStudentListSub() {
        return studentListSub;
    }

    public void setStudentListSub(List<Student> studentListSub) {
        this.studentListSub = studentListSub;
    }


    public String getSubjectsNo() {
        return subjectsNo;
    }

    public void setSubjectsNo(String subjectsNo) {
        this.subjectsNo = subjectsNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


}
