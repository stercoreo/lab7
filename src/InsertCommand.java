/**
 * Command for inserting data into a database table.
 */
public class InsertCommand implements TransactionCommand {
    private DatabaseTable table;
    private String data;

    public InsertCommand(DatabaseTable table, String data) {
        this.table = table;
        this.data = data;
    }

    @Override
    public void execute() {
        table.insert(data);
    }

    @Override
    public void undo() {
        table.delete(data);
    }
}
