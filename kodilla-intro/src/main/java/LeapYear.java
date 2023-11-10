import java.util.Random;
public class LeapYear {
        public static void main(String[] args) {
            Random random = new Random();
            int counter = 0;
            while (counter < 20) {
                int year = random.nextInt(3000);
                System.out.print(counter + ": Rok " + year + " jest ");
                if (year % 4 == 0) {
                    System.out.println("Przestepny.");
                } else if (year % 100 != 0) {
                    System.out.println("Nie Przestepny.");
                } else if (year % 400 == 0) {
                    System.out.println("Przestepny.");
                } else {
                    System.out.println("Nie przestepny.");
                }
                counter++;
            }
        }
    }
