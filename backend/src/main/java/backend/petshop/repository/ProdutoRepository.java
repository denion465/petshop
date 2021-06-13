package backend.petshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.petshop.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  List<Produto> findByNome(String nome);

}
