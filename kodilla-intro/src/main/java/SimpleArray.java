public class SimpleArray {
    public static void main(String[] args) {
        String[] ksiazki = new String[5];
        ksiazki[0] = "Wiedzmin";
        ksiazki[1] = "Sherlock Holmes ";
        ksiazki[2] = "Percy Jackson";
        ksiazki[3] = "Clovis LaFay. Magiczne akta Scotland Yardu";
        ksiazki[4] = "Legion";
        System.out.println("Ksiazka nr 2:");
        String ksiazka = ksiazki[2];
        System.out.println(ksiazka);
        int numberOfElements = ksiazki.length;
        System.out.println("Ilosc ksiazek w tablicy:");
        System.out.println(numberOfElements);
    }
}

