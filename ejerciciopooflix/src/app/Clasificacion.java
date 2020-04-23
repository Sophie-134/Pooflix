package app;

public class Clasificacion {
    public Clasificacion(String tipo, int edadMinima){
        this.tipo=tipo;
        this.edadMinima=edadMinima;
    }
    
    private String tipo;
    private int edadMinima;
    private String descripcion;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdadMinima() {
        return this.edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}