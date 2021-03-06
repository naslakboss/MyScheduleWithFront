package com.pk.ms.exceptions;

import com.pk.ms.dto.user.UserInputDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UniqueValuesAlreadyExistsException extends RuntimeException {
    public UniqueValuesAlreadyExistsException(UserInputDTO userInputDTO) {
        super("User with nick \"" + userInputDTO.getNick() + "\" already exists. ");
    }
    public UniqueValuesAlreadyExistsException(String email) {
        super("User with email \"" + email + "\" already exists. ");
    }

}
