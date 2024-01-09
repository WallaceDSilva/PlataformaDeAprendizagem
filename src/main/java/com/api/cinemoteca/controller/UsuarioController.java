package com.api.cinemoteca.controller;

import com.api.cinemoteca.data.UsuarioEntity;
import com.api.cinemoteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/cadastro-usuario")
    public String exibirFormulario(Model model) {
        model.addAttribute("usuario", new UsuarioEntity());
        return "cadastro-usuario";
    }

    @PostMapping("/cadastro-usuario")
    public String cadastrarUsuario(@ModelAttribute UsuarioEntity user, Model model) {
        usuarioService.criarUsuario(user);
        model.addAttribute("usuario", user);
        return "redirect:Textos_e_Topicos";
    }

   
    

}
