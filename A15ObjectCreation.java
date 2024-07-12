public class A15ObjectCreation {

    int a;         // instance variable
    String name;   // instance variable
    public static void main(String[] args) {
        
        /*
         * We can use the "new" opeartor to create an object.
         * 
         * There is no delete operator in java because destruction of useless 
         * objects is the responsibility of the garbage collector.
         */
                        // new objerator
        A15ObjectCreation oc = new A15ObjectCreation();  // creation of object
        //   class   reference       // constructor
        oc.a=10;
        System.out.println(oc.a);

        // reference (oc) will get stack memory and all the instance varibale of class will allocate in Heap memory. 

        /*
         * New operator is a keyword which is used to create the object.
         * 
         * When we say a new operator, JVM would allocate memory on the heap area.
         * 
         * JVM will load the supplied class name data into the method area.
         * 
         * JVM will initialised the memory of its stance variable.
         * 
         * JVM will set the default value for instance variable based on the data type. 
         * Once the memory is set then the address of the object will be stored inside the reference variable.
         * 
         */
    }
}
