package com.api.cinemoteca.service;

import com.api.cinemoteca.data.TextoIF_Entity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.cinemoteca.data.TextoIF_EntityRepository;

@Service
public class TextoService {

    @Autowired

    TextoIF_EntityRepository textoRepository;

    public TextoIF_Entity criarTexto(TextoIF_Entity analises) {

        analises.setId(null);

        textoRepository.save(analises);

        return analises;

    }

    public List<TextoIF_Entity> listarTodosText() {

        return textoRepository.findAll();

    }

    
}