package Juego.Enemigos;

public class ClaseHidra extends Enemigo {
    
int ataqueCabezas;

 public ClaseHidra(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

public int getAtaqueCabezas() {
    return ataqueCabezas;
}

public void setAtaqueCabezas(int ataqueCabezas) {
    this.ataqueCabezas = ataqueCabezas;
}   

}
