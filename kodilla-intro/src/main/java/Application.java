public class Application {
    String name;
    double age;
    double height;
    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

    public void getApplication(){
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
    
}
