package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        Rechargeprovider rechargeprovider = new Rechargeprovider();

        BalanceCommandExecutor balanceCommandExecutor = new BalanceCommandExecutor(database);
        RechargeCommandExecutor rechargeCommandExecutor = new RechargeCommandExecutor(database,rechargeprovider);

        var list = List.of(balanceCommandExecutor,rechargeCommandExecutor);
        Client client = new Client(list);

        Command balanceCommand = new Command("balance");
        Command rechargeCommand = new Command("recharge");
        //expected code is running without any if-else condition


        String res = client.runCommand(balanceCommand);
        System.out.println(res);

        String res1 = client.runCommand(rechargeCommand);
        System.out.println(res1);
    }
}