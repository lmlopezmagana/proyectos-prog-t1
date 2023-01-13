package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aleatorio aleatorio = new Aleatorio();
		
		int j1 = aleatorio.chinos();
		int j2 = aleatorio.chinos();
		int j3 = aleatorio.chinos();
		
		int totalj1 = 5;
		int totalj2 = 7;
		int totalj3 = 3;
		
		int total = j1+j2+j3;
		
		System.out.println("El total de monedas que se han sacado es " + total);
		
		if (totalj1 == total) {
			System.out.println("El jugador 1 ha ganado");
		} else {			
			System.out.println("El jugador 1 no ha ganado");
		}
		
		if (totalj2 == total) {
			System.out.println("El jugador 2 ha ganado");
		} else {			
			System.out.println("El jugador 2 no ha ganado");
		}
		
		if (totalj3 == total) {
			System.out.println("El jugador 3 ha ganado");
		} else {			
			System.out.println("El jugador 3 no ha ganado");
		}
		
	}

}
