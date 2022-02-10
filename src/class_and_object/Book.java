package class_and_object;

public class Book {

    //data member
    String name="Java";
    int pages=340;
    String writer="James Gosling";


    public static void main(String[] args) {

        //creating object : CLassName object_name= new ClassName();

        Book obj1 = new Book();

        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.writer);

        Book obj2 = new Book();

        System.out.println(obj2.name);
        System.out.println(obj2.pages);
        System.out.println(obj2.writer);

    }

}
