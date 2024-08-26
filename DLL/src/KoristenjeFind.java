import java.util.Scanner;

public class KoristenjeFind {
    public static void main(String[] args) {
        DLL<Integer> lista = new DLL<Integer>();
        lista.insertLast(5);
        lista.insertLast(4);
        System.out.println("Listata po vmetnuvanje element e : "+ lista.toString()+" i obratno "+ lista.toStringR());

        lista.insertLast(3);
        lista.insertLast(1);
        System.out.println(lista);
        // lista.deleteFirst();
        // System.out.println(lista);
        DLLNode<Integer> pom = lista.find(5);
        lista.insertBefore(2, pom);
        System.out.println(lista);

        pom = lista.getFirst();
        lista.insertAfter(10, pom);
        System.out.println(lista);

        System.out.println("Momentalna dolzina na listata e " + lista.getSize()); 
        //koristenje komandi probno
    }
}
