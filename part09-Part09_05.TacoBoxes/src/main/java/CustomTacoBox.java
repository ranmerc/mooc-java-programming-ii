public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int number) {
        this.tacos = number;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos > 0) {
            this.tacos--;
        }
    }
}
