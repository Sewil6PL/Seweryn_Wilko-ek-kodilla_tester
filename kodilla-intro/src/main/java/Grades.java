public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }
    public void add (int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;

        }

    public int getLastGrades() {
        if (size == 0){
            System.out.println("Brak dodanych ocen!");
            return -1;
        }
        return grades [size - 1];
    }
    public double getAverageGrade(double[] grades){
        double sum = 0;
        int numberOfGrade = grades.length;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum / numberOfGrade;
    }
}
