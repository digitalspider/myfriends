package au.com.digitalspider.myfriends.api.contact.io;

public class APIError {
    private String message;
    private int status = 500;
    private Exception exception;

    public APIError(Exception exception) {
        this.message = exception.getMessage();
        this.exception = exception;
    }

    public APIError(String message, Exception exception) {
        this.message = message;
        this.exception = exception;
    }

    public APIError(String message, int status, Exception exception) {
        this.message = message;
        this.status = status;
        this.exception = exception;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return int return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return Exception return the exception
     */
    public Exception getException() {
        return exception;
    }

    /**
     * @param exception the exception to set
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }
}