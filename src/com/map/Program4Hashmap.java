package com.map;


import java.util.*;

public class Program4Hashmap {

    public static void hashMap() {
        Map<String, String> studentBranch = new HashMap<>();
        studentBranch.put("S101", "CSE");
        studentBranch.put("S102", "ECE");
        studentBranch.put("S103", "CSE");

        Map<String, String> studentName = new HashMap<>();
        studentName.put("S101", "Rudra");
        studentName.put("S102", "kiran");
        studentName.put("S103", "Eswar");


/*
        studentBranch.keySet().forEach(student ->{
            if(studentBranch.get(student).equals("CSE")){
                System.out.println("Student Number : "+student + " name of CSE Branch candidates  : "+studentName.get(student));
       */

        //  OR

        Set<String> keys = studentBranch.keySet();
        Set<String> cseKeys = new HashSet<>();

        for (String key : keys) {
            if (studentBranch.get(key).equals("CSE")) {
                cseKeys.add(key);
            }
        }
        for (String cseKey : cseKeys) {
            System.out.println("sno : " + cseKey + "sname : " + studentName.get(cseKey));
        }
    }

    public static void main(String[] args) {
        hashMap();

    }

}
