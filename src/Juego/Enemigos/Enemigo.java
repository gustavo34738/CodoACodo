package Juego.Enemigos;

import java.util.Random;

public class Enemigo{
private String nombre;
private int fuerza=1;
private int agilidad=1;
private int inteligencia=1;
private int constitucion=1; 
private int nivel=1;
private int vida=1;
private int ataque=1;
private int ataqueMagico=1;
private int defensa=1;
private int experiencia=0;
private int mana=1;
private String clase;
private int golpeCritico;
private int mobnivel=(int)(Math.random()*10+1);
private int mobexperiancia=(int)(Math.random()*150+1);



    public Enemigo(String nombre, int fuerza, int agilidad, int inteligencia, int constitucion, String clase,
    int mobexperiancia) {
    this.nombre = nombre;
    this.fuerza = fuerza;
    this.agilidad = agilidad;
    this.inteligencia = inteligencia;
    this.constitucion = constitucion;
    this.clase = clase;
    this.mobexperiancia = mobexperiancia;
}

    public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getFuerza() {
    return fuerza;
}

public void setFuerza(int fuerza) {
    this.fuerza = fuerza;
}

public int getAgilidad() {
    return agilidad;
}

public void setAgilidad(int agilidad) {
    this.agilidad = agilidad;
}

public int getInteligencia() {
    return inteligencia;
}

public void setInteligencia(int inteligencia) {
    this.inteligencia = inteligencia;
}

public int getConstitucion() {
    return constitucion;
}

public void setConstitucion(int constitucion) {
    this.constitucion = constitucion;
}

public int getNivel() {
    return nivel;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public int getVida() {
    return vida;
}

public void setVida(int vida) {
    this.vida = vida;
}

public int getAtaque() {
    return ataque;
}

public void setAtaque(int ataque) {
    this.ataque = ataque;
}

public int getAtaqueMagico() {
    return ataqueMagico;
}

public void setAtaqueMagico(int ataqueMagico) {
    this.ataqueMagico = ataqueMagico;
}

public int getDefensa() {
    return defensa;
}

public void setDefensa(int defensa) {
    this.defensa = defensa;
}

public int getExperiencia() {
    return experiencia;
}

public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
}

public int getMana() {
    return mana;
}

public void setMana(int mana) {
    this.mana = mana;
}

public String getClase() {
    return clase;
}

public void setClase(String clase) {
    this.clase = clase;
}

public int getGolpeCritico() {
    return golpeCritico;
}

public void setGolpeCritico(int golpeCritico) {
    this.golpeCritico = golpeCritico;
}

    Random azar = new Random();

    
    public Random getAzar() {
        return azar;
    }

    public void setAzar(Random azar) {
        this.azar = azar;
    }

    public int getMobnivel() {
        return mobnivel;
    }

    public void setMobnivel(int mobnivel) {
        this.mobnivel = mobnivel;
    }

    public int getMobexperiancia() {
        return mobexperiancia;
    }

    public void setMobexperiancia(int mobexperiancia) {
        this.mobexperiancia = mobexperiancia;
    }

public int atacar() {
    Random azar = new Random();
    //Ataque mínimo: 1, Maximo: según nivel de ataque
    int puntosAtaque = azar.nextInt(ataque) + 1;
    
    return puntosAtaque;
}
public int defender() {
    Random azar = new Random();
    //Ataque mínimo: 1, Maximo: según nivel de ataque
    int puntosDefensa = azar.nextInt(defensa) + 1;
    
    return puntosDefensa;
}

}
