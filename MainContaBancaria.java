public class Main {
 public static void main (String[] args) {
  
  ContaBancaria conta = new ContaBancaria (500);
  
  conta.depositar(200);
  conta.status();
  conta.depositar(100);
  conta.status();
  
  
  conta.sacar(250);
  conta.status();
  conta.sacar(-30);
  conta.status();
  
  
  
 }
}
