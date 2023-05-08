package org.example;

public class RechargeCommandExecutor extends CommandExecutor{

    private Rechargeprovider rechargeprovider;
    private static final String  RECHARGE = "recharge";

    //here also very beautiful use of both super constructor and current constructor
    public RechargeCommandExecutor(Database database, Rechargeprovider rechargeprovider) {
        super(database);
        this.rechargeprovider = rechargeprovider;
    }

    @Override
    boolean isApplicable(Command command) {
        return command.getName().equalsIgnoreCase(RECHARGE);
    }

    @Override
    protected boolean isValid(Command command) {
        //check if command paramns are valid
        return true;
    }

    @Override
    protected String executeValidCommand(Command command) {
        //ye params hi hume command object se send krne thee bs
         rechargeprovider.doRecharge("user",100);
         return "Success";
    }
}
