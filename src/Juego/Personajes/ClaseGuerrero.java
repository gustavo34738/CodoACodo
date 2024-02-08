package Juego.Personajes;

public class ClaseGuerrero extends Personaje{
    int defEscudo;
    int ataqueFuerte;
public ClaseGuerrero(String nombre, int fuerza, int agilidad, int inteligencia, String raza){
    super(nombre, fuerza, agilidad, inteligencia, raza);
}
public int getDefEscudo() {
    return defEscudo;
}
public void setDefEscudo(int defEscudo) {
    this.defEscudo = defEscudo;
}
public int getAtaqueFuerte() {
    return ataqueFuerte;
}
public void setAtaqueFuerte(int ataqueFuerte) {
    this.ataqueFuerte = ataqueFuerte;
}

}
