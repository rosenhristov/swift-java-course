package task2_ownexception;

/**
 * Created by Rossen on 14.3.2016 г..
 */
public class InvalidYearInputFormatException extends Exception {
    public InvalidYearInputFormatException() {
        super();
    }
    public InvalidYearInputFormatException(String message) {
        super(message);
    }
    public InvalidYearInputFormatException(String message, Throwable cause) {
        super(message, cause);
    }
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
