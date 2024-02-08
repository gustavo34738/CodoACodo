package Juego;

import java.util.Random;
import java.util.Scanner;

import Juego.Enemigos.ClaseArgo;
import Juego.Enemigos.ClaseArpia;
import Juego.Enemigos.ClaseCentauro;
import Juego.Enemigos.ClaseCerbero;
import Juego.Enemigos.ClaseCiclope;
import Juego.Enemigos.ClaseDriados;
import Juego.Enemigos.ClaseHidra;
import Juego.Enemigos.ClaseLamia;
import Juego.Enemigos.ClaseMedusa;
import Juego.Enemigos.ClaseMinotauro;
import Juego.Enemigos.ClaseNinfa;
import Juego.Enemigos.ClasePegaso;
import Juego.Enemigos.ClaseQuimera;
import Juego.Enemigos.ClaseSatiro;
import Juego.Enemigos.ClaseSirena;
import Juego.Enemigos.ClaseTalos;
import Juego.Enemigos.Enemigo;
import Juego.Personajes.ClaseAsesino;
import Juego.Personajes.ClaseGuerrero;
import Juego.Personajes.ClaseMago;
import Juego.Personajes.Personaje;


public class App {
    
    //intento de IA:
    static void iaEnemiga(int danioEnemigo, int danio){
        System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET     +ANSI_YELLOW+" Esta decidiendo..."+ANSI_RESET);
        if(enemigo.getClase()=="irracional"){
        Random opcion = new Random();
        int valor=(int)(opcion.nextInt(3)+1);
        switch(valor){
            case 1: System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET     +ANSI_YELLOW+" Te ataca"+ANSI_RESET);
                    danioEnemigo=enemigo.atacar();
                    System.out.println(ANSI_WHITE+"Tu enemigo te hizo: "+ANSI_RESET+ANSI_RED + danioEnemigo +ANSI_RESET+ANSI_WHITE+ " Puntos de danio"+ANSI_RESET);
                    jugador.setVida(jugador.getVida()-danioEnemigo);
            break;
            case 2: 
                    if(enemigo.getMana()<=0)
                        { 
                        danioEnemigo=enemigo.atacar();
                        System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" Se intenta tomar una pocion de vida"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Se da cuenta que el frasco esta vacio...");
                        System.out.println(ANSI_YELLOW+"Se enoja y te arroja el frasco");
                        System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET  +ANSI_YELLOW+"te hace"+ANSI_RESET+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+"puntos de danio");
                        }
                        else{
                        danioEnemigo=0;
                        System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET     +ANSI_YELLOW+" Se acaba de tomar una pocion de vida"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Aumentando su vida en: "+ANSI_RED+"25"+ANSI_RESET+ANSI_YELLOW+" puntos"+ANSI_RESET);
                        enemigo.setVida(enemigo.getVida()+25);
                        System.out.println("Su vida ahora es de: "+enemigo.getVida()+" Puntos");
                        enemigo.setMana(enemigo.getMana()-4*jugador.getNivel());
                        }
            break;
            case 3: System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" utiliza una habilidad"+ANSI_RESET);
                    //aca van segun cada instancia
                    if(enemigo instanceof ClaseCentauro){
                        ((ClaseCentauro) enemigo).setGolpeConFuria((enemigo.getFuerza()*2)*jugador.getNivel());
                        danioEnemigo=((ClaseCentauro) enemigo).getGolpeConFuria();
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                    System.out.println(ANSI_WHITE+"Tu utiliza su ataque con furia y te hizo: "+ANSI_RESET+ANSI_RED + ((ClaseCentauro) enemigo).getGolpeConFuria() +ANSI_RESET+ANSI_WHITE+ " Puntos de danio"+ANSI_RESET);
                    }
                    else if(enemigo instanceof ClaseCerbero){   
                        ((ClaseCerbero) enemigo).setAtaqueDeTresCabezas(enemigo.atacar());
                        danioEnemigo=((ClaseCerbero) enemigo).getAtaqueDeTresCabezas();
                        System.out.println(ANSI_YELLOW+"Tu enemigo te ataca con sus tres cabezas"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Te golpea tres veces"+ANSI_RESET);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Primer ataque, recibes: " +ANSI_RESET+ANSI_RED +((ClaseCerbero) enemigo).getAtaqueDeTresCabezas() +ANSI_RESET+ANSI_WHITE + " Puntos de Danio" + ANSI_RESET);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Segundo ataque, recibes: " +ANSI_RESET+ANSI_RED + ((ClaseCerbero) enemigo).getAtaqueDeTresCabezas() +ANSI_RESET+ANSI_WHITE + " Puntos de Danio" + ANSI_RESET);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Tercer ataque, recibes: "+ANSI_RESET+ANSI_RED + ((ClaseCerbero) enemigo).getAtaqueDeTresCabezas() +ANSI_RESET+ANSI_WHITE + " Puntos de Danio" + ANSI_RESET);
                    }
                    else if(enemigo instanceof ClaseCiclope){
                        ((ClaseCiclope) enemigo).setAplastar(enemigo.getFuerza()*4);
                        danioEnemigo=((ClaseCiclope) enemigo).getAplastar();
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Tu enemigo te aplasta haciendote: "+ANSI_RESET+ANSI_RED + ((ClaseCiclope) enemigo).getAplastar()+ANSI_RESET+ANSI_WHITE + "Puntos de danio" + ANSI_RESET);

                    }
                    else if(enemigo instanceof ClaseHidra){
                        Random cabezas = new Random();
                        int totalCabezas=cabezas.nextInt(6)+1;
                        ((ClaseHidra) enemigo).setAtaqueCabezas(enemigo.atacar()*totalCabezas);
                        danioEnemigo=((ClaseHidra) enemigo).getAtaqueCabezas();
                        System.out.println(ANSI_YELLOW+ "La hidra tiene: "+totalCabezas + " cabezas"+ANSI_RESET);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Tu enemigo te golpea con todas las cabezas a la vez: "+ANSI_RESET+ANSI_RED + ((ClaseHidra) enemigo).getAtaqueCabezas()+ANSI_RESET+ANSI_WHITE + " Puntos de danio"+ ANSI_RESET);
                        
                    }
                    else if(enemigo instanceof ClaseMinotauro){
                        Random GOLPES = new Random();
                        int totalGolpes=GOLPES.nextInt(4)+1;

                        ((ClaseMinotauro) enemigo).setFuria(enemigo.atacar()*totalGolpes);
                        danioEnemigo=((ClaseMinotauro) enemigo).getFuria();
                        System.out.println(ANSI_WHITE+"Tu enemigo te aca con furia unas: "+ANSI_RESET+ANSI_RED + totalGolpes +ANSI_RESET+ANSI_WHITE +" Veces"+ANSI_RESET);
                        jugador.setVida(enemigo.getVida()-danioEnemigo);
                        System.out.println(ANSI_WHITE+"Recibes: "+ANSI_RESET+ANSI_RED+ ((ClaseMinotauro) enemigo).getFuria()+ANSI_RESET+ANSI_WHITE + " Puntos de danio" + ANSI_RESET);
                    }
                    else if(enemigo instanceof ClaseQuimera){
                        ((ClaseQuimera) enemigo).setMorder(enemigo.atacar()*jugador.getNivel());
                        danioEnemigo=((ClaseQuimera) enemigo).getMorder();
                        System.out.println(ANSI_WHITE+"Tu enemigo te muerde realizandote : "+ANSI_RESET+ANSI_RED+ danioEnemigo+ANSI_RESET+ANSI_WHITE+" Puntos de danio, curandose la misma cantidad"+ANSI_RESET);
                        enemigo.setVida(enemigo.getVida()+danioEnemigo);
                        jugador.setVida(jugador.getVida()-danioEnemigo);

                    }
            break;
            }
        }
        else if(enemigo.getClase()=="racional"){
                //ve que tu vida es baja 
                if (jugador.getVida()<enemigo.atacar()){
                    danioEnemigo=jugador.defender()-enemigo.atacar();
                    if(danioEnemigo<0){
                    danioEnemigo=danioEnemigo*-1;
                    System.out.println(ANSI_PURPLE+enemigo.getNombre()+" "+ANSI_RESET+ANSI_YELLOW+"Ve que puede matarte rapido"+ANSI_RESET);
                    System.out.println(ANSI_YELLOW+"Te ataca"+ANSI_RESET);
                    System.out.println(ANSI_WHITE+"Recibis: "+ANSI_RESET+ANSI_RED + danioEnemigo +ANSI_RESET+ANSI_WHITE+ " Puntos de danio"+ANSI_RESET);
                    jugador.setVida(jugador.getVida()-danioEnemigo);}
                else{ System.out.println(ANSI_GREEN+"¡Tu enemigo fallo su ataque!");}
                    
                }
                //en este caso el enemigo ve que puede hacerte mas danio
                else if(jugador.getDefensa()<enemigo.atacar()){
                    danioEnemigo=enemigo.atacar();
                    System.out.println(ANSI_PURPLE+enemigo.getNombre()+" "+ANSI_RESET+ANSI_YELLOW+"Ve que descuidaste tu defensa"+ANSI_RESET);
                    System.out.println(ANSI_YELLOW+"Te ataca"+ANSI_RESET);
                    System.out.println(ANSI_WHITE+"Recibis: "+ANSI_RESET+ANSI_RED + danioEnemigo +ANSI_RESET+ANSI_WHITE+ " Puntos de danio"+ANSI_RESET);
                    jugador.setVida(jugador.getVida()-danioEnemigo);
                    
                }
                //ve que su vida es baja y el danio enemigo es mortal 
                else if(danio>enemigo.getVida()*2){
                    System.out.println(ANSI_PURPLE+enemigo.getNombre()+" "+ANSI_RESET+ANSI_YELLOW+"Ve que su vida esta en peligro"+ANSI_RESET);
                    System.out.println(ANSI_YELLOW+"Intenta defenderse, bloqueando parte del danio recibido"+ANSI_RESET);
                    danio=enemigo.getDefensa()-((int)(danio/2));
                    if(danio>0){
                        System.out.println(ANSI_PURPLE+"Tu enemigo bloqueo tu ataque" +ANSI_RESET);
                        danio=0;
                        enemigo.setVida(enemigo.getVida()-danio);
                    }
                    else{System.out.println(ANSI_GREEN+"tu enemigo no pudo bloquear todo el ataque, recibio: "+ANSI_RESET+ANSI_RED+ danio*-1 +ANSI_RESET+ANSI_GREEN+ " puntos de danio" +ANSI_RESET);
                    enemigo.setVida(enemigo.getVida()-danio);
                    }
                    
                }
                //si su mana es mayor a 10 y la vida del enemigo es menor a 20, utiliza su propia habilidad.
                else if(enemigo.getMana()>10 && jugador.getVida()>20){
                    System.out.println(ANSI_PURPLE+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" utiliza una habilidad"+ANSI_RESET);
                    if(enemigo instanceof ClaseSirena){
                        ((ClaseSirena) enemigo).setCantoDeSirena(enemigo.getInteligencia()*2);
                        danioEnemigo=((ClaseSirena) enemigo).getCantoDeSirena();
                        System.out.println(ANSI_YELLOW+"Estas cautivado por el canto de "+ANSI_RESET+ANSI_PURPLE+enemigo.getNombre()+ ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Recibes: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+"Puntos de Danio"+ANSI_RESET);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                    }
                    if(enemigo instanceof ClaseArgo){
                        ((ClaseArgo) enemigo).setVerTodo(enemigo.getAtaque());
                        danioEnemigo=((ClaseArgo) enemigo).getVerTodo();
                        System.out.println(ANSI_YELLOW+"Argo ve tus intenciones y regenera la misma cantidad de vida que el danio que le realizaste.");
                        System.out.println(ANSI_YELLOW+"Ademas recibes: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+"Puntos de Danio"+" de " +ANSI_RESET+ANSI_CYAN+ enemigo.getNombre()+ANSI_RESET);
                        enemigo.setVida(enemigo.getVida()+danio);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);

                    }
                    if (enemigo instanceof ClaseArpia){
                        ((ClaseArpia) enemigo).setRobarVida(jugador.getVida()/4);
                        danioEnemigo=((ClaseArpia) enemigo).getRobarVida();
                        System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" te roba un 25% de tu vida para ella misma.");
                         System.out.println(ANSI_YELLOW+"Te roba: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+"Puntos de vida y se cura la misma cantidad"+ANSI_RESET);
                         enemigo.setVida(enemigo.getVida()+danioEnemigo);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                    }
                    if (enemigo instanceof ClaseDriados){
                        ((ClaseDriados) enemigo).setAtaqueConRaices(enemigo.getAtaqueMagico()*2);
                        danioEnemigo=((ClaseDriados) enemigo).getAtaqueConRaices();
                        System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" Convoca unas enredaderas"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Quedas atrapado entre las espinas");
                        System.out.println(ANSI_YELLOW+"Recibis: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);

                    }
                    if (enemigo instanceof ClaseLamia){
                        ((ClaseLamia) enemigo).setAtraparYMorder(enemigo.atacar()
                        +enemigo.getAtaqueMagico());
                        danioEnemigo=((ClaseLamia) enemigo).getAtraparYMorder();
                        System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" Te atrapa con su cola"+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"No puedes moverte y te muerde");
                        System.out.println(ANSI_YELLOW+"Recibis: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);

                    }
                    if (enemigo instanceof ClaseMedusa){
                        ((ClaseMedusa) enemigo).setParalizar(enemigo.getAtaqueMagico());
                        danioEnemigo=((ClaseMedusa) enemigo).getParalizar();
                        System.out.println(ANSI_YELLOW+"Miras a los ojos a "+ANSI_CYAN+enemigo.getNombre()+ANSI_RESET);
                         System.out.println(ANSI_YELLOW+"Quedas paralizado por la y recibes danio magico");
                         System.out.println(ANSI_YELLOW+"Recibis: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                         enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                    }
                    if (enemigo instanceof ClaseNinfa){
                        ((ClaseNinfa) enemigo).setEncantar(jugador.atacar());
                        danioEnemigo=((ClaseNinfa) enemigo).getEncantar();
                        System.out.println(ANSI_YELLOW+"Quedas encantado por la belleza de "+ANSI_RESET+ANSI_CYAN+enemigo.getNombre()+ANSI_RESET);
                        System.out.println(ANSI_YELLOW+"Te autoinflijes: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                        enemigo.setMana(enemigo.getMana()-10);
                        jugador.setVida(jugador.getVida()-danioEnemigo);
                    }
                    if (enemigo instanceof ClaseTalos){
                        ((ClaseTalos) enemigo).setAsesinar(jugador.getVida());
                        danioEnemigo=0;
                        System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" intenta asesinarte");
                        Random chance = new Random();
                        int chanceDeMatar=(int)(chance.nextInt(2)+1);
                            switch(chanceDeMatar){
                                case 1: System.out.println(ANSI_RED_BACKGROUND+"Talos te asesina"+ANSI_RESET);
                                jugador.setVida(jugador.getVida()-((ClaseTalos) enemigo).getAsesinar());
                                case 2:
                                System.out.println(ANSI_GREEN+"Evadiste el intento de asesinato"+ANSI_RESET);
                            }

                    }
                    if (enemigo instanceof ClasePegaso){
                        ((ClasePegaso) enemigo).setAtaqueDeViento(jugador.getAtaqueMagico()*2);
                        danioEnemigo=((ClasePegaso) enemigo).getAtaqueDeViento();
                         System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+"Utiliza un torbellino de viento");
                         System.out.println(ANSI_YELLOW+"Recibis: "+ANSI_RED+danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                         enemigo.setMana(enemigo.getMana()-10);
                         jugador.setVida(jugador.getVida()-danioEnemigo);

                    }
                    if (enemigo instanceof ClaseSatiro){
                        ((ClaseSatiro) enemigo).setAtaqueDeCuernos(enemigo.getAgilidad()+enemigo.getAtaque());
                        danioEnemigo=((ClaseSatiro) enemigo).getAtaqueDeCuernos();
                        System.out.println(ANSI_CYAN+enemigo.getNombre()+ANSI_RESET+ANSI_YELLOW+" Utiliza ataque con cuernos");
                        System.out.println(ANSI_YELLOW+"Recibis: "+ANSI_RED+ danioEnemigo+ANSI_RESET+ANSI_YELLOW+" Puntos de danio"+ANSI_RESET);
                        enemigo.setMana(enemigo.getMana()-10);
                         jugador.setVida(jugador.getVida()-danioEnemigo);
                    }
                
                }
                else if(enemigo.getVida()<20){System.out.println(ANSI_YELLOW+"Tu enemigo toma una pocion que incrementa su vida en "+ANSI_RESET+ANSI_RED+"25"+ANSI_RESET+ANSI_YELLOW+ " puntos"+ANSI_RESET);
                enemigo.setVida(enemigo.getVida()+25);
                System.out.println("Su vida ahora es de: "+enemigo.getVida()+" Puntos");}
                else{
                    System.out.println(ANSI_YELLOW+"Tu enemigo te ataca"+ANSI_RESET);
                    System.out.println(ANSI_WHITE+"Tu enemigo te hizo: "+ANSI_RESET+ANSI_RED + danioEnemigo +ANSI_RESET+ANSI_WHITE+ " Puntos de danio"+ANSI_RESET);
                    jugador.setVida(jugador.getVida()-danioEnemigo);
                }
                
                


        }
        


    }

    //descripcion de las clases
    static void descripcionDeClases(){
    System.out.println(ANSI_BLUE+"Guerrero" +ANSI_RESET);
    System.out.println("Esta clase se caracteriza por tener mucha defensa y vida.");
    System.out.println("Sus puntos fuertes son: su "+ANSI_YELLOW+"fuerza"+ANSI_RESET+ANSI_WHITE+" y "+ANSI_RESET+ANSI_YELLOW+"constitucion"+ANSI_RESET);
    System.out.println(ANSI_BLUE+"Mago" +ANSI_RESET);
    System.out.println("Esta clase se caracteriza por tener mucho daño, pero es muy dependiente de su maná.  Tiene muy poca vida y defensa");
    System.out.println("Sus puntos fuertes son: su "+ANSI_YELLOW+"inteligencia"+ANSI_RESET);
    System.out.println(ANSI_BLUE+"Asesino" +ANSI_RESET);
    System.out.println("Esta clase se vale de su agilidad para hacer mucho daño, tambien puede evadir ataques. Tiene muy poca defensa y vida.");
    System.out.println("Sus puntos fuertes son: su "+ANSI_YELLOW+"agilidad"+ANSI_RESET);


    }

    //informacion sobre que aumenta con cada punto.
    static void informacionDeStats(){
        System.out.println("Fuerza: Aumenta el ataque.");
        System.out.println("inteligencia: Aumenta el ataque magico, el mana y la defensa magica");
        System.out.println("agilidad: Aumenta la defensa fisica");
        System.out.println("Constitucion: Aumenta la vida");}

    //Funcion: crear personaje:
    static void crearPersonaje(Scanner sc, int puntos){
    int clase=0;
    do{
        try{
            System.out.println(ANSI_BLUE+"Primero... ");
            sc.nextLine();
            System.out.println(ANSI_BLUE+"Vamos a crear tu personaje: ");
            System.out.println("Elegi su clase"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"###############################");
            System.out.println("####"+ANSI_RESET+"[1] - Guerrero"+ANSI_YELLOW+"         ####");
            System.out.println("####"+ANSI_RESET+"[2] - Mago    "+ANSI_YELLOW+"         ####");
            System.out.println("####"+ANSI_RESET+"[3] - Asesino "+ANSI_YELLOW+"         ####");
            System.out.println("###############################"+ANSI_RESET);
            clase=sc.nextInt();
        if(clase==1 || clase==2 || clase==3|| clase==4){
            switch(clase){
                case 1: clase=1;
                        System.out.println(ANSI_YELLOW+"###############################");
                        System.out.println("##"+ANSI_RESET+" Elegis crear un guerrero"+ANSI_YELLOW+"  ##"); 
                        System.out.println("###############################"+ANSI_RESET);
                        setearPersonaje(sc,clase);
                        break;
                case 2: clase=2;
                        System.out.println(ANSI_YELLOW+"###############################");
                        System.out.println("##   "+ANSI_RESET+"Elegis crear un Mago"+ANSI_YELLOW+"    ##"); 
                        System.out.println("###############################"+ANSI_RESET);
                        setearPersonaje(sc,clase);
                        break;
                case 3: clase=3;
                        System.out.println(ANSI_YELLOW+"###############################");
                        System.out.println("##   "+ANSI_RESET+"Elegis crear un Asesino"+ANSI_YELLOW+"    ##"); 
                        System.out.println("###############################"+ANSI_RESET);
                        setearPersonaje(sc,clase);
                        break;
                default: System.out.println("Error, elegi otra opcion");
                        break;
            }
            System.out.println(ANSI_BLUE_BACKGROUND+"Todos los personajes comienzan con"+ANSI_RESET+ANSI_YELLOW+" 50 "+ANSI_YELLOW+ANSI_BLUE_BACKGROUND+"puntos para distribuir en sus estadisticas."+ANSI_RESET);
            sc.nextLine();
            agregarPuntos(sc, puntos);
            }
            else{System.out.println("Elegiste una opcion incorrecta, volve a intentarlo"); clase=0;}
        
        

        }catch(Exception e){System.out.println("Ingresaste un caracter incorrecto, volve a intentarlo"); sc.nextLine();}
        }while(clase==0);
        
    }

    //dar nombre a personaje(va incluido dentro de la funcion de crear personaje)
    static void setearPersonaje(Scanner sc, int clase){
        System.out.println(ANSI_BLUE+"ingresa su nombre"+ANSI_RESET);
        sc.nextLine();
        String nombre=sc.nextLine();
        System.out.println(ANSI_BLUE+"El nombre elegido es: "+ANSI_RESET+ANSI_YELLOW+nombre+ANSI_RESET);
        if(clase==1){
        String raza="Guerrero";
        int fuerza=5;
        int agilidad=5;
        int inteligencia=3;
        jugador = new ClaseGuerrero(nombre, fuerza, agilidad, inteligencia, raza);}
        else if(clase==2){ String raza="Mago";
        int fuerza=1;
        int agilidad=2;
        int inteligencia=5;
        jugador = new ClaseMago(nombre, fuerza, agilidad, inteligencia, raza);}
        else if(clase==3){
        int fuerza=1;
        int agilidad=5;
        int inteligencia=3;
        String raza="Asesino";
        jugador = new ClaseAsesino(nombre, fuerza, agilidad, inteligencia, inteligencia, raza);
        }
    }


    //regeneracion de vida, segun cada clase.
    static void regeneracionDeVida(double porcentaje){
    if(jugador instanceof ClaseGuerrero){
    int manaMaximo=((jugador.getInteligencia())+10);
    int vidaMaxima=((int)(jugador.getConstitucion()*4)+40);

    //int porcentajeVida=(100*jugador.getVida())/vidaMaxima;
    int porcentajeMana=(100*jugador.getMana())/manaMaximo;
    int regeneracionVida=((int)(porcentaje*vidaMaxima+(jugador.getConstitucion()*0.1)));
    int regeneracionMana=((int)(porcentaje*manaMaximo+(jugador.getInteligencia()*0.05)));
    if((jugador.getVida()+regeneracionVida)>vidaMaxima){jugador.setVida(vidaMaxima); }
    else {jugador.setVida(jugador.getVida()+regeneracionVida);}
    if((jugador.getMana()+regeneracionMana)>manaMaximo){jugador.setMana(manaMaximo);}
    else {jugador.setMana(jugador.getMana()+regeneracionMana);}
    if(porcentajeMana<10){System.out.println(ANSI_PURPLE+"Tu Mana es muy bajo"+ANSI_RESET);}
    
    }

    else if(jugador instanceof ClaseMago){
    int manaMaximo=((jugador.getInteligencia()*5)+20);
    int vidaMaxima=((int)(jugador.getConstitucion()*2)+30);
    //int porcentajeVida=(100*jugador.getVida())/vidaMaxima;
    int porcentajeMana=(100*jugador.getMana())/manaMaximo;
    int regeneracionVida=((int)(porcentaje*vidaMaxima+(jugador.getConstitucion()*0.05)));
    int regeneracionMana=((int)(porcentaje*manaMaximo+(jugador.getInteligencia()*0.1)));
    if((jugador.getVida()+regeneracionVida)>vidaMaxima){jugador.setVida(vidaMaxima); }
    else {jugador.setVida(jugador.getVida()+regeneracionVida);}
    if((jugador.getMana()+regeneracionMana)>manaMaximo){jugador.setMana(manaMaximo);}
    else {jugador.setMana(jugador.getMana()+regeneracionMana);}
    if(porcentajeMana<10){System.out.println(ANSI_PURPLE+"Tu Mana es muy bajo"+ANSI_RESET);}  
    }
    else if(jugador instanceof ClaseAsesino){
    int manaMaximo=((jugador.getInteligencia())+10);
    int vidaMaxima=((int)(jugador.getConstitucion()*2)+20);
    int porcentajeVida=(100*jugador.getVida())/vidaMaxima;
    int porcentajeMana=(100*jugador.getMana())/manaMaximo;
    int regeneracionVida=((int)(porcentaje*vidaMaxima+(jugador.getConstitucion()*0.1)));
    int regeneracionMana=((int)(porcentaje*manaMaximo+(jugador.getInteligencia()*0.1)));
    if((jugador.getVida()+regeneracionVida)>vidaMaxima){jugador.setVida(vidaMaxima); }
    else {jugador.setVida(jugador.getVida()+regeneracionVida);}
    if((jugador.getMana()+regeneracionMana)>manaMaximo){jugador.setMana(manaMaximo);}
    else {jugador.setMana(jugador.getMana()+regeneracionMana);}
    if(porcentajeVida<10){System.out.println(ANSI_PURPLE+"Tu vida está en estado critico"+ANSI_RESET);}
    if(porcentajeMana<10){System.out.println(ANSI_PURPLE+"Tu Mana es muy bajo"+ANSI_RESET);}
    
    }

    }
    
    
    
    //chance de que un personaje esquive un ataque
    static void chanceDeEvasion(int danio){
if(jugador instanceof ClaseAsesino){   
    Random azar= new Random();
    int valor=azar.nextInt(100);
    if(valor%(10)==0){
        System.out.println(ANSI_GREEN+"Evadiste el ataque"+ANSI_RESET);
    danio=0;
    jugador.setVida(jugador.getVida()-danio);}
    }
}

    ///establecen como aumenta cada estadistica segun los puntos distribuidos
    static void estadisticasDeStats(){
    if(jugador instanceof ClaseGuerrero){
    jugador.setAtaque((int)(jugador.getFuerza()*2)+10);
    jugador.setDefensa((int)(jugador.getAgilidad()*3)+20);
    jugador.setMana((jugador.getInteligencia())+10);
    jugador.setVida((int)(jugador.getConstitucion()*3)+60); //borrar en error
    jugador.setAtaqueMagico((int)(jugador.getInteligencia())); 
    int danioEnemigo=0;
    danioEnemigo=(int)(danioEnemigo/2);
    }
    else if (jugador instanceof ClaseMago){
    jugador.setAtaque((int)(jugador.getInteligencia()+jugador.getFuerza())+5);
    jugador.setDefensa((int)(jugador.getAgilidad()*2)+15);
    jugador.setMana((jugador.getInteligencia()*5)+50);
    jugador.setVida((int)(jugador.getConstitucion()*2)+40); //borrar en error
    jugador.setAtaqueMagico((int)(jugador.getInteligencia()*2)+10);
    }
    else if (jugador instanceof ClaseAsesino){
    jugador.setAtaque((int)(jugador.getAgilidad()*3)+20);
    jugador.setDefensa((int)(jugador.getAgilidad()/2)+10);
    jugador.setMana((jugador.getInteligencia())+10);
    jugador.setVida((int)(jugador.getConstitucion())+50); //borrar en error
    jugador.setAtaqueMagico((int)(0));
    }
    }

//Establece las estadisticas que tendrá el enemigo en base a los puntos base, igual que en los personajes.
    static void estadisticasEnemigas(){
    if(enemigo instanceof ClaseArgo){
    enemigo.setAtaque((int)(enemigo.getAgilidad())*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((enemigo.getInteligencia()*3)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()+50); //borrar en error
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*2)*(int)(jugador.getNivel())/2);
    }
    else if(enemigo instanceof ClaseArpia){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*3+enemigo.getInteligencia())*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()/2)*jugador.getNivel());
    enemigo.setMana((enemigo.getInteligencia()*3)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion())*jugador.getNivel()+50); //borrar en error
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    }
      else if(enemigo instanceof ClaseCentauro){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*2+enemigo.getFuerza()*2)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()+enemigo.getFuerza())*jugador.getNivel());
    enemigo.setMana((enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()+50); //borrar en error
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    }
         else if(enemigo instanceof ClaseCerbero){
    enemigo.setAtaque((int)(enemigo.getFuerza()*3)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()+enemigo.getFuerza()*2)*jugador.getNivel());
    enemigo.setMana((enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*3)*jugador.getNivel()+50); //borrar en error
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    }
             else if(enemigo instanceof ClaseCiclope){
    enemigo.setAtaque((int)(enemigo.getFuerza()*4)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad())*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()/2)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*4)*jugador.getNivel()+50); //borrar en error
    enemigo.setAtaqueMagico(0);  
    }
                else if(enemigo instanceof ClaseDriados){
    enemigo.setInteligencia(enemigo.getInteligencia()*2*(int)(jugador.getNivel())/2); //son muy inteligentes
    enemigo.setAtaque((int)(enemigo.getFuerza()+enemigo.getInteligencia()*2)*jugador.getNivel());
    enemigo.setDefensa((int)(enemigo.getAgilidad())*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*2)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*6)*jugador.getNivel()+50); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*2)*(int)(jugador.getNivel())/2);  
    }
                  else if(enemigo instanceof ClaseHidra){ 
    enemigo.setAtaque((int)(enemigo.getFuerza()*2)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()+50); //mucha vida
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    regeneracionDeVida(15); //regeneran vida muy rapido
    }
                  else if(enemigo instanceof ClaseLamia){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*3)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()+20); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    regeneracionDeVida(10); //regeneran vida muy rapido
    }

                      else if(enemigo instanceof ClaseMedusa){
    enemigo.setAtaque((int)(enemigo.getFuerza()*4)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()+20); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    }
                        else if(enemigo instanceof ClaseMinotauro){
    enemigo.setAtaque((int)(enemigo.getFuerza()*5)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*4)*jugador.getNivel()+20); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }

                          else if(enemigo instanceof ClaseNinfa){
    enemigo.setAtaque((int)(enemigo.getInteligencia()*4)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad())*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*4)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion())*jugador.getNivel()+50); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*4)*(int)(jugador.getNivel())/2);  
    }

                             else if(enemigo instanceof ClasePegaso){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*2)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*5)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*2)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*2)*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }
                               else if(enemigo instanceof ClaseQuimera){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*3)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*3)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*3)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*3+10)*jugador.getNivel()); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*2)*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }

                                 else if(enemigo instanceof ClaseSatiro){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*2+enemigo.getFuerza()*2)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*4)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia())*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*3+15)*jugador.getNivel()); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia())*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }
                                 else if(enemigo instanceof ClaseSirena){
    enemigo.setAtaque((int)(enemigo.getAgilidad()+enemigo.getFuerza()+enemigo.getInteligencia()*4)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*4)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*3+10)*jugador.getNivel()); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*4)*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }

                              else if(enemigo instanceof ClaseTalos){
    enemigo.setAtaque((int)(enemigo.getAgilidad()*4)*(int)(jugador.getNivel())/2);
    enemigo.setDefensa((int)(enemigo.getAgilidad()*2)*jugador.getNivel());
    enemigo.setMana((int)(enemigo.getInteligencia()*4)*jugador.getNivel());
    enemigo.setVida((int)(enemigo.getConstitucion()*2)*jugador.getNivel()); 
    enemigo.setAtaqueMagico((int)(enemigo.getInteligencia()*4)*(int)(jugador.getNivel())/2);  
    enemigo.setMobexperiancia(enemigo.getMobexperiancia()*2); //da el doble de experiencia
    }


    else{
    //es un esbirro
    enemigo.setAtaque(enemigo.getAtaque()+(enemigo.getFuerza()+enemigo.getInteligencia()*jugador.getNivel()));
    enemigo.setDefensa(enemigo.getDefensa()+(enemigo.getAgilidad())*jugador.getNivel());
    enemigo.setVida((enemigo.getFuerza()*3)*jugador.getNivel()+enemigo.getConstitucion());
    enemigo.setMana((enemigo.getInteligencia()*2)*enemigo.getNivel());
    }
    }



    ///funcion para distribuir puntos en los personajes.
    static void agregarPuntos(Scanner sc, int puntos){
    int asignados=0;
    do{
        try{
            System.out.println(ANSI_BLUE+"tenes "+ANSI_RESET+ANSI_YELLOW+puntos+ANSI_RESET+ANSI_BLUE+" puntos para distribuir"+ANSI_BLUE);
            System.out.println(ANSI_BLUE+"elegi donde los queres colocar"+ANSI_RESET);
            System.out.println(ANSI_RED+"[1]"+ANSI_RESET+ANSI_BLUE+ "fuerza"+ANSI_RESET);
            System.out.println(ANSI_RED+"[2]"+ANSI_RESET+ANSI_BLUE+ "agilidad");
            System.out.println(ANSI_RED+"[3]"+ANSI_RESET+ANSI_BLUE+ "inteligencia"+ANSI_RESET);
            System.out.println(ANSI_RED+"[4]"+ANSI_RESET+ANSI_BLUE+ "constitucion"+ANSI_RESET);
            System.out.println(ANSI_RED+"[5]"+ANSI_RESET+ANSI_BLUE+ "informacion de stats"+ANSI_RESET);
            int respuesta = sc.nextInt();
            switch(respuesta){
                    case 1: System.out.println(ANSI_BLUE+"¿Cuantos puntos queres añadir en"+ANSI_RESET+ANSI_RED+" fuerza?"+ANSI_RESET);
                    asignados=sc.nextInt();
                    if(puntos<asignados || asignados<0){
                        System.out.println("NO TE ALCANZA");
                        asignados=0;
                    }else{jugador.setFuerza(jugador.getFuerza()+asignados); 
                    puntos-=asignados;
                    estadisticasDeStats();
                    }

                    break;
                    case 2: System.out.println(ANSI_BLUE+"¿Cuantos puntos queres añadir en"+ANSI_RESET+ANSI_RED+" agilidad?"+ANSI_RESET);
                    asignados=sc.nextInt();
                    if(puntos<asignados || asignados<0){
                        System.out.println("NO TE ALCANZA");
                        asignados=0;
                    }else{jugador.setAgilidad(jugador.getAgilidad()+asignados);
                    puntos-=asignados;
                    estadisticasDeStats();
                    }
                    break;
                    case 3: System.out.println(ANSI_BLUE+"¿Cuantos puntos queres añadir en"+ANSI_RESET+ANSI_RED+" inteligencia?"+ANSI_RESET);
                    asignados=sc.nextInt();
                        //condiciones para no pasar el limite de puntos
                        if(puntos<asignados || asignados<0){
                            System.out.println("NO TE ALCANZA");
                            asignados=0;
                        }else{jugador.setInteligencia(jugador.getInteligencia()+asignados);
                        puntos-=asignados;
                        estadisticasDeStats();
                        }
                     break;
                    case 4: System.out.println(ANSI_BLUE+"¿Cuantos puntos queres añadir en"+ANSI_RESET+ANSI_RED+" constitucion?"+ANSI_RESET);
                    asignados=sc.nextInt();
                        //condiciones para no pasar el limite de puntos
                        if(puntos<asignados || asignados<0){
                            System.out.println("NO TE ALCANZA");
                            asignados=0;
                        }else{jugador.setConstitucion(jugador.getConstitucion()+asignados);
                        puntos-=asignados;
                        estadisticasDeStats();
                        }
                     break;
                     case 5: informacionDeStats();
                     break;
                     default: System.out.println("Eleccion incorrecta");
                    }
                    }catch(Exception e){System.out.println("eleccion incorrecta");
                    sc.nextLine();
                    }
    }while(puntos>0); 
    }


    /////////funcion CrearEnemigo: genera un enemigo con nombre perteneciente a la lista, y estadisticas aleatorias.
    static void crearEnemigo(){
    String[] enemigos_nombres={"Argo","Arpia","Centauro","Cerbero","Ciclope","Driados","Hidra","Lamia","Medusa","Minotauro","Ninfa","Pegaso","Quimera","Satiro","Sirena","Talos"};
    Random enemigox = new Random();
    int nombreEnemigo =enemigox.nextInt(16);
    if (enemigos_nombres[nombreEnemigo]=="Argo"){
        enemigo = new ClaseArgo("Argo",(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
    else if (enemigos_nombres[nombreEnemigo]=="Arpia"){
            enemigo = new ClaseArpia("Arpia",(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
    else if (enemigos_nombres[nombreEnemigo]=="Centauro"){
            enemigo = new ClaseCentauro("Centauro",(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
        else if (enemigos_nombres[nombreEnemigo]=="Cerbero"){
            enemigo = new ClaseCerbero(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
           else if (enemigos_nombres[nombreEnemigo]=="Ciclope"){
            enemigo = new ClaseCiclope(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
               else if (enemigos_nombres[nombreEnemigo]=="Driados"){
            enemigo = new ClaseDriados(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
                   else if (enemigos_nombres[nombreEnemigo]=="Hidra"){
            enemigo = new ClaseHidra(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
                  else if (enemigos_nombres[nombreEnemigo]=="Lamia"){
            enemigo = new ClaseLamia(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
      else if (enemigos_nombres[nombreEnemigo]=="Medusa"){
            enemigo = new ClaseMedusa(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }

        else if (enemigos_nombres[nombreEnemigo]=="Minotauro"){
            enemigo = new ClaseMinotauro(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }

          else if (enemigos_nombres[nombreEnemigo]=="Ninfa"){
            enemigo = new ClaseNinfa(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
            else if (enemigos_nombres[nombreEnemigo]=="Pegaso"){
            enemigo = new ClasePegaso(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
               else if (enemigos_nombres[nombreEnemigo]=="Quimera"){
            enemigo = new ClaseQuimera(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"irracional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
                else if (enemigos_nombres[nombreEnemigo]=="Satiro"){
            enemigo = new ClaseSatiro(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }
                 else if (enemigos_nombres[nombreEnemigo]=="Sirena"){
            enemigo = new ClaseSirena(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }

                  else if (enemigos_nombres[nombreEnemigo]=="Talos"){
            enemigo = new ClaseTalos(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),"racional",(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();
    }

        else{  
    enemigo = new Enemigo(enemigos_nombres[nombreEnemigo],(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1),enemigos_nombres[nombreEnemigo],(int)(Math.random()*500+1));
    seteoDeEstadisticasEnemigas();

        }
        

    
    }
    static void seteoDeEstadisticasEnemigas(){
    estadisticasEnemigas();
    System.out.println(ANSI_GREEN+"Tu enemigo te esta esperando para pelear"+ANSI_RESET);
    System.out.println(ANSI_RED+"Te enfrentarás a: "+ANSI_RESET +ANSI_YELLOW+ enemigo.getNombre() +ANSI_BLUE+ " Nivel" +  "[" + enemigo.getMobnivel()  + "]"+ANSI_RESET);
    System.out.println("  ");
    }


    //Permite ver las estadisticas del enemigo.
    static void estadisticasEnemigasActuales(){
    System.out.println(ANSI_GREEN+"--------    Estas son las estadisticas de tu enemigo    ------"+ANSI_RESET);
        System.out.println("Nombre: " + enemigo.getNombre());
        System.out.println("nivel: " + enemigo.getMobnivel());
        System.out.println("ataque: " + enemigo.getAtaque());
        System.out.println("defensa: " + enemigo.getDefensa());
        System.out.println("vida: " + enemigo.getVida());
        System.out.println("Mana: "+ enemigo.getMana());
        System.out.println("Clase: " + enemigo.getClase());
    System.out.println("-------------------------------------------------------");
    System.out.println("");}
 
    ////////funcion atacar: infliges daño a tu enemigo, pero descuidas la defensa, tu enemigo te puede hacer el total del daño que realiza.
    static void atacar(){
    int danio = jugador.atacar();
    int danioEnemigo= enemigo.atacar();
    iaEnemiga(danioEnemigo, danio);
    chanceDeEvasion(danio);
    System.out.println(ANSI_GREEN+"Decidis atacar"+ANSI_RESET);
    if (danio>0) {
    System.out.println( "Hiciste "+ANSI_RED+ danio +ANSI_RESET+ " Puntos de daño" );
    } else{System.out.println(ANSI_RED+"Bloquearon tu ataque"+ANSI_RESET);
        danio=0;} 
    enemigo.setVida(enemigo.getVida()-danio);
    vidaRestante();
    regeneracionDeVida(0.05);
    
    }

    ////////funcion defender: te permite reducir el daño, pero no podes atacar.
    static void defender(){
        System.out.println(ANSI_GREEN+"Te cubris con tus manos"+ANSI_RESET);
        int danioRecibido=jugador.defender()-enemigo.atacar();
        if(danioRecibido>0){ //si el daño de defensa > ataque, entonces bloqueamos todo, entonces daño bloqueado es 0 (recibido)
        System.out.println(ANSI_GREEN+"¡Bloqueaste con exito el ataque de "+ANSI_RESET +ANSI_YELLOW+ enemigo.getNombre() +ANSI_RESET+ANSI_GREEN+"!"+ANSI_RESET);
        danioRecibido=0;
        } else {System.out.println(ANSI_YELLOW+enemigo.getNombre() +ANSI_RESET+ANSI_BLUE+ " te hizo "+ANSI_RESET +ANSI_RED+(danioRecibido*-1) +ANSI_RESET+ANSI_BLUE+ " Puntos de daño"+ANSI_RESET ); }
        jugador.setVida(jugador.getVida()-(danioRecibido*-1)); //aca si la defensa<ataque, nos dara un numero negativo correspondiente al daño recibido, entonces lo hacemos positivo y se resta en la ecuacion final en la vida del personaje.
        regeneracionDeVida(0.05);
    }
   

    ///////funcion correr: Alejarte te permite regenerar el doble de vida y mana(poniendo como tope de regeneracion el maximo de la vida disponible), pero recibis daño a distancia,
    static void correr(){
        System.out.println(ANSI_GREEN+"Decidis correr para intentar recuperarte"+ANSI_RESET);
        //REVISAR ESTE METODO, STATIS FALSOS
        regeneracionDeVida(0.10);
        System.out.println(ANSI_RED+"Tu enemigo "+ANSI_RESET+ANSI_YELLOW +enemigo.getNombre()+ANSI_RESET+ANSI_RED +  " te lanza con objetos"+ANSI_RESET);
        int danioDistancia=(int)(enemigo.atacar()*0.5); //el daño a distancia es el daño del enemigo reducido en un 50%
        System.out.println(ANSI_YELLOW+enemigo.getNombre()+ANSI_RESET +ANSI_RED+ " te hizo "+ANSI_RESET+ANSI_YELLOW+  danioDistancia +ANSI_RESET+ANSI_RED + " Puntos de daño"+ANSI_RESET);
        jugador.setVida(jugador.getVida()-danioDistancia); //aca se calcula la vida total (es la regenerada) - el daño a distancia 
        //regeneracionDeVida(0.05);
        }


    /////otra funcion--estadisticas: Muestra los puntos actuales del personaje
    static void estadisticas(){
    System.out.println(ANSI_GREEN+"----------Estas son tus estadisticas actuales----------"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Nombre: "+ANSI_RESET +ANSI_YELLOW+ jugador.getNombre()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"nivel: " +ANSI_RESET+ANSI_YELLOW+ jugador.getNivel()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"ataque: " +ANSI_RESET+ANSI_YELLOW+ jugador.getAtaque()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"ataque Magico: " +ANSI_RESET+ANSI_YELLOW+ jugador.getAtaqueMagico()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Experiencia: " +ANSI_RESET+ANSI_YELLOW+ jugador.getExperiencia()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"defensa: " +ANSI_RESET+ANSI_YELLOW+ jugador.getDefensa()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"vida: " +ANSI_RESET+ANSI_YELLOW+ jugador.getVida()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Mana: "+ANSI_RESET+ANSI_YELLOW+ jugador.getMana()+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Clase: " +ANSI_RESET+ANSI_YELLOW+ jugador.getClase()+ANSI_RESET);
    System.out.println(ANSI_GREEN+"-------------------------------------------------------"+ANSI_RESET);
    System.out.println("");}
    
    ////Imprime la vida restante tuya y del enemigo
    static void vidaRestante(){
    if (jugador.getVida()>0){System.out.println(ANSI_CYAN+"Tu vida es de: "+ANSI_RESET+ANSI_GREEN+jugador.getVida()+ANSI_RESET);}
    else if(jugador.getVida()<0){System.out.println(ANSI_RED+"¡Estas Debil!"+ANSI_RESET);}
    if (enemigo.getVida()>0 && jugador.getVida()>0){System.out.println(ANSI_CYAN+"A tu enemigo le quedan: "+ANSI_RESET+ANSI_RED+enemigo.getVida()+ANSI_RESET+ANSI_CYAN+" puntos de vida"+ANSI_RESET);}
    else if (enemigo.getVida()<=0 && jugador.getVida()>0){System.out.println(ANSI_GREEN+"Derrotaste a tu enemigo"+ANSI_RESET);}
    }

    ///////////////////////////////////////////////////////HABILIDADES///////////////////////////////////////////////////////

    ////habilidades de guerrero (Escudo)
    static void defensaDeEscudo(){
            int costo=10;
            int danioEnemigo=enemigo.atacar();
            int danio=jugador.atacar();
            if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA"+ANSI_RESET);}
            else{
            System.out.println(ANSI_GREEN+"---Te equipas con tu escudo reduciendo a la mitad el danio enemigo----"+ANSI_RESET);
            jugador.setMana(jugador.getMana()-costo);
            System.out.println("enemigo:"+enemigo.atacar());//
            System.out.println("jugador def"+jugador.defender());//
            iaEnemiga(danioEnemigo, danio);
            danioEnemigo=jugador.defender()-danioEnemigo/2;
            if(danio>0){
            System.out.println( "Hiciste "+ANSI_RED+ danio +ANSI_RESET+ " Puntos de daño" );
            enemigo.setVida(enemigo.getVida()-danio);}
            danioEnemigo=danioEnemigo-jugador.defender();
            if(danioEnemigo>0){
            jugador.setVida(jugador.getVida()-danioEnemigo);
            vidaRestante();
            regeneracionDeVida(0.05);   
            }
            else{
            System.out.println(ANSI_GREEN+"Bloqueaste parte del danio"+ANSI_RESET); 
            danioEnemigo=0;
            jugador.setVida(jugador.getVida()-danioEnemigo);
            vidaRestante();
            regeneracionDeVida(0.05);            
            }
            }

            }
    ////habilidad DE guerrero(ataque potenciado)
    static void ataquePotenciado(){
        int danio=jugador.atacar()*4;
        int danioEnemigo=enemigo.atacar();
    System.out.println(ANSI_GREEN+"Potencias tu siguiente ataque"+ANSI_RESET);
            int costo=5;
            if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA SUFICIENTE"+ANSI_RESET);}
            else{
            iaEnemiga(danioEnemigo, danio);
            jugador.setMana(jugador.getMana()-costo);
            danio=jugador.atacar()*4-enemigo.defender();
            if(danio>0){
            System.out.println( "Hiciste "+ANSI_RED+ danio +ANSI_RESET+ " Puntos de daño" );
            enemigo.setVida(enemigo.getVida()-danio);
            } else{
            System.out.println(ANSI_RED+"bloquearon tu ataque"+ANSI_RESET);
        }
            
            vidaRestante();
            regeneracionDeVida(0.05);
            }
;   
    }
    //usar pocion de vida
    static void beberPocion(){
    ///
      int costo=10*jugador.getNivel();
    if (jugador instanceof ClaseGuerrero){   if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA SUFICIENTE"+ANSI_RESET);}
     else{  System.out.println(ANSI_GREEN+"Te bebes una pocion"+ANSI_RESET);
            jugador.setMana(jugador.getMana()-costo);
            jugador.setVida((int)(jugador.getVida()+((int)(jugador.getConstitucion()*3)*0.25)));
            System.out.println(ANSI_BLUE + "Se restauró: "+ANSI_RESET+ANSI_GREEN+((int)(jugador.getVida()*0.25))+ANSI_RESET+ANSI_BLUE+"puntos de vida"+ANSI_RESET);}}
    else if (jugador instanceof ClaseAsesino){
        if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA SUFICIENTE"+ANSI_RESET);}
     else{  System.out.println(ANSI_GREEN+"Te bebes una pocion"+ANSI_RESET);
            jugador.setMana(jugador.getMana()-costo);
            jugador.setVida((int)(jugador.getVida()+((int)(int)(jugador.getConstitucion())/4)));
            System.out.println(ANSI_BLUE + "Se restauró: "+ANSI_RESET+ANSI_GREEN+((int)(jugador.getVida()*0.25))+ANSI_RESET+ANSI_BLUE+"puntos de vida"+ANSI_RESET);}}
    }


    ////habilidad de mago (bola de fuego)
    static void usarBolaDeFuego(){
    int costo=(int)((jugador.getInteligencia()*3)/2);
    ((ClaseMago) jugador).setBolaDeFuego(jugador.getAtaqueMagico()*2-enemigo.getDefensa());
    int danio=((ClaseMago) jugador).getBolaDeFuego();
    int danioEnemigo=enemigo.atacar();
    if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA SUFICIENTE"+ANSI_RESET);}
    else{
    System.out.println(ANSI_GREEN+"Utilizas Bola de Fuego"+ANSI_RESET);
    jugador.setMana(jugador.getMana()-costo);       
            if(danio>0){ 
            System.out.println(ANSI_BLUE+"Realizas un daño Magico de: "+ANSI_RESET +ANSI_RED+ danio+ANSI_RESET +ANSI_BLUE+"Puntos a tu enemigo"+ANSI_RESET);
            iaEnemiga(danioEnemigo, danio); 
            enemigo.setVida(enemigo.getVida()-danio);
            } else {;
            System.out.println(ANSI_RED+"Tu enemigo esquivo la Bola de Fuego"+ANSI_RESET); 
            danio=0;}
    vidaRestante();
    regeneracionDeVida(0.05);    
    }
 
    }

    ////habilidad de mago(Rayo)
    static void usarRayo(){
    int costo=(int)((jugador.getInteligencia()*3)/2);
    ((ClaseMago) jugador).setRayo((int)((jugador.getInteligencia()/2)));
    int danio=(((ClaseMago) jugador).getRayo()-enemigo.defender());
    int danioEnemigo=enemigo.atacar();
    if(jugador.getMana()<costo || jugador.getMana()==0 || jugador.getMana()<0){System.out.println(ANSI_RED+"NO TENES MANA SUFICIENTE"+ANSI_RESET);}
    else{
    System.out.println(ANSI_GREEN+"Utilizas Rayo"+ANSI_RESET);
    jugador.setMana(jugador.getMana()-costo);
    if(danio>0){
        System.out.println(ANSI_BLUE+"Realizas un daño Magico de: "+ANSI_RESET +ANSI_RED+ danio+ANSI_RESET +ANSI_BLUE+"Puntos a tu enemigo"+ANSI_RESET);
        iaEnemiga(danioEnemigo, danio);
        //enemigo.setVida(enemigo.getVida()-danio);
    } else {
    System.out.println(ANSI_RED+"Tu enemigo esquivo el rayo"+ANSI_RESET); 
    danio=0;}
    vidaRestante();
    regeneracionDeVida(0.05);    
    }

    }
    //habilidad heal
    static void usarHeal(){
        System.out.println(ANSI_GREEN+"usas Heal"+ANSI_RESET);
        jugador.setMana(jugador.getMana()-15);
        int vidaMaxima=(int)(jugador.getConstitucion()*1.5);
        int vidaRegenerada = (int)(jugador.getVida()+(vidaMaxima*0.5));
            if(vidaRegenerada>vidaMaxima){System.out.println(ANSI_BLUE+"Regeneraste: "+ANSI_RESET+ANSI_GREEN+(vidaRegenerada-vidaMaxima)+ANSI_RESET+ANSI_BLUE+"Puntos de vida"+ANSI_RESET); jugador.setVida((int)(jugador.getConstitucion()*1.5));}
            else{System.out.println(ANSI_BLUE+"Restauras un: "+ANSI_RESET+ANSI_GREEN+ vidaRegenerada+ANSI_RESET+ANSI_BLUE +" Puntos de vida"+ANSI_RESET); jugador.setVida(jugador.getVida()+vidaRegenerada);};
    }
    //habilidad de asesino (golpeMortal)
    static void golpeMortal(){
    System.out.println(ANSI_GREEN+"usas golpe mortal"+ANSI_RESET);
    int danio=((ClaseAsesino) jugador).getGolpeMortal();
    int danioEnemigo=enemigo.atacar();
    ///
    if (jugador.getMana()>0 || jugador.getMana()==0){
    ((ClaseAsesino) jugador).setGolpeMortal(jugador.getAgilidad()*3);
    danio=((ClaseAsesino) jugador).getGolpeMortal();
    System.out.println(ANSI_BLUE+"Realizas un golpe critico de: "+ANSI_RESET +ANSI_RED+ danio+ANSI_RESET +ANSI_BLUE+"Puntos a tu enemigo"+ANSI_RESET);
    iaEnemiga(danioEnemigo, danio);
    jugador.setMana(jugador.getMana()-5);
    enemigo.setVida(enemigo.getVida()-danio);
    vidaRestante();
    regeneracionDeVida(0.05);
    } else{System.out.println(ANSI_RED+"NO TIENES MANA"+ANSI_RESET);}
    
    ///
    }

    //habilidad de asesino (evasion)
    static void evasion(){
    ((ClaseAsesino) jugador).setEvasion(enemigo.atacar());
    int costo=jugador.getMana()-5;
    if (jugador.getMana()>0 || jugador.getMana()==0){
    System.out.println(ANSI_GREEN+"Utilizas evasion"+ANSI_RESET);
    System.out.println(ANSI_GREEN+"Esquivas el ataque de: "+enemigo.getNombre()+ANSI_RESET);
    jugador.setMana(jugador.getMana()-costo*jugador.getNivel());
    enemigo.setVida(enemigo.getVida()-jugador.atacar());
    System.out.println(ANSI_BLUE+"Realizas un golpe de: "+ANSI_RESET +ANSI_RED+ jugador.atacar()+ANSI_RESET +ANSI_BLUE+"Puntos a tu enemigo"+ANSI_RESET);
    vidaRestante();
    regeneracionDeVida(0.05);}
    else{System.out.println(ANSI_RED+"NO TIENES MANA"+ANSI_RESET);}
    
   
    }

    ////menu para usar habilidades

    static void MenuDeUsoDeHabilidades(Scanner sc){
    int respuesta=0;
    do{
        try{
                System.out.println(ANSI_GREEN+"Elegi una de las siguientes habildiades para usar:"+ANSI_RESET);
                System.out.println(ANSI_RED+"Recorda que las habiliades cuestan Mana"+ANSI_RESET);
                System.out.println(ANSI_BLUE+"Tu Mana actual es de: "+ANSI_RESET+ANSI_GREEN + jugador.getMana()+ANSI_RESET);
                sc.nextLine();
                if (jugador instanceof ClaseGuerrero){
                System.out.println(ANSI_RED+"[1]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Utilizar escudo: "+ANSI_RESET+ANSI_BLUE+"Reduce todo tu daño recibido a la mitad, te permite atacar"+ANSI_RESET);
                System.out.println(ANSI_RED+"[2]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Ataque potenciado:"+ANSI_RESET+ANSI_BLUE+" Haces un golpe que inflije al enemigo el doble de danio al enemigo"+ANSI_RESET);
                System.out.println(ANSI_RED+"[3]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Beber una pocion:"+ANSI_RESET+ANSI_BLUE+" regeneras algo de vida"+ANSI_RESET);
                System.out.println(ANSI_RED+"[4]"+ANSI_RESET+ANSI_BLUE+ "-"+ "Volver al menu anterior"+ANSI_RESET);
                respuesta = sc.nextInt();
                switch(respuesta){
                    case 1: defensaDeEscudo();
                    break;
                    case 2: ataquePotenciado();
                    break; 
                    case 3: beberPocion();
                    break;
                    case 4: menuDeCombate(sc, false, respuesta);
                    break;
                    default: System.out.println("Opcion incorrectax");
                    break;
                }

                }
                else if(jugador instanceof ClaseMago) {
                System.out.println(ANSI_RED+"[1]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Bola de Fuego: "+ANSI_RESET+ANSI_BLUE+"Hace danio magico, puede quemar"+ANSI_RESET);
                System.out.println(ANSI_RED+"[2]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Rayo:"+ANSI_RESET+ANSI_BLUE+" Hace danio magico, paraliza a tu enemigo, evitando que te ataque en este turno"+ANSI_RESET);
                System.out.println(ANSI_RED+"[3]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Heal: "+ANSI_RESET+ANSI_BLUE+"curas un 20% de tu vida restante"+ANSI_RESET);
                System.out.println(ANSI_RED+"[4]"+ANSI_RESET+ANSI_BLUE+ "-"+ "volver al menu anterior"+ANSI_RESET);
                respuesta=sc.nextInt();
                switch(respuesta){
                    case 1: usarBolaDeFuego();
                    break;
                    case 2:usarRayo();
                    break;
                    case 3:usarHeal();
                    break;
                    case 4:menuDeCombate(sc, false, respuesta);
                    break;
                    default: System.out.println("Opcion incorrecta");
                    break;
                }
                }
                else if(jugador instanceof ClaseAsesino){
                System.out.println(ANSI_RED+"[1]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Golpe Mortal: "+ANSI_RESET+ANSI_BLUE+"Hace danio critico"+ANSI_RESET);
                System.out.println(ANSI_RED+"[2]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Evasion:"+ANSI_RESET+ANSI_BLUE+" Te concentras, evadiendo el proximo ataque enemigo y atacando."+ANSI_RESET);
                System.out.println(ANSI_RED+"[3]"+ANSI_RESET+ANSI_BLUE+ "-"+ANSI_YELLOW +"Beber una pocion: "+ANSI_RESET+ANSI_BLUE+"curas un 20% de tu vida restante"+ANSI_RESET);
                System.out.println(ANSI_RED+"[4]"+ANSI_RESET+ANSI_BLUE+ "-"+ "volver al menu anterior"+ANSI_RESET);
                respuesta=sc.nextInt();
                switch(respuesta){
                    case 1: golpeMortal();;
                    break;
                    case 2: evasion();
                    break;
                    case 3: beberPocion();
                    break;
                    case 4: menuDeCombate(sc, false, respuesta);
                    break;
                    default: System.out.println("Opcion incorrecta");
                    break;
                }
            }
        }catch(Exception e){System.out.println("Opcion incorrecta");sc.nextLine();}
    }while(respuesta==0);
    }


    ////menu de combate
    static void menuDeCombate(Scanner sc,boolean ganar,int eleccion){
    //try{
        do{
            try{
                        System.out.println(ANSI_BLUE+"Elegi lo que quieres hacer: "+ANSI_RESET);
                        sc.nextLine();
                System.out.println(ANSI_YELLOW+"[1]"+ANSI_RESET+ANSI_BLUE+" - Atacar"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[2]"+ANSI_RESET+ANSI_BLUE+" - Defenderte"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[3]"+ANSI_RESET+ANSI_BLUE+" - Utilizar una habilidad"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[4]"+ANSI_RESET+ANSI_BLUE+" - Alejarte"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[5]"+ANSI_RESET+ANSI_BLUE+" - Rendirte"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[6]"+ANSI_RESET+ANSI_BLUE+" - Ver mis estadisticas"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"[7]"+ANSI_RESET+ANSI_BLUE+" - Ver estadisticas enemigas"+ANSI_RESET);
                        eleccion = sc.nextInt();
                            if(eleccion!=1 || eleccion!=2 || eleccion!=3 || eleccion!=4 || eleccion!=5 || eleccion!=6 || eleccion!=7){
                                switch(eleccion){
                                    case 1: atacar();
                                    break;
                                    case 2: defender();
                                    break;
                                    case 3: MenuDeUsoDeHabilidades(sc);
                                    break;
                                    case 4: correr();
                                    break;
                                    case 5: System.out.println(ANSI_PURPLE+"¡TE RENDISTE!"+ANSI_RESET);
                                            ganar=true;
                                    break;
                                    case 6: estadisticas();
                                    break;
                                    case 7: estadisticasEnemigasActuales();
                                    break;
                                    default: System.out.println(ANSI_RESET+"Elegiste una opcion incorrecta, intentalo de nuevo"+ANSI_RESET);
                                }
                                }
                                else{System.out.println(ANSI_RED+"elegi otra opcion"+ANSI_RESET);}


                        if(jugador.getVida()<=0 && enemigo.getVida()>0){System.out.println(ANSI_RED+"¡Perdiste el juego!"+ANSI_RESET); ganar=true;} //PERDES

                        else if(enemigo.getVida()<=0 && jugador.getVida()>0){ //GANAS
                            jugador.setExperiencia(jugador.getExperiencia()+enemigo.getMobexperiancia());
                            /*System.out.println("##############¡GANASTE EL COMBATE!#################");*/
                            sc.nextLine();
                            System.out.println(ANSI_CYAN+"Obtienes "+ANSI_RESET+ANSI_RED + enemigo.getMobexperiancia() +ANSI_RESET+ANSI_CYAN+ "Puntos de Experiencia"+ANSI_RESET);
                            sc.nextLine();
                            if(jugador.getExperiencia()>1000*jugador.getNivel()+jugador.getNivel()){jugador.setNivel(jugador.getNivel()+1); System.out.println( "¡SUBISTE DE NIVEL!"); //CADA nivel cuesta 1000+ de experiencia
                            //por subir de nivel se obtienen 10 puntos para aumentar
                            agregarPuntos(sc, 10);
                            }
                            crearEnemigo();
                            System.out.println(ANSI_GREEN+"Para el siguiente combate, se restauro un 50% de"+ANSI_RESET+ANSI_BLUE+" Mana "+ANSI_RESET+ANSI_GREEN+"y"+ANSI_RESET+ANSI_RED+ " Vida Maxima"+ANSI_RESET+ANSI_RESET);
                            regeneracionDeVida(0.5);
                            }

                            else if(jugador.getVida()<0 && enemigo.getVida()<0) {
                            System.out.println(ANSI_RED+"¡AMBOS ESTAN EN EL SUELO!"+ANSI_RESET);
                            ganar=true;
                            } //EMPATAS=PERDER
                            else if(jugador.getNivel()==10){System.out.println(ANSI_GREEN_BACKGROUND+"¡GANASTE EL JUEGO!"+ANSI_RESET); ganar=true;}; //FINAL DEL JUEGO
                        ///////////////////////////
                         } catch(Exception e){System.out.println(ANSI_RED+"Caracter incorrecto, intenta de nuevo"+ANSI_RESET); sc.nextLine();}
    }while(ganar==false);
    
    
    
    }
    ////// Menu de inicio del juego
    static void InicioDelJuego(Scanner sc){
    System.out.println("#########################");
    System.out.println("###  ¡BIENVINIDO!   #####");
    System.out.println("#########################");
    System.out.println(ANSI_CYAN_BACKGROUND+ANSI_BLACK+"Recorda que: "+ANSI_RESET);
    System.out.println(ANSI_CYAN_BACKGROUND+ANSI_BLACK+"En este juego deberás utilizar los numeros para elegir la opcion deseada."+ANSI_RESET);
    sc.nextLine();
    System.out.println(ANSI_CYAN+"Informacion de clases: "+ANSI_RESET);
    descripcionDeClases();
    sc.nextLine();
    crearPersonaje(sc, 50);
    crearEnemigo(); 
    }

    ///// juego totalmente reducido
    static void JuegoTotal(Scanner sc, boolean ganar, boolean caracterincorrecto,int opcion){
    do{
    InicioDelJuego(sc);
    menuDeCombate(sc, ganar, opcion);
    ///////repetir partida:
    do{ ganar=false;
         try{
            System.out.println( "¿Queres volver a jugar? ingresa " + "[1]" +  ", caso contrario, apretá cualquier otro numero"); //Este caso va a pasar si se pierde la partida
            opcion=sc.nextInt();
            caracterincorrecto=false;} 
            catch(Exception e){
            System.out.println( "Debe ingresar solo un numero correspondiente a la opcion elegida");
            sc.nextLine();
            caracterincorrecto=true;
                }
        }while(caracterincorrecto==true);
    }while(opcion==1);
    if (opcion!=1){
    System.out.println(ANSI_GREEN+"¡GRACIAS POR JUGAR!"+ANSI_RESET);}
        
    }

//CONSTANTES COLOR BACKGROUND
public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";public static final String ANSI_RED_BACKGROUND = "\u001B[41m";public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
//CONSTANTES COLOR LETRAS 
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_RESET = "\u001B[0m";

////CONSTANTES QUE ME PERMITEN LLAMAR A ENEMIGO Y JUGADOR EN TODOS LADOS
private static Enemigo enemigo;
private static Personaje jugador;
///////////PROGRAMA MAIN//////////////////


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ganar=false;
        boolean caracterincorrecto=false;
        int opcion=0;
    JuegoTotal(sc, ganar, caracterincorrecto,opcion);
    }
}


