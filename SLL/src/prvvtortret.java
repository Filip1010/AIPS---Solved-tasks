import java.util.Scanner;
public class prvvtortret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<Integer> lista = new SLL<>();
        for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextInt());
        }
        int counter = 1 ;
        SLLNode<Integer> curr = lista.getFirst();
        while (curr!=null && curr.succ!=null) {
            for(int i=0 ; i<counter ; i++){
                curr=curr.succ;
            }
            counter++;
            lista.delete(curr);
            curr=curr.succ;
        }
        System.out.println(lista);
    }
}
