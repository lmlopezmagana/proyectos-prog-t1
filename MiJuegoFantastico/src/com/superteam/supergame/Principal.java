package com.superteam.supergame;

import com.superteam.supergame.data.Baraja;
import com.superteam.supergame.model.Carta;
import com.superteam.supergame.model.UnaPartidaDeEsteJuego;

public class Principal {

	public static void main(String[] args) {
		
		UnaPartidaDeEsteJuego unaPartida = new UnaPartidaDeEsteJuego();

		Baraja b = new Baraja();
		
//		for(int i = 0; i < 12; i++) {
//			System.out.println("Carta : " + b.getBaraja()[i].getNumero() + " de " + b.getBaraja()[i].getPalo());
//		}
		
		for(Carta c : b.getBaraja()) {
			System.out.println("Carta : " + c.getNumero() + " de " + c.getPalo());
		}
		
	}

}
