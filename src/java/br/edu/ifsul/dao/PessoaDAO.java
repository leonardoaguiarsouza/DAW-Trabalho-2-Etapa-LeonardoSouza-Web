/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Pessoa;
import br.edu.ifsul.util.Util;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import org.postgresql.translation.messages_bg;

/**
 *
 * @author 201613260113
 */
public class PessoaDAO<TIPO> extends DAOGenerico<Pessoa> implements Serializable {

    public PessoaDAO() {
        super();
        classePersistente = Pessoa.class;
        ordem = "nome";
    }

}
