
public class app {
    private final String message = "Hello World!";

    public app() {}

    public static void main(String[] args) {
        System.out.println(new app().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
