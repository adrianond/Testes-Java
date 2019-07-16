package com.example.model;

import com.example.service.UserDataValidation;
import com.example.validation.GenericValidation;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User extends GenericValidation {

    @NotNull(groups = UserDataValidation.class, message = "Name deve ser informado")
    @Size(groups = UserDataValidation.class, max = 60, message = "Nome deve ter no máximo 60 caracteres")
    private String name;

    @NotNull(groups = UserDataValidation.class, message = "Documento deve ser informado")
    @Size(groups = UserDataValidation.class, max = 11, message = "Documento deve ter no máximo 11 caracteres")
    private String document;
}
