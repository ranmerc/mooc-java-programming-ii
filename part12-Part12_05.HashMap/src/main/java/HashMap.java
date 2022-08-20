import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int numberOfMaps;

    public HashMap() {
        values = new List[32];
        numberOfMaps = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);

        if (values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];

        for (Pair<K, V> pair : valuesAtIndex) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    // get List corresponding to that key i.e. List at hashValue index of internal
    // array
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);

        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }

    // get the index of required key from the particular hashvalue index list
    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        List<Pair<K, V>> currentList = values[fromIdx];

        for (int i = 0; i < currentList.size(); i++) {
            // consider one by one from the list
            Pair<K, V> pair = currentList.get(i);
            K key = pair.getKey();
            V value = pair.getValue();

            int hashValue = Math.abs(key.hashCode() % newArray.length);

            // get the list at the calculated hashvalue index
            List<Pair<K, V>> selectedList = newArray[hashValue];

            // create the list instant if list does not exists
            if (selectedList == null) {
                selectedList = new ArrayList<>();
            }

            // add the key value pair to the list
            selectedList.add(new Pair<>(key, value));
        }
    }

    private void grow() {
        // create new list
        List<Pair<K, V>>[] newValues = new List[values.length * 2];

        for (int i = 0; i < values.length; i++) {
            // copy the list at this index to the newArray
            /*
             * we don't copy directly index to index
             * because the size of new array is different from old one and
             * we want to distribute all the key-value pairs in that array
             * as evenly as possible
             */
            copy(newValues, i);
        }

        this.values = newValues;
    }

    public void add(K key, V value) {
        // if this was the key then which list in array would have it
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        // get the index if a key value pair already exists in that chosen list
        int index = getIndexOfKey(valuesAtIndex, key);

        // if the chosen list does not have the key value pair
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            numberOfMaps++;
        } else {
            // if the list already has the key value pair, overwrite the value at that key
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * numberOfMaps / values.length > 0.75) {
            grow();
        }
    }

    public Pair<K, V> remove(K key) {
        // get the list corresponding to the key
        List<Pair<K, V>> listAtIndex = getListBasedOnKey(key);
        // if the list is empty nothing to remove
        if (listAtIndex.size() == 0) {
            return null;
        }

        // get the index of the required key from the list
        int index = getIndexOfKey(listAtIndex, key);
        // if it does not exist on the list do nothing
        if (index < 0) {
            return null;
        }

        numberOfMaps--;

        // return pair value
        return listAtIndex.remove(index);
    }

    public int size() {
        return numberOfMaps;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            List<Pair<K, V>> listAtIndex = values[i];

            if (listAtIndex != null) {
                for (Pair<K, V> pair : listAtIndex) {
                    toReturn.append(pair.toString());
                    toReturn.append("\n");
                }
            }
        }

        return toReturn.toString();
    }
}
