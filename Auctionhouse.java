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

    public double getAvgPriceForYear(int year) {
        double total = 0;
        int count = 0;
        for (item Item : soldItems) {
            if (Item.getYearSold() == year) {
                total += Item.getPrice();
                count++;
            }
        }
    }   if (count == 0) {
        return 0;
    }   else {
        return total / count;
    }

    public List<Item> getItemsWithPriceGreaterThan(double price) {
        List<Item> expensiveItems = new ArrayList<Item>();
        for (Item item : soldItems) {
            if (item.getPrice() > price) {
                expensiveItems.add(item);
            }
        }
        return expensiveItems;
    }

    public Item getHighestPricedItem() {
        Item highestPricedItem = null;
        for (Item item : soldItems) {
            if (highestPricedItem == null || item.getPrice() > highestPricedItem.getPrice()) {
                highestPricedItem = item;
            }
        }
        return highestPricedItem;
    }
    }
