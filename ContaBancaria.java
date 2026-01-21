public class ContaBancaria {
 private double saldo;
 private double limite;

 public ContaBancaria(double limite) {
  this.limite = limite;
  this.saldo = 0;
  }
 
 public void depositar(double valor) {
  if (valor > 0){
   saldo += valor;
 }else{
  System.out.println("O valor não pode ser negativo");
  }
 }

 public void sacar(double valor) {
  if (valor > 0 && valor < saldo + limite) {
   saldo -= valor;
  }else{
   System.out.println("Não é permitido sacar um valor maior do que o saldo");
  }
 }
 
 public void status() {
  System.out.println("Saldo Atual: " + saldo);
  System.out.println("Limite Atual: " + limite);
 }
}
