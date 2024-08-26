import java.util.Scanner;

public class probamirror{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextInt());
        }
        
        
    }
}
