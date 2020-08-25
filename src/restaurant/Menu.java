package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<MenuItem> item = new ArrayList<>();

    public static void main(String[] args) {
    }

    private ArrayList<MenuItem> addItem(MenuItem toAdd) {
        if (!item.contains(toAdd)) {
            this.item.add(toAdd);
        }
        return item;
    }

    private ArrayList<MenuItem> removeItem(MenuItem toRemove) {
        if (item.contains(toRemove)) {
            this.item.remove(toRemove);

        }
        return item;
    }

    private Date

}