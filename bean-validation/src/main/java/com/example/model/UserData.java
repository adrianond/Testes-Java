package com.example.model;

import com.example.service.UserDataValidation;
import com.example.validation.GenericValidation;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class UserData extends GenericValidation {

    @NotNull(groups = UserDataValidation.class, message = "Usuário deve ser informado")
    private User user;
    @NotNull(groups = UserDataValidation.class, message = "Conta deve ser informada")
    private Account account;
}
