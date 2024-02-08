package Juego.Enemigos;

public class ClaseCentauro extends Enemigo {

int golpeConFuria;

 public ClaseCentauro(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

public int getGolpeConFuria() {
    return golpeConFuria;
}

public void setGolpeConFuria(int golpeConFuria) {
    this.golpeConFuria = golpeConFuria;
}     
}
