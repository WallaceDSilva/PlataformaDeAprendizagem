package com.api.cinemoteca.controller;

/**
 *
 * @author astof
 */
import com.api.cinemoteca.data.UsuarioEntity;
import com.api.cinemoteca.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired

    LoginService login;

    @PostMapping("/logarUser")
    public String login(UsuarioEntity user, Model model) {

        if (login.validarCredenciais(user.getNome(), user.getSenha())) {
            return "redirect:/Textos_e_Topicos";
        } else {
            model.addAttribute("error", true);
            return "index";
        }
    }

    @GetMapping("/logarUser")
    public String exibirFormularioLogin(Model model) {
        model.addAttribute("usuario", new UsuarioEntity());
        return "logarUser";
    }

}
