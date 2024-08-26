import java.util.Scanner;

public class discordmoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<Integer> list = new SLL<Integer>();
        for(int i=0 ; i<n ; i++){
            list.insertLast(scanner.nextInt());
        }
        int element = scanner.nextInt();
        SLLNode<Integer> curr = list.getFirst();
        int index = 0;
        boolean hasNum = false;
        while (curr!=null) {
            if (curr.element.equals(element)) {
                index++;
                hasNum = true;
            }
            curr=curr.succ;
        }
        curr=list.getFirst();
        while (curr!=null) {
            if (!hasNum) {
                return;
            }
            if (index % 2 != 0) {
                int posleden = 0;
                for(int i=0 ; i<n && curr!=null ; i++){
                    if (curr.element.equals(element)) {
                        posleden = i;
                    }
                    curr=curr.succ;
                }
            curr=list.getFirst();
            for(int i=0 ; i<posleden ; i++){
                curr=curr.succ;
            }
            list.delete(curr);
            System.out.println(list);
            break;
            } 
            else{
                System.out.println(list);
                break;
            }
        }

    }
}
