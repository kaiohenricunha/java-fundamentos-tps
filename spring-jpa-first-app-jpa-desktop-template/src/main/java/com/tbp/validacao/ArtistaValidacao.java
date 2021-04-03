package com.tbp.validacao;

import com.tbp.exceptions.ArtistaValidacaoException;
import com.tbp.modelo.Artista;

public class ArtistaValidacao {

    public void validarArtista(Artista artista) throws ArtistaValidacaoException {
        if(artista.getNome() == null || artista.getNome().isEmpty() || artista.getGenero() == null || 
                artista.getGenero() == null || artista.getGenero().isEmpty()) {
            throw new ArtistaValidacaoException("Nome do artista/gênero musical não pode ser vazio");
        }
    }
    
}
