
package com.api.cinemoteca.data;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.util.List;

@Repository
public interface TextoIF_EntityRepository extends JpaRepository<TextoIF_Entity, Integer> {
List<TextoIF_Entity> findBytopicosId(Integer id);
}

