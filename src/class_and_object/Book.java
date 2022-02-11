package class_and_object;

public class Book {

    //data member
    String name="Java";
    int pages=340;
    String writer="James Gosling";
// methods
    //Syntax : access_specifier return_type  method_name (parameter) {CODE}
    //read
    public void read(){
        System.out.println("This is read method....");
    }

    //write
    public void wrtie (){
        System.out.println("This is Write method....");
    }

    public static void main(String[] args) {

        //creating object : CLassName object_name= new ClassName();

        Book obj1 = new Book();
        obj1.read();
        obj1.wrtie();
        System.out.println(obj1.name);
        System.out.println(obj1.pages);
        System.out.println(obj1.writer);

        Book obj2 = new Book();

        System.out.println(obj2.name);
        System.out.println(obj2.pages);
        System.out.println(obj2.writer);

    }

}
