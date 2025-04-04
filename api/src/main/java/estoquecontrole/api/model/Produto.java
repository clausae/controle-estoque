package estoquecontrole.api.model;

import jakarta.persistence.*;
        import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer quantidade;
    private BigDecimal preco;

    // Getters e Setters
}
