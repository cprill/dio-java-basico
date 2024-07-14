package main.java.list.OperacoesBasicas;

public class Tarefa {
  //atributo
  private String descrição;

  public Tarefa(String descrição) {
    this.descrição = descrição;
  }

  public String getDescrição() {
    return descrição;
  }

  @Override
  public String toString() {
    //return "Tarefa [descrição=" + descrição + "]";
    // return "Tarefa{" + "descrição='" + descrição + '\'' + '}';
    return descrição;
  }

    
}
