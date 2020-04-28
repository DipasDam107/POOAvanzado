/*
 Supón que vas a implementar un juego de mesa online basado en un tablero de 100 x 100
casillas en el que pueden jugar muchos jugadores a la vez.

    • Habrá una clase Tablero que tendrá un array de enteros de 20 x 20 donde mantendrá en
    cada casilla el id del jugador que hay en esa casilla en ese momento (o bien cero, si no hay
    ningún jugador en esa casilla).

    • Habrá una clase Jugador que mantendrá para cada jugador: su id y la fila y columna del
    tablero en la que esté. Al empezar la fila y la columna se generan al azar entre las casillas
    no ocupadas del tablero. El id es un número correlativo que identifica a cada jugador en
    el tablero y por tanto e en la partida. Para el primer jugador de la partida es 1 y se va
    autoincrementando cada vez que se crea un nuevo jugador.

Implementa las clases Jugador y Tablero. Como no sabemos cómo se programará el juego
online (no sabemos cuándo empieza y acaba una partida), haremos la clase Tablero con el
patrón Singleton de forma que, en el alta de un jugador, si no existe tablero (porque es el primer
jugador de la partida) se cree el tablero y para los siguientes jugadores de la partida usen ese
mismo tablero.

No sabemos el resto de reglas del juego por ahora. Solo haremos un programa que permita
dar de alta 10 jugadores y nos muestre para cada uno de ellos su id y posición en el tablero.
Ojo: Recuerda que en el programa no creamos ninguna instancia del tablero, el tablero se crea
cuando se crea el primer jugador. 
 */
package dam107t10e13;

import java.util.ArrayList;


public class Main {
    static ArrayList <Jugador> jugadores;
    public static void main(String [] args){
        jugadores=new ArrayList<>();
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        jugadores.add(new Jugador());
        
        for(Jugador x : jugadores)
            System.out.println(x.toString());
    }
}
