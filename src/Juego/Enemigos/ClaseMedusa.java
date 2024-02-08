package Juego.Enemigos;

public class ClaseMedusa extends Enemigo {
    int paralizar;
     public ClaseMedusa(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
    public int getParalizar() {
        return paralizar;
    }
    public void setParalizar(int paralizar) {
        this.paralizar = paralizar;
    } 

}
