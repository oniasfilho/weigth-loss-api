package io.oniasfilho.weightlossapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Peso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long peso;
    private long peso_meta;
    @ManyToOne
    private Pessoa pessoa;
    @JsonFormat(pattern="dd/MM/yyyy")
    @CreationTimestamp
    private LocalDate dataCriacao;
}


