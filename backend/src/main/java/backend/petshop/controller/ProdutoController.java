package backend.petshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import backend.petshop.model.Produto;
import backend.petshop.service.ProdutoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProdutoController {
  private final ProdutoService produtoService;

  @GetMapping("/produtos")
  public List<Produto> findAll() {

    return produtoService.findAll();
  }

  @GetMapping("/produtos/{id}")
  public Optional<Produto> findById(@PathVariable Long id) {

    return produtoService.findById(id);
  }

  @PostMapping("/produtos")
  public Produto addProduto(@RequestBody Produto produto) {

    return produtoService.save(produto);
  }

  @DeleteMapping("/produtos/{id}")
  public void delete(@PathVariable Long id) {
    produtoService.delete(id);
  }

  @PutMapping("produtos")
  public Produto putProduto(@RequestBody Produto produto) {

    return produtoService.putProduto(produto);
  }


}
