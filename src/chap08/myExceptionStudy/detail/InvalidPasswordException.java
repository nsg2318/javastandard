package chap08.myExceptionStudy.detail;

public class InvalidPasswordException extends RuntimeException{
    private String code;
    public InvalidPasswordException(String message) {
        super(message);
    }
}
