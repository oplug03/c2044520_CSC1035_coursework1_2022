
 public class Item {
//item fields
    private int lotNum;
    private string buyerName;
    private double price;
    private int yearSold;
    private string itemType;

// constructor

    public Item(int lotNum, string buyerName, double price, int yearsold, string itemType){
        this.lotNum = lotNum;
        this.buyerName = buyerName;
        this.price = price;
        this.yearSold = yearsold;
        this.itemType = itemType;

    }

    public int getLotNum() {
       return lotNum;
    }

    public string getBuyerName() {
        return buyerName;
    }


    public double getPrice() {
        return price;
    }

    public int getYearSold() {
        return yearSold;
    }

    public string getItemType() {
        return itemType;
    }
 }


