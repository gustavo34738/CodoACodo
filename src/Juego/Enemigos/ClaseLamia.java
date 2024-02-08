package Juego.Enemigos;

public class ClaseLamia extends Enemigo {

    int atraparYMorder;
   
     public ClaseLamia(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

    public int getAtraparYMorder() {
        return atraparYMorder;
    }

    public void setAtraparYMorder(int atraparYMorder) {
        this.atraparYMorder = atraparYMorder;
    }   

}
