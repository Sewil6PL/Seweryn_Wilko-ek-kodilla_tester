public class LeapYear {
    public static void main(String[] args) {
        int rok = 2023;
        if (rok % 4 == 0) {
            System.out.println("Przestepny.");
        } else if (rok % 100 != 0) System.out.println("Przestepny.");
        else if (rok % 400 == 0){
            System.out.println("Przestepny.");
        }else{
            System.out.println("Nie przestepny.");
        }

    }
}

