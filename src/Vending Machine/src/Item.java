// Represent the item in vending machine.
public enum Item {
    COKE("Coke", 2, "XASD")
    , PEPSI("Pepsi", 2, "CWEA");

    private String name;
    private int price;
    private String UUID;

    private Item(String name, int price, String UUID) {
        this.name = name;
        this.price = price;
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
