
package com.api.cinemoteca.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository
public interface TopicoRepository extends JpaRepository<TopicoEntity, Integer> {
List<TextoIF_Entity> findBytextosInformativosId(Integer id);
}

