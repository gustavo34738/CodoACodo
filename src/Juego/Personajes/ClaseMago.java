package Juego.Personajes;

public class ClaseMago extends Personaje{
private int bolaDeFuego;
private int rayo;
private int heal;

public ClaseMago(String nombre, int fuerza, int agilidad, int inteligencia, String clase){
    super(nombre, fuerza, agilidad, inteligencia, clase);
}
public int getBolaDeFuego() {
    return bolaDeFuego;
}
public void setBolaDeFuego(int bolaDeFuego) {
    this.bolaDeFuego = bolaDeFuego;
}
public int getRayo() {
    return rayo;
}
public void setRayo(int rayo) {
    this.rayo = rayo;
}
public int getHeal() {
    return heal;
}
public void setHeal(int heal) {
    this.heal = heal;
}
}
