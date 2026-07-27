package java_collection_framework.collectionframework1;

import java.util.HashSet;

public class student {
    public int rollno;
    public String name;

    student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;

    }

   public static void main() {


     // ye mera coustom data hai
    HashSet<student> set= new HashSet<>();
    student s1 = new student(1, "tejus");
    student s2 = new student(1,"tejus");
    student s3 = new student(1 ,"tejus");

    set.add(s1);
    set.add(s2);
    set.add(s3);
        System.out.println(set);
         // yeh sara sb kuch print horhah hai but set toh ye krta hie nhi hai isliye hume generate me jake code edit krna padega and roll no ko band krna padega


}}

