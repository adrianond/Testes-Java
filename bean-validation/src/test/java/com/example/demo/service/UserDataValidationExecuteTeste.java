package com.example.demo.service;

import com.example.model.Account;
import com.example.model.User;
import com.example.model.UserData;
import com.example.service.UserDataValidationExecute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDataValidationExecuteTeste {

    @Autowired
    private UserDataValidationExecute userDataValidationExecute;

    @Test
    public void deveTestarContaNaoInformada() {
        userDataValidationExecute.execute(createDataSemConta());
    }

    @Test
    public void deveTestarUsuario() {
        userDataValidationExecute.execute(createData());
    }

    @Test
    public void deveTestarDigitoContaNaoInformado() {
        userDataValidationExecute.execute(createDataSemDigitoConta());
    }

    private UserData createData() {
        UserData userData = new UserData();
        userData.setUser(new User());
        userData.getUser().setName("Nome");
        userData.setAccount(new Account());
        userData.getAccount().setNumero("1111");
        userData.getAccount().setDigito("111");
        return userData;
    }

    private UserData createDataSemConta() {
        UserData userData = new UserData();
        userData.setUser(new User());
        userData.getUser().setName("Nome");
        userData.getUser().setDocument("9999999");
        return userData;
    }

    private UserData createDataSemDigitoConta() {
        UserData userData = new UserData();
        userData.setUser(new User());
        userData.getUser().setName("Nome");
        userData.getUser().setDocument("9999999");
        userData.setAccount(new Account());
        userData.getAccount().setNumero("1111111");
        return userData;
    }
}
