package Jugador;

public class Main {

	public static void main(String[] args) {
		Jugador jugador1  = new Jugador("Mario", 1, "mediocampo",0,0,0);
		Jugador jugador2  = new Jugador("Pedro", 3, "delantero",0,0,0);
		// TODO Auto-generated method stub
		jugador1.MostrarJugador();
		jugador2.MostrarJugador();


		System.out.println("-----Registrar 2 amonestaciones a jugador 1------");

		System.out.println(">>>Registrar amonestacion");
		jugador1.RegistrarAmamonestacion();
		jugador1.MostrarJugador();

		System.out.println(">>>Registrar amonestacion");
		jugador1.RegistrarAmamonestacion();
		jugador1.MostrarJugador();


		System.out.println("---------------------------------------------");

		System.out.println("--------Registrar goles --------");
		jugador1.setNroGoles(2);
		jugador2.setNroGoles(5);
		System.out.println(jugador1.getNombre()+":"+jugador1.getNroGoles());
		System.out.println(jugador2.getNombre()+":"+jugador2.getNroGoles());


		System.out.println("--------Verifica mayor cantidad de goles--------");
		jugador1.comparaGoles(jugador2);
	}

}
