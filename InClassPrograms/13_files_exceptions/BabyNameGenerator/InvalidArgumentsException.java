// create our own Exception to handle more specific
// exceptions that what is build into Java already
public class InvalidArgumentsException extends RuntimeException{
    public InvalidArgumentsException(String message){
        // Constructrs the parent exception class
        // with that error message passed into this constructor
        super(message);
    }
}