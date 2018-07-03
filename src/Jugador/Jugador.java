package Jugador;

public class Jugador {
  private String nombre;
  private int nroCamiseta;
  private String posicion;
  private int nroGoles;
  private int nroTarjetasAmarillas;
  private int nroTarjetarRojas;
  public Jugador(){
    nombre = "";
    nroCamiseta=0;
    posicion="";
    nroGoles=0;
    nroTarjetasAmarillas=0;
    nroTarjetarRojas=0;
  }
  public Jugador (String nombre, int nroCamiseta, String posicion, int nroGoles, int nroTarjetasAmarillas, int nroTarjetarRojas){
    this.nombre= nombre;
    this.nroCamiseta=nroCamiseta;
    this.posicion=posicion;
    this.nroGoles=nroGoles;
    this.nroTarjetasAmarillas=nroTarjetasAmarillas;
    this.nroTarjetarRojas=nroTarjetarRojas;
  }
  public String getNombre(){
    return this.nombre;
  }
  public int getNroCamiseta(){
    return this.nroCamiseta;
  }
  public String getPosicion(){
    return this.posicion;
  }
  public int getNroGoles(){
    return this.nroGoles;
  }
  public  int getNroTarAmarillas(){
    return this.nroTarjetasAmarillas;
  }
  public int getNroTarRojas(){
    return nroTarjetarRojas;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setNroCamiseta(int nroCamiseta){
    this.nroCamiseta=nroCamiseta;
  }
  public void setPosicion(String posicion){
    this.posicion=posicion;
  }
  public void setNroGoles(int nroGoles){
    this.nroGoles=nroGoles;
  }
  public  void setNroTarAmarillas(int nroTarjetasAmarillas){
    this.nroTarjetasAmarillas=nroTarjetasAmarillas;
  }
  public void setNroTarRojas(int nroTarjetarRojas){
    this.nroTarjetarRojas=nroTarjetarRojas;
  }
  public String  VerificaAmontestacion(){

    if(this.nroTarjetasAmarillas < 2){
       return "*Jugador Habilitado.";
    }
    else
    {
      return "*Jugador No Habilitado y fue expulsado";
    }
  }
  public void RegistrarAmamonestacion(){
	  this.setNroTarAmarillas(getNroTarAmarillas()+1);
	  System.out.println(this.VerificaAmontestacion());
  }
  public void MostrarJugador() {
	  System.out.println("Nombre:"+this.getNombre());
	  System.out.println("Numero de camiseta:"+this.getNroCamiseta());
	  System.out.println("Posicion:"+this.getPosicion());
	  System.out.println("Nro Goles:"+this.getNroGoles());
	  System.out.println("Nro Tar. amarillas:"+this.getNroTarAmarillas());
	  System.out.println("Nro Tar. Rojas:"+this.getNroTarRojas());
	  System.out.println("---------------------------------------");
  }
  public void comparaGoles(Jugador jug) {
		if (this.nroGoles>jug.nroGoles) {
			System.out.println(this.nombre +" Mayores goles que:"+jug.nombre );
		}
		else {
			System.out.println(jug.nombre +" Mayores goles que "+this.nombre );
		}

	}

}
