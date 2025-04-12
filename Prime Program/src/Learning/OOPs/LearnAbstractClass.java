package Learning.OOPs;

public class LearnAbstractClass {

    public static void main(String[] args) {

    }
}

abstract class Vehicle {
    int speed;
    int speed(){   //Concrete method--- a method which is not abstract method(its normal method having its implementation as well) inside an abstract class
        return this.speed;
    }
    abstract void brake();
}

class Car extends Vehicle{
    @Override
    void brake() {
        System.out.println("Applying brakes inside the car.");
    }
}

class SuperCar extends Car{
    
}
