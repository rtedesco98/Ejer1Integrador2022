package main.java.RTedesco;
import java.util.TreeSet;
import java.util.Set;
//Los elementos del conjunto se almacenan de menor a mayor

public class TedescoTreeSet {
    Set<Object> conjuntoTree = new TreeSet<>();

    public void agregar(Object elem){ 
        conjuntoTree.add(elem);
    }
    public String mostrar(){
        return (conjuntoTree + "");
    }
    public void remover(Object elem){
        conjuntoTree.remove(elem);
    }
    public boolean existeElemento(Object elem){
        return conjuntoTree.contains(elem);
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
