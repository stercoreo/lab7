import java.util.Stack;

/**
 * Class for managing database transactions.
 */
public class TransactionManager {
    private Stack<TransactionMemento> history = new Stack<>();

    /**
     * Starts a transaction by saving the current state of the table.
     */
    public void begin(DatabaseTable table) {
        history.push(table.save());
    }

    /**
     * Commits the transaction and clears the saved states.
     */
    public void commit() {
        System.out.println("Transaction committed.");
        history.clear();
    }

    /**
     * Rolls back the transaction to the previous saved state.
     */
    public void rollback(DatabaseTable table) {
        if (!history.isEmpty()) {
            TransactionMemento memento = history.pop();
            table.restore(memento);
        } else {
            System.out.println("No state to rollback.");
        }
    }
}
