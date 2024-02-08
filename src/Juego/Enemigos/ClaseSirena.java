package Juego.Enemigos;

public class ClaseSirena  extends Enemigo{
    int cantoDeSirena;
    
            public ClaseSirena(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

            public int getCantoDeSirena() {
                return cantoDeSirena;
            }

            public void setCantoDeSirena(int cantoDeSirena) {
                this.cantoDeSirena = cantoDeSirena;
            }

}
