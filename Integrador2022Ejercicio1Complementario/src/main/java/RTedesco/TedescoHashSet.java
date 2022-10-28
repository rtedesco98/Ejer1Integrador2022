package main.java.RTedesco;

import java.util.HashSet;
import java.util.Set;


public class TedescoHashSet  {
    Set<Object> conjuntoHash = new HashSet<>();

    public void agregar(Object obj){ 
        conjuntoHash.add(obj);
    }
    
    public boolean existeElemento(Object obj){
        return conjuntoHash.contains(obj);
    }
    public void remover(Object obj){
        conjuntoHash.remove(obj);
    }
    public int nrosDeLaList(){
    return conjuntoHash.size();
    }
    public void removerTodo(){
        conjuntoHash.clear();
    }
    public Object nrosDeLaLista() {
        return null;
    }
    
}