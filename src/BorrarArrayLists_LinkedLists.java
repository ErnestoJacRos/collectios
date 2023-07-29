import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BorrarArrayLists_LinkedLists {

    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1,"Luis",45));
        listaArray.add(new Persona(2,"Gabriel",30));
        listaArray.add(new Persona(3,"Ibra",9));
        listaArray.add(new Persona(4,"ToodCode",3));

        LinkedList <Persona> listaLinked = new LinkedList<Persona>();
        //agregar al final de la lista
        listaLinked.add(new Persona(1,"Luis",45));
        listaLinked.add(new Persona(2,"Gabriel",30));
        listaLinked.add(new Persona(3,"Ibra",9));
        listaLinked.add(new Persona(4,"ToodCode",3));

        //Remove en ArrayLists
        listaArray.remove(0);

        //Remove en LinkedLists

        String nombreBorrar = "Gabriel";
        for (Persona perso: listaLinked  ) {
            if (perso.getNombre().equals(nombreBorrar)){
                listaLinked.remove(perso);
                break;
            }
        }

        listaLinked.forEach(perso -> System.out.println("Edad = " + perso.getEdad()));
        System.out.println("ArrayLists");
        listaArray.forEach(lista -> System.out.println("lista = " + lista.getNombre()));
        System.out.println("LinkedLists");
        listaLinked.forEach(lista -> System.out.println("lista = " + lista.getNombre()));

        System.out.println("===Qué tamaño tiene tienen las listas===");
        System.out.println("ArrayLists: " + listaArray.size());
        System.out.println("LinkedLists: " + listaLinked.size());

        System.out.println("===Primer y Ultimo Objeto (Solo para Linked List) ===");

        System.out.println("Primer de LinkedLists: " + listaLinked.getFirst().toString());
        System.out.println("Primer de LinkedLists: " + listaLinked.getLast().toString());

        System.out.println("===Borrar Listas  ===");
        listaArray.clear();
        listaLinked.clear();
        System.out.println("===Esta vaia alguna lista ?===");

        System.out.println("ArrayList está vacía: " + listaArray.isEmpty());
        System.out.println("ArrayList está vacía: " + listaLinked.isEmpty());




    
    }

}
