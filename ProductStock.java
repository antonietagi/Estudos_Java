import java.util.*;
//codigo e nome
class ProductStock {
  
  Map<Integer, String> products = new HashMap<>();
  
  public void addProducts(Integer code, String nome) {
    if (products.containsKey(code)) {
      System.out.println("Produto já cadastrado");
    } else {
      products.put(code, nome); //adiciona aos produtos se não existir
    }
  }
  
  public Integer getTotalProducts() {
    return products.size(); //vai retornar a quantidade de produtos
  }
  
  public String getProductName(Integer code) {
    if (products.containsKey(code)) {
      return products.get(code); //retorna o valor associado ao code, o nome, uma STR
    } else {
      return "Não cadastrado";
    }
  }
}

public class Main {
  public static void main(String[] args) {
    ProductStock product = new ProductStock();
    
    product.addProducts(18, "Chilenitos");
    product.addProducts(20, "Costa Rama");
    product.addProducts(18, "Cherry Chocolate");
    
    System.out.println("Produtos: " + product.getTotalProducts());
    System.out.println(product.getProductName(18));
    
  }
}
