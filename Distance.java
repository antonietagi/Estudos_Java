class Distance {
  private double x1;
  private double y1;
  private double x2;
  private double y2;
  
  public Distance(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  public double calculateDistanceBetweenTwoPoints() {
    double dx = x2 - x1;
    double dy = y2 - y1;
    
    return Math.sqrt(dx * dx + dy * dy);
  }
}

public class Main {
  public static void main(String[] args) {
    Distance distance = new Distance(4.8, 8.4, 7.4, 5.6);
    
    System.out.println("Distância Total: " + distance.calculateDistanceBetweenTwoPoints());
  }
}
