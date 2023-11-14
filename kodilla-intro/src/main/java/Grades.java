public class Grades {
    private final int[] grades;
    private int size;

    public Grades() {
        grades = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == 10) {
            return;
        }
        grades[size] = value;
        size++;

    }

    public int getLastGrades() {
        if (size == 0) {
            System.out.println("Brak dodanych ocen!");
            return -1;
        }
        return grades[size - 1];
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        return sum / size;
    }
}

class TestApp{
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(5);
        grades.add(1);
        System.out.println(grades.getAverageGrade());
        System.out.println(grades.getLastGrades());
    }
}
