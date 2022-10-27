package main.java.RTedesco;
import java.util.TreeSet;
import java.util.Set;
//Los elementos del conjunto se almacenan de menor a mayor

public class TedescoTreeSet {
    Set<Object> conjuntoTree = new TreeSet<>();

    public void agregar(Object algo){ 
        conjuntoTree.add(algo);
    }
    public String mostrar(){
        return (conjuntoTree + "");
    }
    public void remover(Object algo){
        conjuntoTree.remove(algo);
    }
    public boolean existeElemento(Object algo){
        return conjuntoTree.contains(algo);
    }
    public int nrosDeLaList(){
        return conjuntoTree.size();
    }
    public void removerTodo(){
        conjuntoTree.clear();
    }
    public Set<Object> getconjuntoTree() {
        return conjuntoTree;
    }
    public void setconjuntoTree(Set<Object> conjuntoTree) {
        this.conjuntoTree = conjuntoTree;
    }
    public void add(String string) {
    }
}
