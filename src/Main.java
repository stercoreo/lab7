/**
 * Main class for testing transaction functionality.
 */
public class Main {
    public static void main(String[] args) {
        DatabaseTable table = new DatabaseTable();
        TransactionManager manager = new TransactionManager();

        // Start a transaction
        manager.begin(table);

        // Create and execute commands
        TransactionCommand insert1 = new InsertCommand(table, "Row1");
        TransactionCommand insert2 = new InsertCommand(table, "Row2");

        insert1.execute();
        insert2.execute();

        // Rollback the transaction
        manager.rollback(table);
    }
}
