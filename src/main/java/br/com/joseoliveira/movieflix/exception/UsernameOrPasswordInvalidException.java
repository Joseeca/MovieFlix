package br.com.joseoliveira.movieflix.exception;

public class UsernameOrPasswordInvalidException extends RuntimeException{

	public UsernameOrPasswordInvalidException(String message){
		super(message);
	}
}
