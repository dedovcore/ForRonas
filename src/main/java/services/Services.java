package services;

import DAO.ModelDaoImpl;
import DAO.interfaces.ModelDAO;
import models.Bank;
import models.Client;
import models.Deposit;

import java.util.ArrayList;
import java.util.List;

public class Services {

    ModelDAO dao = new ModelDaoImpl();

    public boolean authorization(String name, String password){
        dao.getClient(name, password);
        return true;
    }


    public boolean newClient(Client client) {
        dao.addModel(client);
        return true;
    }

    public boolean newBank(Bank bank){
        dao.addModel(bank);
        return true;
    }

    public boolean newDeposit(Deposit deposit){
        dao.addModel(deposit);
        return true;
    }

//    public boolean oldClient(Bank bank, Deposit deposit){
//
//        dao.addModel(bank);
//        dao.addModel(deposit);
//        return true;
//    }

    /*public void choseTheBank(String name, String BIK){
        Bank bank = new Bank(name, BIK);
        dao.addModel(bank);
    }

    public void getDeposit(String dateOfOpen, int percent, int termInMonth){
        Deposit deposit = new Deposit(dateOfOpen,percent,termInMonth);
        dao.addModel(deposit);
    }

    public void newClient(String name, String password, String shortName, String address, String LLC){
        Client client = new Client(name, password,shortName,address,LLC);
        dao.addModel(client);
    }*/

}
