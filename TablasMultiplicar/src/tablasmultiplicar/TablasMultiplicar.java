package tablasmultiplicar;

public class TablasMultiplicar {

	public static void main(String[] args) {

		//TODO Terminar este m�todo
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d*%d = %d\n", i, j, i * j);
			}
			System.out.println("");
		}

	}

}