package collection_demo;

import model.Student;

import java.util.HashSet;

public class SetStudebt {


    public void createSet(){

        HashSet <Student> studentHashSet= new HashSet<>();

        Student student= new Student("Raj",23,"CS");
        System.out.println(student.hashCode());
        Student student1= new Student("Raj",23,"CS");
        System.out.println(student1.hashCode());
        Student student2= new Student("Rahul",25,"CS");
        Student student3= new Student("Mukesh",25,"CS");
        System.out.println(student2.hashCode());


        studentHashSet.add(student);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);

        for (Student var: studentHashSet){

            System.out.println("Printing student obj "+var.getName() + " Hashcode "+var.hashCode());
        }
    }

    public static void main(String[] args) {
        SetStudebt obj = new SetStudebt();
        obj.createSet();
    }
}
