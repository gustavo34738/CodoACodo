package Juego.Enemigos;

public class ClaseTalos extends Enemigo{
        int asesinar;
            public ClaseTalos(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
            public int getAsesinar() {
                return asesinar;
            }
            public void setAsesinar(int asesinar) {
                this.asesinar = asesinar;
            }

}
