package Juego.Personajes;

public class ClaseAsesino extends Personaje {
private int golpeMortal;
private int evasion;
private int tiroConArco;





public ClaseAsesino(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase){
    super(nombre, fuerza, agilidad, inteligencia, clase);

}
    
public int getGolpeMortal() {
    return golpeMortal;
}


public void setGolpeMortal(int golpeMortal) {
    this.golpeMortal = golpeMortal;
}


public int getEvasion() {
    return evasion;
}


public void setEvasion(int evasion) {
    this.evasion = evasion;
}


public int getTiroConArco() {
    return tiroConArco;
}


public void setTiroConArco(int tiroConArco) {
    this.tiroConArco = tiroConArco;
}



}
