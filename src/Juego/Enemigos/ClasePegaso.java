package Juego.Enemigos;

public class ClasePegaso extends Enemigo {
        
    int ataqueDeViento;
         public ClasePegaso(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
        public int getAtaqueDeViento() {
            return ataqueDeViento;
        }
        public void setAtaqueDeViento(int ataqueDeViento) {
            this.ataqueDeViento = ataqueDeViento;
        }

}
