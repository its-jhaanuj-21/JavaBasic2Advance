/*
 * Rules to override a method:
 * 1. Can not decrease the visibility of the method  but can incrase.
 *    [ public > protected > default > private ] 
 *     Ex: if method in parent class is public then we can not make it private in child class while overriding
 *     Ex: if method in parent calss is private then we can make it public in child class.
 * 
 * 2. Return type should be same
 * 
 * 3. parameter signature should be same.
 * 
 */


class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");   // overriden method by PassengerPalne class 
    }
    public void fly(){
        System.out.println("Aeroplane is Flying"); 
    }
}
class CargoPlane extends Aeroplane{
    public void fly(){
        System.out.println("Cargo Plane is Flying...."); 
    }
    public void carryGoods(){
        System.out.println("Cargo plane Carrying Goods....");  // Specialized method
    }
}
class PassengerPlane extends Aeroplane{
    public void takeoff(){
        System.out.println("Passenger Plane is taking off....");
    }
    public void carryPassenger(){
        System.out.println("Passenger Plane Carrying Passenger....");
    }
}

public class A47MethosInheritedOverridenSpecialized {
    public static void main(String[] args){
        CargoPlane cp = new CargoPlane();
        cp.takeoff();  // inherited method
        cp.fly();      // overriding method
        cp.carryGoods(); // Specialized method

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.carryPassenger();

    }
}
