package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class ListaTarefa {
  //atributo
  private List<Tarefa> tarefaList;

  //construtor
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adiocionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefaParaRemover = new ArrayList<>();
    for(Tarefa t : tarefaList){
      if(t.getDescrição().equalsIgnoreCase(descricao)){
        tarefaParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefaParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
  
    
    listaTarefa.adiocionarTarefa("Tarefa 1");
    listaTarefa.adiocionarTarefa("Tarefa 1");
    listaTarefa.adiocionarTarefa("Tarefa 2");

    System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();

    
  }
}
