package br.com.persitence.impl;

import br.com.conection.HibernateConection;
import br.com.persitence.PessoaInterface;

import javax.persistence.Query;
import java.util.List;

public class PessoaImpl implements PessoaInterface {

    HibernateConection hibernateConection;

    @Override
    public List getAll() {
        String hql = "from Pessoa";
        Query query = hibernateConection.getEntityManager().createQuery(hql);
        return query.getResultList();
    }

    @Override
    public List getPessoa(Integer id) {
        String hql = "from Pessoa e where e.id=:id";
        Query query = hibernateConection.getEntityManager().createQuery(hql);
        query.setParameter("id", id);
        return query.getResultList();
    }
}
