package Juego.Personajes;

import java.util.Random;

public class Personaje {
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

Personaje(String nombre, int fuerza, int agilidad, int inteligencia, String clase){
    this.nombre=nombre;
    this.fuerza=fuerza;
    this.agilidad=agilidad;
    this.inteligencia=inteligencia;
    this.clase=clase;
}


public int getExperiencia() {
    return experiencia;
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
public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
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
public int getDefensa() {
    return defensa;
}
public void setDefensa(int defensa) {
    this.defensa = defensa;
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
public int getConstitucion() { 
    return constitucion;
}
public void setConstitucion(int constitucion) { 
    this.constitucion = constitucion;
}
public int getAtaqueMagico() {
    return ataqueMagico;
}
public void setAtaqueMagico(int ataqueMagico) {
    this.ataqueMagico = ataqueMagico;
}
public int getGolpeCritico() {
    return golpeCritico;
}
public void setGolpeCritico(int golpeCritico) {
    this.golpeCritico = golpeCritico;
}

}
