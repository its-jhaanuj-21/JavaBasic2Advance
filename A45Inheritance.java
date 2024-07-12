class Human { // Super class // Base Class // Parent class 
    
    private String name;
    int age;

    Human(){
        System.out.println("Human class Constructor");
    }

    void sleep(){
        age = 18;
        name = "Anuj";
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human{ // child class // Sub Class // Derived Class
    void disp(){
        System.out.println(" The age is: "+ age);
        // System.out.println("The name is : "+name);   // Child class can't access private member of parent 
    }
}

public class A45Inheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep(); // student can use sleep() method of its parent Human class
        st.disp();

    }
}
