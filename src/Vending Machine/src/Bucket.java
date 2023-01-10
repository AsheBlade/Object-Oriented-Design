import java.util.Collection;
import java.util.List;

public class Bucket<T1, T2> {

    private Item item;
    private int noteList;

    public Bucket(Item item, int noteValue) {
        this.item = item;
        this.noteList = noteValue;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
