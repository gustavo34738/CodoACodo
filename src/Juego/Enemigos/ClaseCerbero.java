package Juego.Enemigos;

public class ClaseCerbero extends Enemigo {

  int ataqueDeTresCabezas;
  
  public ClaseCerbero(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

  public int getAtaqueDeTresCabezas() {
    return ataqueDeTresCabezas;
  }

  public void setAtaqueDeTresCabezas(int ataqueDeTresCabezas) {
    this.ataqueDeTresCabezas = ataqueDeTresCabezas;
  }      
}
