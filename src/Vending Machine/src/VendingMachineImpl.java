import Exception.NotEnoughNoteException;

public class VendingMachineImpl implements VendingMachine{
    private Inventory<Item> inventory = new Inventory<>();
    private int payValue = 2;
    private int noteInTranscation = 0;
    private boolean purchaseEligible = false;


    @Override
    public void pay(Note note) {
        if(note.getValue() >= 2) {
            purchaseEligible = true;
            noteInTranscation = note.getValue();
        } else {
            throw new NotEnoughNoteException("Not enough note");
        }
    }

    @Override
    public void selectItem(Item item) {
        if(purchaseEligible) {
            if (inventory.getQuantity(item) < 0) {
                // throw not enough item exception
            } else {
                inventory.reduce(item);
                this.colletItems(item);
            }
        } else {
            // throw purchase inEligible exception
        }
    }

    @Override
    public int refund() {
        this.reset();
        return noteInTranscation;
    }

    @Override
    public Bucket colletItems(Item item) {
        this.reset();
        return new Bucket(item, noteInTranscation - item.getPrice());
    }

    private void reset() {
        noteInTranscation = 0;
        purchaseEligible = false;
    }
}
