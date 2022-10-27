package main.java.RTedesco;
// Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar de ingresar valores repetidos

import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Set;

public class TedescoLinkedHashSet {

    Set<Character> conjuntoLinked = new LinkedHashSet<>();

    public void agregar(Character algo){ 
        conjuntoLinked.add(algo);
    }
    public String mostrar(){
        return (conjuntoLinked + "");
    }
    public boolean existeElemento(Object algo){
        return conjuntoLinked.contains(algo);
    }
    public int nrosDeLaList(){
        return conjuntoLinked.size();
    }
    public void removerTodo(){
        conjuntoLinked.clear();
    }
    public void remover(Object algo){
        conjuntoLinked.remove(algo);
    }
    public void add(char c) {
    }
    
    
}
