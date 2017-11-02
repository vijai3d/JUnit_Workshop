package lv.javaguru.junit.workshop.sec3;

import java.util.ArrayList;
import java.util.List;

public class Responce {
    boolean success;
    List<String> errorMessage;

    public Responce(boolean success) {
        this.success = success;
    }

    public Responce(List<String> errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Responce(boolean success, String message) {

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(List<String> errorMessage) {
        this.errorMessage = errorMessage;
    }
}
