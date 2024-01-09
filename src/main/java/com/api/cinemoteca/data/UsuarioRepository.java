
package com.api.cinemoteca.data;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    public UsuarioEntity findById(int id);
    
     public UsuarioEntity findBynome(String username);

}

