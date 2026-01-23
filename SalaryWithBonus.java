class SalaryWithBonus {
  
  
  public double calculateSalaryWithBonus(double x, double y) {
    return x + (y * 0.15);
  }
}

public class Main {
  public static void main(String[] args) {
    
    SalaryWithBonus salary = new SalaryWithBonus();
    
    System.out.println("Salário:  " + salary.calculateSalaryWithBonus(1000.5, 500.8));
  }
}
