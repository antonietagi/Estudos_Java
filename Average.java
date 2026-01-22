class Average {
  private double workGrade;
  private double testGrade;
  private double finalTest;
  
  public Average(double workGrade, double testGrade, double finalTest) {
    this.workGrade = workGrade;
    this.testGrade = testGrade;
    this.finalTest = finalTest;
  }
  
  public double calculateAverage() {
    return (workGrade * 2 + testGrade * 3 + finalTest * 5)/10;
  }
}

public class Main {
  public static void main(String[] args) {
    Average average = new Average(7.0, 8.0, 9.5);
    
  
    
    System.out.println("Média final: " + average.calculateAverage());
  }
}
