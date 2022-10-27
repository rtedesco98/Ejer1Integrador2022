package main.java.RTedesco;

import java.util.Hashtable;
import java.util.Map;


public class TedescoHashtable {
    Hashtable<String, Object> hashgrupo = new Hashtable<String, Object>( 8);

    public void agregar(String grupo,Object elem){
        hashgrupo.put(grupo, elem);
    }

    public void remplazarValor(String grupo,Object elem){
        hashgrupo.put(grupo, elem);
    }

    public void eliminar(String grupo){
        hashgrupo.remove(grupo);
    }
    public Object mostrarElemento(String grupo){
        return hashgrupo.get(grupo);
    }

    public Object mostrarTabla(){
        return hashgrupo.values();
    }

    public Hashtable<String, Object> gethashgrupo() {
        return hashgrupo;
    }
    public void setHashgrupo(Hashtable<String, Object> hashgrupo) {
        this.hashgrupo = hashgrupo;
    }
}
