public class Person implements Saveable {

    private String name, address;

    @Override
    public void save() {
        System.out.println(name + " saved!");
    }

    @Override
    public void delete() {
        System.out.println(name + " deleted!");
    }

    @Override
    public void load(String address) {
        System.out.println(name + " loaded!");
    }
}
