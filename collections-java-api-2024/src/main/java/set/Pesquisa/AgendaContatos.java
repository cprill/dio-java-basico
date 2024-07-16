package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  // atributos
  private Set<Contato> contatoSet;
  
  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatoPorNome = new HashSet<>();
    for(Contato c : contatoSet) {
      if(c.getNome().startsWith(nome)) {
        contatoPorNome.add(c);
      }
    }
    return contatoPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos
    AgendaContatos agendaContatos = new AgendaContatos();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContatos();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("Camila", 123456789);
    agendaContatos.adicionarContato("Camila", 987654321);
    agendaContatos.adicionarContato("Camila Cavalcante", 55555555);
    agendaContatos.adicionarContato("Camila DIO", 88889999);
    agendaContatos.adicionarContato("Maria Silva", 77778888);
//    agendaContatos.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos.exibirContatos();

    // Pesquisando contatos pelo nome
    System.out.println("\n" + agendaContatos.pesquisarPorNome("Maria"));

    // // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Maria Silva", 44443333);
    System.out.println("\n" + "Contato atualizado: " + contatoAtualizado);

    // // Exibindo os contatos atualizados na agenda
    System.out.println("\nContatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }

}
