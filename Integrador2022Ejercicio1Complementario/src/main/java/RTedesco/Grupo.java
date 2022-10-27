package main.java.RTedesco;

public class Grupo {
    public String PaisNombre;
    public String Continente;
    public Character Grupo;


    public Grupo(String pais, String Continente, Character Grupo){
        this.PaisNombre = pais;
        this.Continente = Continente;
        this.Grupo = Grupo;
    }

    public String getNombre() {
        return PaisNombre;
    }

    public void setNombre(String nombre) {
        PaisNombre = nombre;
    }

    public String getContinete() {
        return Continente;
    }

    public void setContinente(String continente) {
        Continente = continente;
    }

    public char getGrupo() {
        return Grupo;
    }
    
    public void setGrupo(char grupo) {
        Grupo = grupo;
    }

}
