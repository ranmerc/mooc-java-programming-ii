public class OneItemBox extends Box {

    private Item item;

    public OneItemBox() {
        this.item = null;
    }

    @Override
    public void add(Item item) {
        if (this.item == null) {
            this.item = new Item(item.getName());
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item == null) {
            return false;
        }

        return this.item.equals(item);
    }
}
