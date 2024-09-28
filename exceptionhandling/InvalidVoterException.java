package exceptionhandling;

public class InvalidVoterException extends Exception{

    // Creating constructor which takes string parameter and calls parent constructor
    public InvalidVoterException(String message){
        super(message);
    }
}
