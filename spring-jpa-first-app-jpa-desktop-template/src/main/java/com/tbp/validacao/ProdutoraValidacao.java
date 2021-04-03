package com.tbp.validacao;

import com.tbp.exceptions.ArtistaValidacaoException;
import com.tbp.exceptions.ProdutoraValidacaoException;
import com.tbp.modelo.Produtora;


public class ProdutoraValidacao {
    public void validarProdutora(Produtora produtora) throws ProdutoraValidacaoException {
        if(produtora.getNome() == null || produtora.getNome().isEmpty()) {
            throw new ProdutoraValidacaoException("Nome da produtora não pode ser vazio");
        }
    }
}
