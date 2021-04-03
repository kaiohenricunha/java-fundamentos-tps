package com.tbp.validacao;

import com.tbp.exceptions.MagnusOpusValidacaoException;
import com.tbp.modelo.MagnusOpus;

public class MagnusOpusValidacao {
    
    public void validarMagnusOpus(MagnusOpus album) throws MagnusOpusValidacaoException {
        if(album.getNome() == null || album.getNome().isEmpty()) {
            throw new MagnusOpusValidacaoException("Nome da produtora não pode ser vazio");
        }
    }
}
