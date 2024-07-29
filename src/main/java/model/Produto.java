package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private String tipo;
    @Column
    private Integer quantidade;
    @Column
    private Boolean isAtivo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
