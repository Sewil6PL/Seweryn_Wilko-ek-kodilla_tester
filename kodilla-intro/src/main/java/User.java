public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Maciej", 25);
        users[1] = new User("Iga", 30);
        users[2] = new User("Adrian", 50);
        users[3] = new User("Wiola", 35);
        users[4] = new User("Agnieszka", 28);

        int totalAge = 0;


        for (User user : users) {
            totalAge += user.getAge();
        }


        double averageAge = (double) totalAge / users.length;
        System.out.println("Średnia wieku:" + averageAge);

        for (User user : users) {
            if (user.getAge() < averageAge) {
                System.out.println("Imię:" + user.getName());
                System.out.println("Wiek:" + user.getAge());
            }
        }
    }
}


