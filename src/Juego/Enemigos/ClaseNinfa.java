package Juego.Enemigos;

public class ClaseNinfa extends Enemigo {
    
        int encantar;
         public ClaseNinfa(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
        public int getEncantar() {
            return encantar;
        }
        public void setEncantar(int encantar) {
            this.encantar = encantar;
        }

}
