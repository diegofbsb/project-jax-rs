package br.com.persitence;


import br.com.model.Pessoa;

import java.util.List;

public interface PessoaInterface {

    public List<Pessoa> getAll();
    public List<Pessoa> getPessoa(Integer id);
}
