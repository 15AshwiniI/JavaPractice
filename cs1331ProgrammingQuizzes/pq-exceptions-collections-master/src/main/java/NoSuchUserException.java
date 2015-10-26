import java.lang.Throwable;
public class NoSuchUserException extends Exception {

    public NoSuchUserException(int id, Throwable cause) {
        super("User" + id + "does not exist");
    }
}