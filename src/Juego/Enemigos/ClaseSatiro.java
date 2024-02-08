package Juego.Enemigos;

public class ClaseSatiro extends Enemigo {
    int ataqueDeCuernos;
        public ClaseSatiro(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
        public int getAtaqueDeCuernos() {
            return ataqueDeCuernos;
        }
        public void setAtaqueDeCuernos(int ataqueDeCuernos) {
            this.ataqueDeCuernos = ataqueDeCuernos;
        }

}
