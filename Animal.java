abstract class Animal { //Abstract class
    
    abstract void sound(); // Abstract method
}
class lion extends Animal { //Sub class
    
    void sound() { //Method overriding
    System.out.println("Lion Roar...!");
    }
}
class tiger extends Animal { //Sub class

    void sound(){ // Methos overriding
        System.out.println("Tiger Roar...!");
    }
}
class Main { // Main program
    public static void main(String[] args) {
        
        // Creating objects for both subclasses
        lion l = new lion();
        tiger t = new tiger();

        //Calling methods 
        t.sound();
        l.sound();


    }
}
