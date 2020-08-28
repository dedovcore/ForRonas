package dataBase;

import models.Bank;
import models.Client;
import models.Deposit;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    private static SessionFactory instance;

    private HibernateSessionFactory(){
    }

    public static SessionFactory getInstance(){
        if (instance == null){
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Bank.class);
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Deposit.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                instance = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Исключение");
            }
        }
        return instance;
    }
}
