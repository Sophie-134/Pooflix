package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporadas(){
        return this.temporadas;
    }
    public void setTemporadas(List<Temporada> temporadas){
        this.temporadas=temporadas;
    }


    public Temporada getTemporada(int nro){
    //recorrer cada temporada
    //Si el numero de temporada del ciclo es ingual a "nro"
    //Devolver esa temporada

    for (Temporada tempo : this.temporadas){
        if(tempo.getNumero() == nro){
            return tempo;
        }
    } return null; 
    }

    
}