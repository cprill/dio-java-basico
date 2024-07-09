public class MSNMessenger {
  public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem");
		
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
		
		
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	public void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}

