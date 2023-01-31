package br.com.conection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

public class HibernateConection {

    private static HibernateConection instance = new HibernateConection();

    private SessionFactory sessionFactory;

    private HibernateConection() {
        this.sessionFactory = buildSessionFactory();
    }

    private synchronized static SessionFactory buildSessionFactory() {
        return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static HibernateConection getInstance() {
        if (instance == null) {
            return new HibernateConection();
        }
        return instance;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public EntityManager getEntityManager(){
       return getSessionFactory().createEntityManager();
    }

}
