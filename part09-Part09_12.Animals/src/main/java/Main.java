
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        // Assigning a sub class object with super class reference object
        Animal cat = new Cat("Michi");

        // Cannot call purr() because it does not exist on super class (Animal)
        // cat.purr();

        // toString exists on super class
        // so the super class reference object is able to call the method
        // but it is overridden by sub class so instead of
        // calling super class's toString, it calls sub class toString
        cat.toString();
    }

}
