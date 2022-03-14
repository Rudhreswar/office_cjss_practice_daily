package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Govinda");
        al.add("Srinivasa");
        al.add("lakshmi");
        al.add("bibi");
        al.add("Hara");


        System.out.println("Printing list elements through For Each loop");
        for (String str : al
        ) {
            System.out.println("\n" + str);
        }
        Stream<String> namesStream = al.stream();
        //Stream<String> hariNames=namesStream.filter();


    }
}
