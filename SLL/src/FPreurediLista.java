import java.util.Scanner;

public class FPreurediLista {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0 ;
        SLL<Integer> lista = new SLL<Integer>();
        while(i<n){
            lista.insertLast(scanner.nextInt());
            i++;
        }
        lista.rearrange();
        System.out.println(lista.toString());
    }
}