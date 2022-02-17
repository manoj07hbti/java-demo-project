package method_and_object;

public class DemoReturnType {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public String message(){

        String test="JAVA";

        return  test;
    }

    public int getAge(){

        int age=23;

        return  age;
    }

    public int makeSquare(int number){

        int square= number*number;

        return square;
    }

    public static void main(String[] args) {

        DemoReturnType obj= new DemoReturnType();
        String var= obj.message();

      System.out.println("Output of message method is "+var );

       int age= obj.getAge();
       System.out.println("Age is "+age);

       int square=obj.makeSquare(6);
       System.out.println("Square of given number is "+square);

    }

}
