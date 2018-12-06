package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Condominio;
import java.io.Serializable;

/**
 *
 * @author 201613260113
 */
public class CondominioDAO<TIPO> extends DAOGenerico<Condominio> implements Serializable {

    public CondominioDAO() {
        super();
        classePersistente = Condominio.class;
        ordem = "nome";
    }

}
