import java.util.ArrayList;
import java.util.List;

public class Reporting {
    private List<Auctionhouse> auctionHouses;

    public Reporting() {
        auctionHouses = new ArrayList<Auctionhouse>();
    }
    public void addAuctionHouse(Auctionhouse auctionHouse) {
        auctionHouses.add(auctionHouse);
    }

    public Item getHighestPriceItem() {
        Item highestPriceItem = null;
        double highestPrice = 0.0;
        for (Auctionhouse auctionHouse : auctionHouses) {
            for (Item item : auctionHouse.getSoldItems()) {
                if (item.getPrice() > highestPrice) {
                    highestPrice = item.getPrice();
                    highestPriceItem = item;
                }
            }
        }
        return highestPriceItem;
    }

    public Auctionhouse getAuctionHouseWithLargestAveragePrice(int year) {
        Auctionhouse largestAveragePriceAuctionHouse = null;
        double largestAveragePrice = 0.0;
        for (Auctionhouse auctionHouse : auctionHouses) {
            double averagePrice = auctionHouse.getAveragePriceInYear(year);
            if (averagePrice > largestAveragePrice) {
                largestAveragePrice = averagePrice;
                largestAveragePriceAuctionHouse = auctionHouse;

