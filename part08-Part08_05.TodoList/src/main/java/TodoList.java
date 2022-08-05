import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task) {
        this.todos.add(task);
    }

    public void print() {
        for (int i = 0; i < this.todos.size(); i++) {
            System.out.println((i + 1) + ": " + this.todos.get(i));
        }
    }

    public void remove(int number) {
        this.todos.remove(number - 1);
    }
}
