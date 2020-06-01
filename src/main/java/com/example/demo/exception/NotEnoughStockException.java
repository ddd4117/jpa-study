package com.example.demo.exception;

public class NotEnoughStockException extends RuntimeException{
    public NotEnoughStockException() {
    }

    public NotEnoughStockException(String message) {
        super(message);
    }
}
