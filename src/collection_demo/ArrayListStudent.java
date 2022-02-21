package collection_demo;

import model.Student;

import java.util.ArrayList;

public class ArrayListStudent {

    public void createList(){

        //SYNTAX : CollectionName<Datatype> objName= New CollectionName();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // need to create Object of Student class

        Student student1= new Student("Rahul",33,"IT");
        Student student2= new Student("RAJ",34,"CS");
        Student student3= new Student("Ramesh",35,"IT");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        for (Student var : studentArrayList){

           System.out.println("Printing student Arraylist " +var.getName());
            System.out.println("Printing student Arraylist " +var.getRollNo());
            System.out.println("Printing student Arraylist " +var.getSection());
        }

    }

    public static void main(String[] args) {
        ArrayListStudent obj= new ArrayListStudent();
        obj.createList();
    }
}
