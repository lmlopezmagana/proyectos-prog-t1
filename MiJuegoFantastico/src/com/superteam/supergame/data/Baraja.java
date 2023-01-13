package com.superteam.supergame.data;

import com.superteam.supergame.model.Carta;

public class Baraja {

	public static final String ORO = "Oro";
	public static final String BASTOS = "Bastos";
	public static final String ESPADAS = "Espadas";
	public static final String COPAS = "Copas";

	private Carta[] baraja;

	public Baraja() {
		baraja = new Carta[12];
		for (int i = 0; i < 12; i++) {
			baraja[i] = new Carta(ORO, i + 1);
		}
	}

	public Carta[] getBaraja() {
		return baraja;
	}

}
