package com.example.ecomerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundExcception extends RuntimeException {

    private final String msg;
}
