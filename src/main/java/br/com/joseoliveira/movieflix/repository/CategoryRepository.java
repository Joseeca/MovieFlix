package br.com.joseoliveira.movieflix.repository;

import br.com.joseoliveira.movieflix.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
