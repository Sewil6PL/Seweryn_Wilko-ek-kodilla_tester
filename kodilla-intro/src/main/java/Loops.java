public class Loops {
    public static void main(String[] args){
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for ( int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
        int[] ints = new int[] {10, 15, 2, 1, 70};
        double[] doubles = new double[] {10.0, 15.0, 2.5, 1.1, 70.0};
        Loops app = new Loops();
        System.out.println(app.sumNumbers(doubles));
        System.out.println(app.sumNumbers(ints));
    }

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }

    public double sumNumbers(double[] numbers) {
        double result = 0;
        for (double number : numbers) {
            result = result + number;
        }
        return result;
    }
}
