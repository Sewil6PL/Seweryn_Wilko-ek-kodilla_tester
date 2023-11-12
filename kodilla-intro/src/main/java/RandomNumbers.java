import java.util.Random;

public class RandomNumbers {
    int minValue;
    int maxValue;

    public void generateRandomNumbers(){
        Random random = new Random();
        int sum = 0;

        while (sum <= 5000){
            int randomNumber = random.nextInt(31);
            sum += randomNumber;

            if (randomNumber < minValue) {
                minValue = randomNumber;
            }

            if (randomNumber > maxValue) {
                maxValue = randomNumber;
            }
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumbers();

        System.out.println("Największa wylosowana wartość: " + randomNumbers.getMaxValue());
        System.out.println("Najmniejsza wylosowana wartość: " + randomNumbers.getMinValue());
    }
}

