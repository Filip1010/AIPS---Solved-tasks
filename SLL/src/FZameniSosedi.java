import java.util.Scanner;

public class FZameniSosedi {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<String> list = new SLL<>();
        for(int i=0 ; i<n ; i++){
                list.insertLast(scanner.nextLine());
        }
        SLLNode<String> curr = list.getFirst();
        while(curr!=null){
          staviTocka(curr);
          curr=curr.succ;
        }
        System.out.println(list);
}
        public static String staviTocka(SLLNode<Integer> node) {
         StringBuilder modified = new StringBuilder();
         for(int i=0 ; i<no)
       


}
}