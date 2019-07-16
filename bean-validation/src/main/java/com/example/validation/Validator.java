package com.example.validation;

import com.example.Response;
import com.example.model.UserData;
import com.example.service.UserDataValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Set;

@Component
public class Validator {

    private ValidatorFactory factory;
    private javax.validation.Validator validator;

    public Response<UserData> validarDados(GenericValidation userData) {
        Response<UserData> response = new Response<>();
        factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();

        Set<ConstraintViolation<GenericValidation>> errors = validator.validate(userData, UserDataValidation.class);

        if (errors.size() > 0) {
            response.setErrors(new ArrayList<>());
            for (ConstraintViolation<GenericValidation> error : errors) {
              response.getErrors().add(error.getMessage());
            }
        }
        return response;
    }


}
