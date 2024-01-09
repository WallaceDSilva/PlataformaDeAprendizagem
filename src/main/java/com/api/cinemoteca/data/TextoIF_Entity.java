package com.api.cinemoteca.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TextosInformativos")
public class TextoIF_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    @JoinTable(name = "TextoInformativo_Topico",
            joinColumns = @JoinColumn(name = "texto_id"),
            inverseJoinColumns = @JoinColumn(name = "topico_id"))
    private List<TopicoEntity> topicos;

    private String titulo;

    @Column(length = 3000)
    private String texto;
    
    private String caminhoImage;

}
