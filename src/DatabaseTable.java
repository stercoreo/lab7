import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a database table.
 */
public class DatabaseTable {
    private List<String> rows = new ArrayList<>();

    /**
     * Adds a row to the table.
     */
    public void insert(String data) {
        System.out.println("Inserting: " + data);
        rows.add(data);
    }

    /**
     * Removes a row from the table.
     */
    public void delete(String data) {
        System.out.println("Deleting: " + data);
        rows.remove(data);
    }

    /**
     * Saves the current state of the table.
     */
    public TransactionMemento save() {
        System.out.println("Saving table state...");
        return new TransactionMemento(new ArrayList<>(rows));
    }

    /**
     * Restores the table to a previously saved state.
     */
    public void restore(TransactionMemento memento) {
        System.out.println("Restoring table state...");
        rows = memento.getState();
    }
}
