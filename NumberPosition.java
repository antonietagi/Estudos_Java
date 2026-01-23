import java.util.*;

class NumberPosition {
  
  public Integer getHighestNumberPosition(List<Integer> values) {
    int highest = values.get(0); //pega o elemento da lista values na pos 0
    
    for (int i = 1; i < values.size(); i++) {
      if (values.get(i) > highest) { 
        highest = values.get(i); //se o values for maior, atribui ao highest
      }
    }
    return highest;
  }
  
  public Integer getIndexHighestNumberPosition(List<Integer> values) {
    int highest = values.get(0);
    
    int index = 0;
    
    for (int i = 1; i < values.size(); i++) {
      if(values.get(i) > highest) {
        highest = values.get(i);
        index = i;
      }
    }
    return index;
  }
}

public class Main {
  public static void main(String[] args) {
    
    NumberPosition number = new NumberPosition();
    
    List<Integer> values = Arrays.asList(9, 7, 6, 3, 10);
    
    System.out.println("Maior número: " + number.getHighestNumberPosition(values));
    System.out.println("Índice do maior número: " + number.getIndexHighestNumberPosition(values));
  }
}
