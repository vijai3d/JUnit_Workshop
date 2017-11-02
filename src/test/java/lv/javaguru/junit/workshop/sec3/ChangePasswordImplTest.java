package lv.javaguru.junit.workshop.sec3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class ChangePasswordImplTest {


    private ChangePasswordService service = new ChangePasswordImpl();


    @Test
    public void shoulReturnFailWhenPasswordIsLess5() {
        User user = new User();
        Responce responce = service.changePassword(user, "123");
        assertEquals(responce, "");
    }

    @Test
    public void shoulReturnFailWhenPasswordIsNull() {
        User user = new User();
        Responce responce = service.changePassword(user, null);
        assertFalse(responce.isSuccess());
        //assertEquals(responce.getErrorMessage().get(0), "Password length should be > 5 ");
    }

    @Test
    public void shoulReturnFailWhenPasswordIsEmpty() {
        User user = new User();
        Responce responce = service.changePassword(user, "");
        assertFalse(responce.isSuccess());
        //assertEquals(responce.getErrorMessage().get(0), "Password length should be > 5 ");
    }

    @Test
    public void shoulReturnFailWhenPasswordContainsDigitsOnly() {
        User user = new User();
        Responce responce = service.changePassword(user, "12345");
        assertFalse(responce.isSuccess());
        assertEquals(responce.getErrorMessage().get(0), "Password must contain letters and charracters only");
    }
}