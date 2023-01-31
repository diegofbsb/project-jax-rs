package br.com.conection;

import br.com.persitence.PessoaInterface;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    static PessoaInterface pessoaInterface;
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConection.getInstance().getSessionFactory();
        System.out.println("Session Factory : " + sessionFactory.hashCode());
        SessionFactory sessionFactory2 = HibernateConection.getInstance().getSessionFactory();
        System.out.println("Session Factory 2 : " + sessionFactory2.hashCode());
        SessionFactory sessionFactory3 = HibernateConection.getInstance().getSessionFactory();
        System.out.println("Session Factory 3 : " + sessionFactory3.hashCode());
        pessoaInterface.getAll();
    }
}
