package calculadora;

import java.util.Arrays;

/**
 * Calculadora avanzada que incluye la posibilidad de
 * cálculos estadísticos
 * @author lmlopez
 * @version 1.1
 */
public class CalculadoraEstadistica extends CalculadoraBasica {
	
	
	/**
	 * Constructor que completa el banner de la calculadora
	 */
	public CalculadoraEstadistica() {
		super();
		System.out.println("\r\n"
				+ " _______  _______ _________ _______  ______  _________ _______ __________________ _______  _______ \r\n"
				+ "(  ____ \\(  ____ \\\\__   __/(  ___  )(  __  \\ \\__   __/(  ____ \\\\__   __/\\__   __/(  ____ \\(  ___  )\r\n"
				+ "| (    \\/| (    \\/   ) (   | (   ) || (  \\  )   ) (   | (    \\/   ) (      ) (   | (    \\/| (   ) |\r\n"
				+ "| (__    | (_____    | |   | (___) || |   ) |   | |   | (_____    | |      | |   | |      | (___) |\r\n"
				+ "|  __)   (_____  )   | |   |  ___  || |   | |   | |   (_____  )   | |      | |   | |      |  ___  |\r\n"
				+ "| (            ) |   | |   | (   ) || |   ) |   | |         ) |   | |      | |   | |      | (   ) |\r\n"
				+ "| (____/\\/\\____) |   | |   | )   ( || (__/  )___) (___/\\____) |   | |   ___) (___| (____/\\| )   ( |\r\n"
				+ "(_______/\\_______)   )_(   |/     \\|(______/ \\_______/\\_______)   )_(   \\_______/(_______/|/     \\|\r\n"
				+ "                                                                                                   \r\n"
				+ "");
	}
	

	/**
	 * Método que calcula la media aritmética
	 * de una serie de números
	 * @param args Números sobre los que calcular la media
	 * @return Media de los números. Si no se pasan argumentos, se devuelve 0.
	 */
	public double mediaAritmetica(double... args) {
		if (args.length != 0) {
			return Arrays.stream(args)
					.average().getAsDouble();
		}
		
		return 0.0;
	}


	/**
	 * Se sustituye la implementación con Ruffini
	 * por una implementación recursiva.
	 */
	@Override
	public int mcd(int a, int b) {
		if (b == 0) return a;
	    return mcd(b, a % b);	
	}
	
	
	
	
	

}
