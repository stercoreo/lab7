import java.util.List;

/**
 * Memento class for saving the state of the table.
 */
public class TransactionMemento {
    private final List<String> state;

    /**
     * Constructor for creating a memento with the given state.
     */
    public TransactionMemento(List<String> state) {
        this.state = state;
    }

    /**
     * Returns the saved state.
     */
    public List<String> getState() {
        return state;
    }
}
