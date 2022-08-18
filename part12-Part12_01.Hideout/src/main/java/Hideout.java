public class Hideout<T> {

    private T obj;

    public Hideout() {
        obj = null;
    }

    public void putIntoHideout(T toHide) {
        obj = toHide;
    }

    public T takeFromHideout() {
        T toReturn = obj;
        obj = null;
        return toReturn;
    }

    public boolean isInHideout() {
        if (obj == null) {
            return false;
        }

        return true;
    }
}
