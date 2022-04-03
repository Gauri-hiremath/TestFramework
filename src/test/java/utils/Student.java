package utils;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public String number;
    public static List<String> sList = new ArrayList<>();
    public Student(String sName,String sNumber){
        this.name = sName;
        this.number = sNumber;
    }

    public String toString(){
        return "Hello ! Student";
    }

    public static void main(String[] args) {
        Student s = new Student("Gauri","7896542135");
        System.out.println(s.toString());
        sList.add("Pune");
        sList.add("Mumbai");
        sList.add("Latur");
        sList.add("Punjim");
        System.out.println(sList.toString());
    }
}
