import java.util.*;

class OddNumber {
  
   public List<Integer> checkOddNumberQuantity(int number) {
     List<Integer> oddNumbers = new ArrayList<>();
     
      for (int i=1; i <= number; i++) {
        if (i % 2 != 0) {
          oddNumbers.add(i);
        }
      }
      return oddNumbers;
    }
}


public class Main {
  public static void main(String[] args) {
    OddNumber oddnumber = new OddNumber ();
    
    System.out.println(oddnumber.checkOddNumberQuantity(30));
  }
}

