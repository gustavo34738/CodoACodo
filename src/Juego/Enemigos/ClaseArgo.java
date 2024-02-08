package Juego.Enemigos;

public class ClaseArgo extends Enemigo{
int verTodo;
public ClaseArgo(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase, int mobexperiancia){
    super(nombre, fuerza, agilidad, inteligencia, constitucion, clase, mobexperiancia);
}
public int getVerTodo() {
    return verTodo;
}
public void setVerTodo(int verTodo) {
    this.verTodo = verTodo;
}

 
}
