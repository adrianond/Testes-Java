package com.example.service;

import com.example.Response;
import com.example.model.Account;
import com.example.model.UserData;
import com.example.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class UserDataValidationExecute {

    @Autowired
    private Validator validator;

    public Response<UserData> execute (UserData userData) {
        Response <UserData> response = null;

        validarData(userData);
        return response = doSomething(userData, response);
    }

    private void validarData(UserData userData) {
        Response<UserData> response = null;
        response = validator.validarDados(userData);
        if(Optional.ofNullable(response.getErrors()).isPresent()) {
            if (!response.getErrors().isEmpty()) {
                response.getErrors().forEach(erro -> {
                    System.out.println("erros: " + erro);
                });
            }
        }
        response = validator.validarDados(userData.getUser());
        if(Optional.ofNullable(response.getErrors()).isPresent()) {
            if (!response.getErrors().isEmpty()) {
                response.getErrors().forEach(erro -> {
                    System.out.println("erros: " + erro);
                });

            }
        }
        response = validator.validarDados(userData.getAccount());
        if(Optional.ofNullable(response.getErrors()).isPresent()) {
            if (!response.getErrors().isEmpty()) {
                response.getErrors().forEach(erro -> {
                    System.out.println("erros: " + erro);
                });
            }
        }
    }

    private Response<UserData> doSomething(UserData userData, Response <UserData> response) {
        userData.setAccount(new Account());
        userData.getAccount().setNumero("123456");
        userData.getAccount().setDigito("9");
        response.setData(userData);
        return response;
    }
}
