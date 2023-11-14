import java.util.Scanner;

public class Color {
    public static void getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of the color:");
        String firstLetter = scanner.nextLine().trim();
        String colorName = getColorName(firstLetter);
        System.out.println("Full name of color: " + colorName);
    }

    public static String getColorName(String firstLetter) {
        return switch (firstLetter) {
            case "b" -> "Blue";
            case "g" -> "Green";
            case "r" -> "Red";
            case "y" -> "Yellow";
            default -> "Unknown";
        };
    }
}
class TestApp6{
    public static void main(String[] args) {
        Color.getColor();
    }
}
