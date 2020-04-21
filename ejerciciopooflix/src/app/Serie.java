package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int nro){
    //recorrer cada temporada
    //Si el numero de temporada del ciclo es ingual a "nro"
    //Devolver esa temporada

    for (Temporada tempo : this.temporadas){
        if(tempo.numero == nro){
            return tempo;
        }
    } return null; 
    }

    
}