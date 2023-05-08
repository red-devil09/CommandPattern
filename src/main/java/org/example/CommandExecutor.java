package org.example;

public abstract class CommandExecutor {
    //ab jo chize hr command ko chahiye unki dependency to yahi likh do
    protected Database database;
    //protectd isliye so that jo classes extend kr rhi hai, can use this variable

    public CommandExecutor(Database database){
        this.database = database;
    }

    //ye hai hmara method, see  how we are playig with these, non-abstract method ke andr abstract method likh rhe hai, eencapsulate
    public String executeCommand(Command command){

        //what a beautiful use
        if(isValid(command))
            return executeValidCommand(command);
        else
            throw new RuntimeException("adfaf");
    }

    //ye check krega ki iss command mei konsa executorImplementation class thik rhega
    //we can iterate this method over a list, and run it for each concrete class
    abstract boolean isApplicable(Command command);

    //to check if for given executor, the command is valid w.r.t its params
    protected abstract boolean isValid(Command command);
    //protected as we dont want any other classes to see this, except the classes which derive from this


    //ye hoga uss imp ka proper jo execute krna hai
    protected abstract String executeValidCommand(Command command);
}
