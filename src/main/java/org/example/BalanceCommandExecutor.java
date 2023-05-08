package org.example;

public class BalanceCommandExecutor extends CommandExecutor{

    public static final String BALANCE = "balance";


    public BalanceCommandExecutor(Database database) {
        super(database);
    }

    //ye command (Balance command excutor) tbhi call hogi jb command ka naam balance hoga
    @Override
    boolean isApplicable(Command command) {
        return command.getName().equalsIgnoreCase(BALANCE);
    }

    @Override
    protected boolean isValid(Command command) {
        //for validity check its params list
        return true;
    }

    @Override
    protected String executeValidCommand(Command command) {
        return database.getBalance("user");
    }
}
