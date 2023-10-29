public class Loops {
    String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

    {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
        public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}