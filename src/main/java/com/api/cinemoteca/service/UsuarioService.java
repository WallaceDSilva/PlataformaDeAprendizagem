package com.api.cinemoteca.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.api.cinemoteca.data.UsuarioEntity;
import com.api.cinemoteca.data.UsuarioRepository;

@Service

public class UsuarioService implements LoginService{

    @Autowired

    UsuarioRepository usuarioRepository;

    public UsuarioEntity criarUsuario(UsuarioEntity user) {

        user.setId(null);

        usuarioRepository.save(user);

        return user;

    }

  @Override
    public boolean validarCredenciais(String username, String password) {
        // Implemente a lógica para buscar e validar as credenciais no banco de dados
        UsuarioEntity user = usuarioRepository.findBynome(username);
        return user != null && user.getSenha().equals(password);

}
    

}
