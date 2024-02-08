package Juego.Enemigos;

public class ClaseQuimera extends Enemigo{

    int morder;

    public ClaseQuimera(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
    
}

    public int getMorder() {
        return morder;
    }

    public void setMorder(int morder) {
        this.morder = morder;
    }
}
