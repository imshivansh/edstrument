package com.example.edstruments.Exception;

public class NoProductExistExeption extends RuntimeException{
    private String messsage;
    public NoProductExistExeption(String messsage){
        super(messsage);
    }
}
