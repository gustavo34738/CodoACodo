package Juego.Enemigos;

public class ClaseDriados extends Enemigo {
    int ataqueConRaices;
    
public ClaseDriados(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}

public int getAtaqueConRaices() {
    return ataqueConRaices;
}

public void setAtaqueConRaices(int ataqueConRaices) {
    this.ataqueConRaices = ataqueConRaices;
}   

    
}
