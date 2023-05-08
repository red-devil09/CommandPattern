package org.example;

import java.util.List;

public class Client {
    List<CommandExecutor> commandExecutorList;

    public Client(List<CommandExecutor> commandExecutorList){
        this.commandExecutorList = commandExecutorList;
    }

    public String runCommand(Command command){
        for(var concreteClass: commandExecutorList){
            if(concreteClass.isApplicable(command))
                return concreteClass.executeCommand(command);
        }
        return "fail";
    }
}
