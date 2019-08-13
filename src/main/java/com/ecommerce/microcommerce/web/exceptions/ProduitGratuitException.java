package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ProduitGratuitException extends RuntimeException {

	public ProduitGratuitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
