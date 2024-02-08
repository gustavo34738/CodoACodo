package Juego.Enemigos;

public class ClaseMinotauro extends Enemigo {
int furia;
         public ClaseMinotauro(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
        public int getFuria() {
            return furia;
        }
        public void setFuria(int furia) {
            this.furia = furia;
        }

}
