package Polymorphism.challenge;



//                construtor should initialze cylinders (number of) and name, and set wheels to 4
//        and engine to true. cylinders and names would be passed parameters
//        create appropriate getters


//        create some methods like startEngine, accelerate, and brake
//        show a message for each in the base class
//now create 3 sub classes for your favorite vehicles
//        override the appropriate methods to demonstrate polymorphism in use
//        put all classes in the one java file (this one).

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private String color;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> Engin is Started";
    }

    public String accelerate() {
        return "Car -> It's accelerating";
    }

    public String brake() {
        return "Car -> It's braking";
    }

    public int getCylinders() {
        return cylinders;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Corona extends Car {
    public Corona(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Corona -> Engine Started";
    }

    @Override
    public String accelerate() {
        return "Corona -> accelerating";
    }

    @Override
    public String brake() {
        return "Corona -> braking";
    }
}

class Surf extends Car {
    public Surf(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Surf -> starting";
    }

    @Override
    public String accelerate() {
        return "Surf -> accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getClass().getSimpleName() + " -> braked";
    }
}

class Lamborghani extends Car {
    public Lamborghani(int cylinders, String name) {
        super(cylinders, name);
    }
}

public class Main {
    public static void main(String[] args) {
//    Car car = new Corona();
//
//    car.accelerate();
//
//    Car lamborghani = new Lamborghani();
//    lamborghani.accelerate();

//    Car surf = new Surf(6, "Surf");
    Surf surf = new Surf(6, "Surf");
        System.out.println(surf.brake());

    }
}
