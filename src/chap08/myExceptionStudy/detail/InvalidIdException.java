package chap08.myExceptionStudy.detail;

public class InvalidIdException extends RuntimeException{
    private String code;
    public InvalidIdException(String message) {
        super(message);
    }
}
