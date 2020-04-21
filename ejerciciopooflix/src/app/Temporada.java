package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {
        for (Episodio episod : this.episodios) {
            if (episod.numero == nro) {
                return episod;
            }
        }
        return null;

    }

}