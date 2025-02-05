package LinkedList.CustomeExceptions;


import LinkedList.Enums.ExceptionsEnums;

public class ListEmptyException extends RuntimeException{
    public ListEmptyException(ExceptionsEnums exceptionsEnums){
        super(exceptionsEnums.getMessage());
    }
}
