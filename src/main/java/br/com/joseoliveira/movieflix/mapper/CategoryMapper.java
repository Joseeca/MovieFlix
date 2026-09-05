package br.com.joseoliveira.movieflix.mapper;

import br.com.joseoliveira.movieflix.controller.request.CategoryRequest;
import br.com.joseoliveira.movieflix.controller.response.CategoryResponse;
import br.com.joseoliveira.movieflix.entity.Category;
import lombok.experimental.UtilityClass;

@UtilityClass //Uma classe que não pode ser instanciada
public class CategoryMapper {

    public static Category toCategory(CategoryRequest categoryRequest) {
        return Category.builder().name(categoryRequest.name()).build();
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}