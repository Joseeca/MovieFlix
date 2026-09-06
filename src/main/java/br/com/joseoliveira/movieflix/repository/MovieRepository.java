package br.com.joseoliveira.movieflix.repository;

import br.com.joseoliveira.movieflix.entity.Category;
import br.com.joseoliveira.movieflix.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findMovieByCategories(List<Category> categories);

    List<Movie> findTop5ByOrderByRatingDesc();
}