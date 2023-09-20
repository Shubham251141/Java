//1)	Write a Java program to show that private member of a super class cannot be accessed from derived classes. 
class Superclass {
    private int privateField;

    public Superclass(int value) {
        privateField = value;
    }

    public void display() {
        System.out.println("Value of privateField in Superclass: " + privateField);
    }
}

class Subclass extends Superclass {
    public Subclass(int value) {
        super(value);
    }

    public void accessPrivateField() {
    }
}

public class javabasics {
    public static void main(String[] args) {
        Subclass subObj = new Subclass(42);
        subObj.display(); // Accessing public method of Superclass
        subObj.accessPrivateField(); // Attempting to access private field
    }
}
