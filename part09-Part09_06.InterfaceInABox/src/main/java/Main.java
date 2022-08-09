
public class Main {

    public static void main(String[] args) {
        // test your classes here
        // small box
        Box box1 = new Box(10);

        box1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box1.add(new Book("Robert Martin", "Clean Code", 1));
        box1.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        // small box
        Box box2 = new Box(20);
        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println("Smaller Box 1: " + box1);
        System.out.println("Smaller Box 2: " + box2);

        // big box
        Box biggerBox = new Box(30);
        // add small box to big box
        // example of polymorphism
        biggerBox.add(box1);
        biggerBox.add(box2);

        System.out.println("Bigger Box: " + biggerBox);
    }

}
