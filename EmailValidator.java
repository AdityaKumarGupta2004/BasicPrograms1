import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9+_.-]+@(.+)$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email1 = "test@example.com";
        String email2 = "invalid-email";

        System.out.println("Is valid email: " + email1 + " ? " + isValidEmail(email1));
        System.out.println("Is valid email: " + email2 + " ? " + isValidEmail(email2));
    }
}
