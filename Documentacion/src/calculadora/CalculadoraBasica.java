/**
 * 
 */
package calculadora;

/**
 * Clase que sirve para implementar los métodos más
 * básicos de una calculadora.
 * 
 * Un posible uso sería:
 * 
 * <pre>
 * Calculadora c = new Calculadora();
 * c.sumar(3.0, 4.0);
 * </pre>
 * 
 * <strong>Recuerda que debes instanciar la calculadora antes
 * de usarla, ya que los métodos no son estáticos</strong>
 * 
 * @author Luis Miguel López
 * @version 1.0	
 */
public class CalculadoraBasica {
	
	/**
	 * 
	 */
	public CalculadoraBasica() {
		System.out.println("\r\n"
				+ "       _..._                          _..._                                             .-'''-.                                \r\n"
				+ "    .-'_..._''.           .---.    .-'_..._''.          .---.          _______         '   _    \\                              \r\n"
				+ "  .' .'      '.\\          |   |  .' .'      '.\\         |   |          \\  ___ `'.    /   /` '.   \\                             \r\n"
				+ " / .'                     |   | / .'                    |   |           ' |--.\\  \\  .   |     \\  '                             \r\n"
				+ ". '                       |   |. '                      |   |           | |    \\  ' |   '      |  '.-,.--.                     \r\n"
				+ "| |                 __    |   || |                      |   |    __     | |     |  '\\    \\     / / |  .-. |    __              \r\n"
				+ "| |              .:--.'.  |   || |               _    _ |   | .:--.'.   | |     |  | `.   ` ..' /  | |  | | .:--.'.            \r\n"
				+ ". '             / |   \\ | |   |. '              | '  / ||   |/ |   \\ |  | |     ' .'    '-...-'`   | |  | |/ |   \\ |           \r\n"
				+ " \\ '.          .`\" __ | | |   | \\ '.          ..' | .' ||   |`\" __ | |  | |___.' /'                | |  '- `\" __ | |           \r\n"
				+ "  '. `._____.-'/ .'.''| | |   |  '. `._____.-'//  | /  ||   | .'.''| | /_______.'/                 | |      .'.''| |           \r\n"
				+ "    `-.______ / / /   | |_'---'    `-.______ /|   `'.  |'---'/ /   | |_\\_______|/                  | |     / /   | |_          \r\n"
				+ "             `  \\ \\._,\\ '/                  ` '   .'|  '/    \\ \\._,\\ '/                            |_|     \\ \\._,\\ '/          \r\n"
				+ "                 `--'  `\"                      `-'  `--'      `--'  `\"                                      `--'  `\"           \r\n"
				+ "");
	}
	
	public double sumar(double a, double b) {
		return a+b;
	}
	
	public double restar(double a, double b) {
		return a-b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	/**
	 * Método que sirve para calcular la división con
	 * decimales
	 * 
	 * @param dividendo 
	 * @param divisor 
	 * @return Resultado de la división
	 * @throws ArithmeticException En caso de tratar de dividir entre 0
	 */
	public double dividir(double dividendo, double divisor) throws ArithmeticException {
		return dividendo/divisor;
	}
	
	
	/**
	 * 
	 * Método que calcula el máximo común divisor de dos números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int mcd(int a, int b) {
		
		/*
		   	Implementamos el cálculo mediante el método
		   	de Ruffini porque otras aproximaciones son
		   	menos eficientes		  		
		 */
		int temporal; // Para no perder b
	    while (b != 0) {
	        temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    return a;
	}
	
	
}
