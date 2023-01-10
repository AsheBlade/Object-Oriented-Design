// Allow users to buy products.
    // Item: Coke, Pepsi.
    // choose product function.
// Allow user to be refunded if canceled.
// Accept coins, 1, 5, 10, 25.
// Return change.


import java.util.List;

// Define public api.
public interface VendingMachine {
    public void pay(Note note);
    public void selectItem(Item item);
    public int refund();
    public Bucket<Item, Integer> colletItems(Item item);
}
