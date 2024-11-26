package com.cydeo.LinkedList.CustomeExceptions;

import com.cydeo.LinkedList.Enums.ExceptionsEnums;

public class ListEmptyException extends RuntimeException{
    public ListEmptyException(ExceptionsEnums exceptionsEnums){
        super(exceptionsEnums.getMessage());
    }
}
