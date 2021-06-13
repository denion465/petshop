package backend.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.petshop.model.Categorias;

public interface CategoriaRepository extends JpaRepository<Categorias, Long> {}
