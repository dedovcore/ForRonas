package DAO;

import DAO.interfaces.ModelDAO;
import dataBase.HibernateSessionFactory;
import models.Bank;
import models.Client;
import models.Deposit;
import models.Model;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class ModelDaoImpl implements ModelDAO {
    @Override
    public boolean addModel(Model model) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteModel(Model model) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(model);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Client getClient(String name, String password) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Client where name = :name and password = :password");

        query.setParameter("name", name);
        query.setParameter("password", password);
        Client client = (Client) query.getSingleResult();
        transaction.commit();
        session.close();

        return client;
    }

    @Override
    public boolean updateModel(Model model) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(model);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Model> getAllModel(String model) {
        Session session = HibernateSessionFactory.getInstance().openSession();
        List<Model>models = session.createQuery("select * from "+model).list();
        session.close();
        return models;
    }
}
