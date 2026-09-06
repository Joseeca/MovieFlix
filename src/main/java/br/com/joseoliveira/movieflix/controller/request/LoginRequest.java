package br.com.joseoliveira.movieflix.controller.request;

public record LoginRequest(String email,
                           String password) {
}