/* java.util.*;

class PairNumber {

  public Integer checkPairNumbers(List<Integer> values) {
    List<Integer> pairNumbers = new ArrayList<>();

    for (int i = 0; i < values.size(); i++) {
      if (values.get(i) % 2 == 0) {
        pairNumbers.add(values.get(i));
      }
    }

    return pairNumbers.size();
  }
}

public class Main {
  public static void main(String[] args) {
    PairNumber pair = new PairNumber();
    List<Integer> values = Arrays.asList(4, 8, 9, 11, 12, -8);

    System.out.println(pair.checkPairNumbers(values));
  }
}
*/
