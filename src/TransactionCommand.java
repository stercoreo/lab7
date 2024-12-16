/**
 * Interface for transaction commands.
 */
public interface TransactionCommand {
    /**
     * Executes the command.
     */
    void execute();

    /**
     * Undoes the command.
     */
    void undo();
}
