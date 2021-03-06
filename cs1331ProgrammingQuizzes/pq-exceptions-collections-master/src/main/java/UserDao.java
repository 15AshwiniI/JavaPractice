import java.util.Arrays;
//import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Throwable;

public class UserDao {
    private String[] users;

    public UserDao(String[] users) {
        this.users = Arrays.copyOf(users, users.length);
    }

    public String getUser(int id) throws NoSuchUserException {
        // YOUR CODE HERE
        // Catch the ArrayIndexOutOfBoundsException
        // Re-throw a NoSuchUserException
        try {
            return users[id];
        } catch (ArrayIndexOutOfBoundsException ex) {
            //ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw new NoSuchUserException(id, ex);
        }
    }
}
