package LinkedList.Enums;

public enum ExceptionsEnums {
    EMPTY_LIST("EmptyListException","Caused because the list from which you are trying to delete node is empty !!!");
    public final String type, message;
    private ExceptionsEnums(String ... arr){
      this.type=arr[0];
      this.message=arr[1];
    }

     public String getType(){
        return this.type;
    }

    public String getMessage(){
        return this.message;
    }
}
