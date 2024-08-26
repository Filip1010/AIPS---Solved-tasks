import java.util.Scanner;

public class brisamVtor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        SLL<Integer> list = new SLL<Integer>();
        for(int i=0 ; i<n ; i++){
            list.insertLast(scanner.nextInt());
        }
        SLLNode<Integer> curr = list.getFirst();
        
        while (curr!=null && curr.succ!=null) {
            list.delete(curr.succ);
            curr=curr.succ;
        }
        System.out.println(list);
    }
}
