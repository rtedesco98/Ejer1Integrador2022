package main.java.RTedesco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import main.java.RTedesco.Grupo;
import main.java.RTedesco.Paises;
import main.java.RTedesco.TedescoAbstractSet;
import main.java.RTedesco.TedescoHashSet;
import main.java.RTedesco.TedescoHashtable;
import main.java.RTedesco.TedescoLinkedHashSet;
import main.java.RTedesco.TedescoTreeSet;

public class test {
    /*private static Character[] conjuntoLinked;*/

    //HashSet = Grupo de elementos NO REPETIDOS//

    @Test
    public static void TestHashSet (/*String[] args*/){

       Set<String> conjuntoHash = new HashSet<>(); 
        TedescoHashSet pruebaHashSet = new TedescoHashSet();

        conjuntoHash.add("Argentina");
        conjuntoHash.add("Argentina");
        conjuntoHash.add("Arabia Saudita");
        conjuntoHash.add("Polonia");
        conjuntoHash.add("Polonia");
        conjuntoHash.add("Emiratos Arabes");
        conjuntoHash.add("Mexico");

       /*  for(String valor : conjuntoHash){
            System.out.println("Valor : " + valor);
        }

        System.out.println(""); */

        assertEquals(true,pruebaHashSet.existeElemento(""));
        assertEquals(5,pruebaHashSet.nrosDeLaList());
    }

    @Test
    public static void TestTreeSet (){

        TedescoTreeSet conjuntoTreeSet = new TedescoTreeSet();

        conjuntoTreeSet.add("America");
        conjuntoTreeSet.add("Europa");
        conjuntoTreeSet.add("Africa");
        conjuntoTreeSet.add("Oceania");
        conjuntoTreeSet.add("Asia");
        conjuntoTreeSet.remover("Asia");


        /*System.out.println("TreeSet : ");
        System.out.println("----------");
        for (String valor : conjuntoTree){
            System.out.println("Valor : " + valor);
        }*/

        assertEquals(true,conjuntoTreeSet.existeElemento(1));
        assertEquals("",conjuntoTreeSet.mostrar());

    }
    
    @Test
    public static void TestLinkedHashSet(){
       /* Set<Character> conjuntoLinkedHashSet = new LinkedHashSet<>();*/
        TedescoLinkedHashSet conjuntoLinkedHashSet = new TedescoLinkedHashSet();
        conjuntoLinkedHashSet.add('A');
        conjuntoLinkedHashSet.add('B');
        conjuntoLinkedHashSet.add('C');
        conjuntoLinkedHashSet.add('D');
        conjuntoLinkedHashSet.add('E');
        conjuntoLinkedHashSet.add('F');
        conjuntoLinkedHashSet.add('G');
        conjuntoLinkedHashSet.add('H');


       /* System.out.println("LinkedHashSet : ");
        System.out.println("----------");
        for (Character valor : conjuntoLinked){
            System.out.println("Valor : " + valor);
        }*/

        assertEquals(true,conjuntoLinkedHashSet.existeElemento(""));
        conjuntoLinkedHashSet.remover("");
        assertEquals(8,conjuntoLinkedHashSet.nrosDeLaList());
        conjuntoLinkedHashSet.removerTodo();
        assertEquals("[]",conjuntoLinkedHashSet.mostrar());
    }
    

    @Test
    public void TestAbstractSet(){
        
        TedescoAbstractSet TestAbstracSet = new TedescoAbstractSet();

        TedescoAbstractSet conjuntoTreeSet = new TedescoAbstractSet();

        for (int i=8 ; i>TestAbstracSet.nrosDeLaListABS() ; i--){
            TestAbstracSet.agregarABS(i);
        }

        conjuntoTreeSet.add();
        conjuntoTreeSet.add();
        conjuntoTreeSet.add();

        TestAbstracSet.agregarCollection(conjuntoTreeSet.getconjuntoTree());
        assertEquals(true,TestAbstracSet.compruebaCollection(conjuntoTreeSet.getconjuntoTree()));
        TestAbstracSet.soloDejarCollection(conjuntoTreeSet.getconjuntoTree());
        assertEquals("",TestAbstracSet.mostrarABS());
    }

    @Test
    public void TestHashtable(Character H, Character D, Character E){

        TedescoHashtable hashgrupHashtable = new TedescoHashtable();

        Grupo grupo1 = new Grupo("Argentina","America",H);
        Grupo grupo2 = new Grupo("Francia","Europa",D);
        Grupo grupo3 = new Grupo("España","Europa",E);

        hashgrupHashtable.agregar("H", grupo1);
        hashgrupHashtable.agregar("D", grupo2);
        hashgrupHashtable.agregar("E", grupo3);
        hashgrupHashtable.eliminar("");

        assertEquals(grupo1,hashgrupHashtable.mostrarElemento("H"));
        assertEquals(grupo2,hashgrupHashtable.mostrarElemento("D"));
        assertEquals(grupo3,hashgrupHashtable.mostrarElemento("E"));


        assertEquals(("") ,hashgrupHashtable.mostrarTabla());

    }
}
