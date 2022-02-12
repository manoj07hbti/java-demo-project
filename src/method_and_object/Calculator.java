package method_and_object;

public class Calculator {

    // addition

    //Syntax : access_specifier return_type  method_name (parameter) {CODE}
   public void addition(){
      int a=10;
      int b=45;

      int result=a+b;

      System.out.println("Addition is "+result);

   }

    //subtraction
    //Syntax : access_specifier return_type  method_name (parameter) {CODE}
    public void subtraction(){
       int a=33;
       int b=4;
       int result=a-b;
       System.out.println("Subtraction is "+result);
    }

    //divide
    public void divide(){
       int a=100;
       int b=4;
       int result=a/b;
       System.out.println("Division is "+result);
    }

    //multiply a*b

    public static void main(String[] args) {

       Calculator obj= new Calculator();
       obj.addition();
       obj.subtraction();
       obj.divide();
    }
}
