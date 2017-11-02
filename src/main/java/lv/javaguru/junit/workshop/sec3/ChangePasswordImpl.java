package lv.javaguru.junit.workshop.sec3;

public class ChangePasswordImpl implements ChangePasswordService {
    @Override
    public Responce changePassword(User user, String newPassword) {
        if(newPassword == null || newPassword.length()<5 || newPassword.isEmpty()) {
            return new Responce(false,"Password length should be > 5 ");
        }
        boolean containsOnlyDigits = newPassword.matches("\\d");
        boolean containsOnlyChars = newPassword.matches("[a-zA-Z]");
        if(containsOnlyDigits || containsOnlyChars) {
            return new Responce(false, "Password must contain letters and charracters only");
        }
        return new Responce(true);
    }

}
