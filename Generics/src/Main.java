import genericClass.MyClass;
import genericClass.SecondClass;
import wildcard.Person;
import wildcard.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Class
        MyClass<Integer, String, Boolean> myClass = new MyClass<>(35,"text", true);
        SecondClass<Integer> secondClass = new SecondClass<>();

        //Method
        showInfo(13);
        showInfo("Hello World");
        showInfo(new Object());


        //WildCard
        ArrayList<Student> listStudent = new ArrayList<>();
        ArrayList<Person> listPerson = new ArrayList<>();

        Person p = new Person();
        p.name="John";

        Student s = new Student();
        s.name="David";
        s.idNumber="25/2";

        listPerson.add(p);
        listStudent.add(s);

        show(listPerson);
        show(listStudent);

    }

    //Method
    static <T> void showInfo(T value) {
        System.out.println(value.getClass().getSimpleName() + " = "+ value);
    }

    //WildCard for child
    static void show(ArrayList<? extends Person> os){
        for(Person o:os) {
            System.out.println(o.name);
        }
    }

    //WildCard for parent
//    static void show(ArrayList<? super Student> os){
//        for(Object o:os) {
//            System.out.println(o);
//        }
//    }
}
