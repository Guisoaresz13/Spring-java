package br.senac.sp.appdesk;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // vai mapear uma tabela no db pois ndentificamos o como entidade
@Data // cria getters setters e construtores e etc
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) //gera o id automaticamente 
    private Long id;
    private String title;
    private String description;
    private Integer score;
    private Integer status;
    
}
