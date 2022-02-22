package collection_demo;

import java.util.ArrayList;

public class DemoArrayList {

    //SYNTAX : CollectionName objName= New CollectionName();

    public void createArrayList(){

        ArrayList arrayList= new ArrayList();

        // add

        arrayList.add("Java"); // index 0
        arrayList.add("Spring");// 1
        arrayList.add("Spring Boot");// 2
        arrayList.add(33);
        arrayList.add(34.6);
        arrayList.add("Cloud");// 3

        // get(index);

        System.out.println("Printing 3 index element " +arrayList.get(3));
        System.out.println("Printing 2 index element " +arrayList.get(2));
        System.out.println("Printing 0 index element " +arrayList.get(0));

        for (int i=0; i< arrayList.size(); i++){
            System.out.println("FOR LOOP: Printing element "+ arrayList.get(i));
        }

        // advance for loop : for (Datatype var: array/collection){CODE}
        for (Object var : arrayList){
            System.out.println("ADVANCE LOOP: "+var);
        }

        // remove(index);

        arrayList.remove(0);

        System.out.println("Printin 0 "+arrayList.get(0));
    }

    public void createStringList(){
          //SYNTAX : CollectionName<Datatype> objName= New CollectionName();
       ArrayList <String> stringArrayList= new ArrayList<>();
       stringArrayList.add("Java");
       stringArrayList.add("Spring");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring");
       stringArrayList.add("Microservices");
       for (String var: stringArrayList){
           System.out.println("printing  String value "+var);
       }

    }

    public void createIntegerList(){

        //SYNTAX : CollectionName<Datatype> objName= New CollectionName();

        ArrayList <Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(33);
        integerArrayList.add(44);
        integerArrayList.add(55);
        for (Integer var: integerArrayList){
            System.out.println("printing  integerArrayList value "+var);
        }


    }

    public static void main(String[] args) {
        DemoArrayList obj= new DemoArrayList();
        obj.createArrayList();
        obj.createStringList();
        obj.createIntegerList();
    }
}
