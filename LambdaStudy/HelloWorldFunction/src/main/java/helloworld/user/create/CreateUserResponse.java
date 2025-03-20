package helloworld.user.create;

public class CreateUserResponse {
    private String message;
    private int statusCode;

    public CreateUserResponse(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() { return message; }
    public int getStatusCode() { return statusCode; }
}