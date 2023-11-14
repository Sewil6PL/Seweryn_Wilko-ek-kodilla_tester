public class UserValidator {
    private final String name;
    private final double age;
    private final double height;
    public UserValidator(String name, double age, double height){
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

    public void getUser(){
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
class TestApp4{
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator("Jan Nowak", 45, 175);
        userValidator.getUser();
    }
}
