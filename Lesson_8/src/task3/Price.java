package task3;

public class Price {
    String name;
    String shopName;
    String cost;

    public Price (String name, String shopName, String cost) {
        this.name = name;
        this.shopName = shopName;
        this.cost = cost;
    }

    public String toString() {
        return "Product name: " + name + ", shop name: " + shopName + ", cost: " + cost;
    }
}
