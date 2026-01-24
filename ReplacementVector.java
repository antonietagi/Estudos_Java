import java.util.*;

class ReplacementVector {
  //o parâmetro está com a lista numbers
  public List<Integer> replaceIntegerList(List<Integer> numbers) {
    List<Integer> newList = new ArrayList<>();
    
    
  //usando um forEach, percorre toda a lista numbers
    for (Integer num : numbers) {
      if (num == null || num <= 0) {
        newList.add(1);
      } else {
        newList.add(num);
      }
    }
    return newList;
  }
}

public class Main {
  public static void main(String[] args) {
    ReplacementVector vector = new ReplacementVector();
    
    List<Integer> number = Arrays.asList(18, -1, 0, null, 4);
    
    System.out.println(vector.replaceIntegerList(number));
  }
}
