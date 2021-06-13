package backend.petshop.model;

import java.util.Set;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_produto")
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String nome;

  @NotNull
  private String descricao;

  @NotNull
  private Double preco;

  @Valid
  @ManyToMany
  @JoinTable(
    name = "rel_categoria_produto",
    joinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_categorias", referencedColumnName = "id")
  )
  private Set<Categorias> categorias;

}
