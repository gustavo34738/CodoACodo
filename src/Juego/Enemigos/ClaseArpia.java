package Juego.Enemigos;

public class ClaseArpia extends Enemigo{
int robarVida;
public ClaseArpia(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
public int getRobarVida() {
    return robarVida;
}
public void setRobarVida(int robarVida) {
    this.robarVida = robarVida;
}  

}
