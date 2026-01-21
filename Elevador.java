public class Elevador {
 private int  pessoasDentro;
 private int capacidade;
 private int pisoTotal;
 private int pisoAtual;
 
 public Elevador (int capacidade, int pisoTotal) {
  this.capacidade = capacidade;
  this.pisoTotal = pisoTotal;
  this.pessoasDentro = 0;
  this.pisoAtual = 0;
 }
 
 //começa no 0, vaia até x. 
 public void subirAndar () {
  if (pisoAtual < pisoTotal) {
   pisoAtual ++;
  }else{
   System.out.println("Chegou ao limite de andares");
  }
 }
 
 //se tocar no -1, para
 public void descerAndar () {
  if (pisoAtual > 0) {
   pisoAtual --;
 }else{
   System.out.println("Você chegou no térreo");
 }
}

 public void entraPessoa () {
  if (pessoasDentro < capacidade) {
   pessoasDentro ++;
  }else{
   System.out.println("Está lotado");
  }
 }
  
 public void saiPessoa () {
  if (pessoasDentro > 0) {
   pessoasDentro --;
  }else{
   System.out.println("Está vazio");
  }
 }
 
 
 public void status () {
  System.out.println("Andar atual: " + pisoAtual);
  System.out.println("Total de pessoas: " + pessoasDentro);
  System.out.println("--------------");
 }
}
