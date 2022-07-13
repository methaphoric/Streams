import genericClass.MyClass;
import genericClass.SecondClass;

import java.util.ArrayList;
import java.util.Iterator;

import wildcard.Person;
import wildcard.Student;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //class
        MyClass<Integer, String, Boolean> myClass = new MyClass(35, "text", true);
        SecondClass<Integer> secondClass = new SecondClass<>();

        //method
        showInfo(13);
        showInfo("Hello World");
        showInfo(new Object());

        //wildcard
        ArrayList<Student> listStudent = new ArrayList();
        ArrayList<Person> listPerson = new ArrayList();

        Person p = new Person();
        p.name = "John";
        Student s = new Student();
        s.name = "David";
        s.idNumber = "25/2";

        listPerson.add(p);
        listStudent.add(s);

        show(listPerson);
        show(listStudent);
    }

    //method
    static <T> void showInfo(T value) {
        System.out.println(value.getClass().getSimpleName() + " = " + value);
    }

    //wildcard for child
    static void show(ArrayList<? extends Person> os) {
        for (Person o : os) {
            System.out.println(o.name);
        }
    }

    //wildcard for child
//    static void show(ArrayList<? super Student> os) {
//        for (Object o : os) {
//            System.out.println(o);
//        }
//    }

}
