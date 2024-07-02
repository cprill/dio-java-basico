public class ResultadoEscolar {
  public static void main(String[] args) {

/* 
    // int nota = 6;
    int nota = 8;
    if(nota >= 7)
     System.out.println("Aprovado");
    else if (nota >=  5 && nota < 7)
    System.out.println("Prova de Recuperação");
    else
     System.out.println("Reprovado");
 */     

/* 
    // Cenário 1
    int nota = 7;
    String resultado = nota >=7 ? "Aprovado" : "Reprovado";
    System.out.println(resultado);
 */
    // Cenário 1
    int nota = 6;
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);


  }
}
