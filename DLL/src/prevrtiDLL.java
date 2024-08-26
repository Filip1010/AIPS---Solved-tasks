import java.util.Scanner;

public class prevrtiDLL {
    public static void main(String[] args) {
        DLL<String> lista = new DLL<String>();
        lista.insertLast("ovaa");
        lista.insertLast("lista");
        lista.insertLast("kje");
        lista.insertLast("bide");
        lista.insertLast("prevrtena");
        System.out.println(lista);
        lista.mirror();
        System.out.println(lista);
    }
}
