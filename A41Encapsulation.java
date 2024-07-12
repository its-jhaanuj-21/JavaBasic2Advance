/*
 *  Need of Encapsulation:
        • To the outside world, the data should not be exposed directly.
        • In order to provide the controlled access, we need to use "Encapsulation".

    What is Encapsulation?
        • Binding of data and corresponding methods into a single unit is called "Encapsulation"
        • If any java class follows data hiding and abstraction then such class is referred as "Encapsulated class".
        Encapsulation = Data Hiding + abstraction.
        
        Every data member inside the class should be declared as private, and to access this private data we need to 
        have setter and getter methods.

    Advantages of Encapsulation:
        a. We can achieve security.
        b. Enhancement becomes easy.
        c. Maintainability and modularisation becomes easy.
        d. It provides flexibility to the user to use the system very easily.

    Private members:
        • Our internal data should not go to the outside world directly, that is, outside people should not access our
        internal data directly.
        • By using private modifiers we can implement "data hiding"
        • Advantage of Data Hiding is security.
        • Recommended modifier for data members is private.

    Shadowing Problem and this keyword:
        • If both local variable and instance variable have the same name inside the method then it would 
        result in a name-clash and jvm will always give preference for local variable and if we try to print 
        that, that will show the default values. (null)
        • This approach is called the "Shadowing problem".

        • To resolve this problem we need to use "this" keyword.
        • "this" keyword would always point to current object, and this variable would hold the
        address the active object present in the heap memory. 
 */

class Student{
    private int age;            // Making pvt to empliment Data - Hiding 
    private String name;

    public void setAge(int age){     // Setter 
        this.age = age;     // this. keyword is use to set data in the instance variable of any particular object and elliminate shadowing problem 
    }
    public int getAge(){            // Getter
        return age;
    }

    public void setName(String name){  // Setter 
        this.name = name;
    }
    public String getName(){     // Getter
        return name;
    }
}

public class A41Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setAge(21);
        s1.setName("Anuj Kumar Jha");

        s2.setAge(19);
        s2.setName("Aakash");
        
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getName());
    }
}
