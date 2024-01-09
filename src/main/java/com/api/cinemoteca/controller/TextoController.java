package com.api.cinemoteca.controller;

import com.api.cinemoteca.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextoController {

    @Autowired

    TextoService textocaService;

    @GetMapping("/Textos_e_Topicos")
    public String exibirListaTextosETopicos(Model model) {
        model.addAttribute("ListaTX", textocaService.listarTodosText());
        return "Textos_e_Topicos";
    }

}
