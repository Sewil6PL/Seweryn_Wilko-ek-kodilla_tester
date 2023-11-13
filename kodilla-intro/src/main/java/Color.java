import java.util.Scanner;

public class Color {
    public static String getColor(){
        Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the first letter of the color:");
            String firstLetter = scanner.nextLine().trim();
            String colorName = getColorName(firstLetter);
            System.out.println("Full name of color: " + colorName);
        return firstLetter;
    }
    public static String getColorName(String firstLetter) {
        String colorName;
        switch (Character.toLowerCase(Integer.parseInt(firstLetter))) {
            case 'b': colorName = "Blue";
                break;
            case 'g': colorName = "Green";
                break;
            case 'r': colorName = "Red";
                break;
            case 'y': colorName = "Yellow";
                break;
            default: colorName = "Unknown";
                break;
        }
        return colorName;
    }
}
