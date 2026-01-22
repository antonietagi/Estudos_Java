import java.util.*;

class Contato {
  private int telefone;
  private String nome;
  
  public Contato(int telefone, String nome) {
    this.telefone = telefone;
    this.nome = nome;
  }
  
  public int getTelefone() {
    return telefone;
  }
  
  public String getNome() {
    return nome;
  }
}

class Agenda {
    Map<Integer, Contato> contatos = new HashMap<>();
    
    
    public void adicionarContato(Contato contato) {
      if(contatos.containsKey(contato.getTelefone())) {
        System.out.println("Contato já existe");
      } else {
        contatos.put(contato.getTelefone(), contato);
      }
    }
    
    public void listarContato() {
      for(Map.Entry<Integer, Contato> entry : contatos.entrySet()) {
        
        Integer telefone = entry.getKey();
        Contato contato = entry.getValue();
        
        System.out.println(telefone + "-" + contato.getNome());
      }
    }
}


public class Main {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    
    Contato contato1 = new Contato(18, "Giovanna");
    Contato contato2 = new Contato(26, "Guilherme");
    
    agenda.adicionarContato(contato1);
    agenda.adicionarContato(contato2);
    
    agenda.listarContato();
  }
}
