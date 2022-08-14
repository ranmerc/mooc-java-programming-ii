import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> personToAdd) {
        this.employees.addAll(personToAdd);
    }

    public void print() {
        // iterator is generic
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person personToPrint = iterator.next();
            System.out.println(personToPrint);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person personToPrint = iterator.next();

            if (personToPrint.getEducation() == education) {
                System.out.println(personToPrint);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person personToPrint = iterator.next();

            if (personToPrint.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
