package com.example;

import lombok.Data;
import java.util.List;

@Data
public class Response<T> {

    private T data;
    private List<String> errors;
}
