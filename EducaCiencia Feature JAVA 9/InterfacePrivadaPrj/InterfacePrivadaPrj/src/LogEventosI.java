
public interface LogEventosI {
	
	default void logInfo(String mensagem) {
		log(mensagem, "INFO");
	}

	default void logWarn(String mensagem) {
		log(mensagem, "WARN");
	}

	default void logError(String mensagem) {
		log(mensagem, "ERROR");
	}

	default void logFatal(String mensagem) {
		log(mensagem, "FATAL");
	}
	
	//New feature Java 9
	private void log(String mensagem, String tipo) {
		System.out.println("INÍCIO DA MENSAGEM");
		
		System.out.println(tipo + ": " + mensagem);
		
		System.out.println("FIM DA MENSAGEM");
	}


}
