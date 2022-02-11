package class_and_object;

public class Animal {

    // data member

    String breed;
    int weight;


/*TODO  Syntax : access_specifier return_type  method_name (parameter) {CODE}
    //access_specifier -> public , private , protected, default   THEORY PART
    //return_type   -> output of function or method :  void : no return type
    //method_name -> can be anything: it should be meaningful
    // parameter ->  input parameter : optional */

    // capabilities
    //eat

    public void eat (){

      System.out.println("This is eat method .......");
    }

    //run
    public void run(){
        System.out.println("This is Run method .......");
    }
    //play
    public void play(){
        System.out.println("This is Play method .......");

    }

    public static void main(String[] args) {
        Animal obj= new Animal();

        //How to call / execute methods ?
        // objName.MethodName();
        obj.eat();
        obj.run();
        obj.play();
    }
}
