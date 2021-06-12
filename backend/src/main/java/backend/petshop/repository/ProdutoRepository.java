package backend.petshop.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.petshop.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  Set<Produto> findByNome(String nome);

}
