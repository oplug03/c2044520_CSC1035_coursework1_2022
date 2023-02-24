import java.util.ArrayList;
import java.util.list;

public class Auctionhouse {
    string name;
    list<item> SoldItems = new ArrayList<>();

    public Auctionhouse(string name) {
        this.name = name;

    }
    public void additem (item Item) {
        SoldItems.add(Item);

    }

    public string getName() {
        return name;

    }


}
