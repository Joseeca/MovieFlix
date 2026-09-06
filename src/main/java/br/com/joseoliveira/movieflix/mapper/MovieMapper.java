package br.com.joseoliveira.movieflix.mapper;

import br.com.joseoliveira.movieflix.controller.request.MovieRequest;
import br.com.joseoliveira.movieflix.controller.response.CategoryResponse;
import br.com.joseoliveira.movieflix.controller.response.MovieResponse;
import br.com.joseoliveira.movieflix.controller.response.StreamingResponse;
import br.com.joseoliveira.movieflix.entity.Category;
import br.com.joseoliveira.movieflix.entity.Movie;
import br.com.joseoliveira.movieflix.entity.Streaming;
import lombok.experimental.UtilityClass;

import java.util.List;

//Classe responsável por mapear as requests do tipo Movie
@UtilityClass
public class MovieMapper {

    public static Movie toMovie(MovieRequest request) {

        //Montando um objeto do tipo Category apenas com os Ids da lista de categories
        List<Category> categories = request.categories().stream()
                .map(categoryId -> Category.builder().id(categoryId).build())
                .toList();

        List<Streaming> streamings = request.streamings().stream()
                .map(streamingId -> Streaming.builder().id(streamingId).build())
                .toList();

        return Movie.builder()
                .id(request.id())
                .title(request.title())
                .description(request.description())
                .releaseDate(request.releaseDate())
                .rating(request.rating())
                .categories(categories)
                .streamings(streamings)
                .build();
    }

    public static MovieResponse toMovieResponse(Movie movie) {

        List<CategoryResponse> categories = movie.getCategories().stream()
                .map(category -> CategoryMapper.toCategoryResponse(category))
                .toList();

        List<StreamingResponse> streamings = movie.getStreamings().stream()
                .map(streaming -> StreamingMapper.toStreamingResponse(streaming))
                .toList();

        return MovieResponse.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .description(movie.getDescription())
                .releaseDate(movie.getReleaseDate())
                .rating(movie.getRating())
                .categories(categories)
                .streamings(streamings)
                .build();
    }
}