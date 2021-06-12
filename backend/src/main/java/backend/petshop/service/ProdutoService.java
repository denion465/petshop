package backend.petshop.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import backend.petshop.model.Produto;
import backend.petshop.repository.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
  private final ProdutoRepository produtoRepository;

  public List<Produto> findAll() {

    return this.produtoRepository.findAll();
  }

  public Set<Produto> findByName(String nome) {

    return this.produtoRepository.findByNome(nome);
  }

  public Optional<Produto> findById(Long id) {

    return this.produtoRepository.findById(id);
  }

  public Produto save(Produto produto) {

    return this.produtoRepository.save(produto);
  }

  public void delete(Long id) {
    this.produtoRepository.deleteById(id);
  }

  public Produto putProduto(Produto produto) {
    Produto oldproduto = produtoRepository.findById(produto.getId())
    .orElse(null);

    oldproduto.setNome(produto.getNome());
    oldproduto.setDescricao(produto.getDescricao());
    oldproduto.setPreco(produto.getPreco());

    return produtoRepository.save(oldproduto);
  }

}
