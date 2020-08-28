package DAO.interfaces;

import models.Bank;
import models.Client;
import models.Deposit;
import models.Model;

import java.util.List;

public interface ModelDAO {
    public boolean addModel(Model model);
    public boolean deleteModel(Model model);
    public Client getClient(String name, String password);
    public boolean updateModel(Model model);
    public List<Model> getAllModel(String model);
}
