package class_and_object;

public class Student {

    String name;
    int age;
    String section;

    // parameterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    // study
    public void studty(){

        System.out.println("This is Study method");
    }
    // play
    public void play(){

        System.out.println("This is Play method");
    }
    public static void main(String[] args) {

        // CLassName object_name= new ClassName(values1,value2 ...);

        Student student1= new Student("RaJ",21,"IT");
        student1.play();
        student1.studty();
        System.out.println(student1.name+" " + student1.age+"  " + student1.section);

        Student student2= new Student("Jatin",24,"CS");

        System.out.println(" Printing "+ student2.name +" "+student2.age +" "+student2.section);

    }


}
