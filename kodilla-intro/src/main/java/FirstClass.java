public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500 , 2023);
        System.out.println(notebook.weight + " " + notebook.price + " "+ notebook.yearOfProduction);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkerOfProduction();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.yearOfProduction );
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkerOfProduction();

        Notebook oldNotebook = new Notebook(1600, 700, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.yearOfProduction);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkerOfProduction();


    }
}
