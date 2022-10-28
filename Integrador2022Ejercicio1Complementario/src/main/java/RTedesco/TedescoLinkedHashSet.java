package main.java.RTedesco;
// Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar de ingresar valores repetidos

import java.util.LinkedHashSet;
import java.util.Collection; 
import java.util.Set;
import java.util.*;

public class TedescoLinkedHashSet {

    Set<Character> conjuntoLinked = new LinkedHashSet<>();

    public void agregar(Character elem){ 
        conjuntoLinked.add(elem);
    }
    public String mostrar(){
        return (conjuntoLinked + "");
    }
    public boolean existeElemento(Object elem){
        return conjuntoLinked.contains(elem);
    }
    public int nrosDeLaList(){
        return conjuntoLinked.size();
    }
    public void removerTodo(){
        conjuntoLinked.clear();
    }
    public void remover(Object elem){
        conjuntoLinked.remove(elem);
    }
    public void add(char c) {
    }
    
    
}
