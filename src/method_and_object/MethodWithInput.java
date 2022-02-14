package method_and_object;

public class MethodWithInput {

 //Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void message(String name){

        String var=name+ " Welcome to java ";
        System.out.println("This is message method "+var);
    }

    public void checkEligiblity(int age){

        if (age>18){
            System.out.println("Eligible for voting ...");
        }
        else {
            System.out.println("Not Eligible ....");
        }

    }

    public void makeSquare(int number){

        int result= number*number;
        System.out.println("Square of given number is "+result);
    }

    public void test(String name , int age ){

        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }

    public static void main(String[] args) {

        MethodWithInput obj = new MethodWithInput();
        obj.message("Rahul");
        obj.checkEligiblity(21);
        obj.makeSquare(3);
        obj.test("Hello",23);

    }
}
