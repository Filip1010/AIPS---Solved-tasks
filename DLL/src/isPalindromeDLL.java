import java.util.Scanner;

public class vezbaj {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> lista = new DLL<>();
        for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextInt());
        }


        DLLNode<Integer> prv = lista.getFirst();
        DLLNode<Integer> posleden = lista.getLast();
        boolean flag  = true;
        while (prv!=posleden && prv.pred!=posleden) {
           if (!prv.element.equals(posleden.element)) 
           return -1;
            prv = prv.succ;
            posleden=posleden.pred;
        }
        return 1;
    }
}
public class isPalindromeDLL{
    p

}