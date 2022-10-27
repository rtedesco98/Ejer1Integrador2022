package main.java.RTedesco;

import java.util.HashSet;
import java.util.Set;


public class TedescoHashSet  {
    Set<Object> conjuntoHash = new HashSet<>();

    public void agregar(Object algo){ 
        conjuntoHash.add(algo);
    }
    public String mostrar(){
        return (conjuntoHash + "");
    }
    public boolean existeElemento(Object algo){
        return conjuntoHash.contains(algo);
    }
    public void remover(Object algo){
        conjuntoHash.remove(algo);
    }
    public int nrosDeLaList(){
    return conjuntoHash.size();
    }
    public void removerTodo(){
        conjuntoHash.clear();
    }
    
}