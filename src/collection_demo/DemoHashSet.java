package collection_demo;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;

public class DemoHashSet {

    public void createHashSet(){

        //SYNTAX : CollectionName<Datatype> objName= New CollectionName();

        HashSet <String>  stringHashSet= new HashSet<>();

        stringHashSet.add("Java");
        stringHashSet.add("Java");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring Boot");

        for (String var : stringHashSet){

            System.out.println("Printing Hashset: "+var);
        }

    }

    public void createIntegerSet(){

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(1);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);

        for (Integer var: integerHashSet){

            System.out.println("Printing integerHashSet: "+var);
        }


    }
    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        obj.createHashSet();
        obj.createIntegerSet();
    }
}
