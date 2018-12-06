package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Aluguel;
import java.io.Serializable;

/**
 *
 * @author 201613260113
 */
public class AluguelDAO<TIPO> extends DAOGenerico<Aluguel> implements Serializable {

    public AluguelDAO() {
        super();
        classePersistente = Aluguel.class;
        ordem = "valor";
    }

}
