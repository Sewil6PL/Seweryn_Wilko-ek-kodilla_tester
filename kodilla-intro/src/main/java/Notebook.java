public class Notebook {
    int weight;
    int price;
    int yearOfProduction;

    public Notebook(int weight, int price, int yearOfProduction) {
        this.weight = weight;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }

    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight < 1500) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is heavy.");
        }


    }

    public void checkerOfProduction() {
        if (yearOfProduction <= 2014) {
            System.out.println("This notebook is old" + ((price < 800) ? "but cheap" : "and expensive"));
        } else if (yearOfProduction <= 2019) {
            if (price < 800) {
                System.out.println("This notebook is not old and it is cheap.");
            } else {
                System.out.println("This notebook is not old but expensive");
            }

        } else {
            if (price < 800) {
                System.out.println("This notebook is new and cheap.");
            } else {
                System.out.println("This notebook is new and expensive");
            }
        }
    }
}
