import java.util.Scanner;

public class FBrishiJazli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<Integer> list = new SLL<Integer>();
        for(int i=0 ; i<n ; i++){
            list.insertLast(scanner.nextInt());
        }
        SLLNode<Integer> curr = list.getFirst();
        SLLNode<Integer> temp = curr;
     
        int counter = 1;
        while(curr!=null){
            int i=0;
            while(i<counter && curr!=null){
                curr=curr.succ;
                i++;
            }
            if(curr!=null){
                list.delete(curr);
                curr=curr.succ;
            }
            counter++;
        }
           System.out.println(list);
    }
}
