public class Main {
 
 public static void main (String [] args) {
  
  Elevador elevador = new Elevador (6, 14);
  
  elevador.status();
  
  elevador.entraPessoa();
  elevador.entraPessoa();
  elevador.entraPessoa();
  elevador.status();
  
  elevador.saiPessoa();
  elevador.status();
  
  elevador.subirAndar();
  elevador.subirAndar();
  elevador.status();
  
  elevador.descerAndar();
  elevador.status();
 }
}
