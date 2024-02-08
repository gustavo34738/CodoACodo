package Juego.Enemigos;

public class ClaseCiclope extends Enemigo{
  int aplastar;

  public ClaseCiclope(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
    
}

  public int getAplastar() {
    return aplastar;
  }

  public void setAplastar(int aplastar) {
    this.aplastar = aplastar;
  }  
}
