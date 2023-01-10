package Exception;

public class NotEnoughNoteException extends RuntimeException{
    public NotEnoughNoteException (String message, Throwable error) {
        super(message, error);
    }

    public NotEnoughNoteException (String message) {
        super(message);
    }
}
