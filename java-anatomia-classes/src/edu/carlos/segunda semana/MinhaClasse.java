public class MinhaClasse {
  public static void main(String[] args) {

    System.out.println("Olá Mundo!");

    String primeiroNome = "Carlos";
    String segundoNome = "Pabst";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
  }
  
}
