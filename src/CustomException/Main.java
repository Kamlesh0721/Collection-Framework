package CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            AgeValidator.validateAge(16); // This will throw the exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
