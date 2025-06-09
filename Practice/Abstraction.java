// Working of Abstraction in Java
abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        Gadgets remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}
