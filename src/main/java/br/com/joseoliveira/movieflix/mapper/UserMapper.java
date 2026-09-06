package br.com.joseoliveira.movieflix.mapper;

import br.com.joseoliveira.movieflix.controller.request.UserRequest;
import br.com.joseoliveira.movieflix.controller.response.UserResponse;
import br.com.joseoliveira.movieflix.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public static User toUser(UserRequest request) {
        return User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .build();
    }

    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}
