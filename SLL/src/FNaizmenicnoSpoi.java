import java.util.Scanner;

public class FNaizmenicnoSpoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=0;
        SLL<Integer> list1 = new SLL<Integer>();
        while(i<n){
            list1.insertLast(scanner.nextInt());
            i++;
        }
        int m=scanner.nextInt();
        i=0;
        SLL<Integer> list2 = new SLL<Integer>();
        while(i<m){
            list2.insertLast(scanner.nextInt());
            i++;
        }
        System.out.println(Spoi(list1,list2));
    }
    static SLL<Integer> Spoi(SLL<Integer> list1 , SLL<Integer> list2) {
       SLL<Integer> finalna = new SLL<Integer>();
       SLLNode<Integer> first = list1.getFirst();
       SLLNode<Integer> second = list2.getFirst();

       while (first!=null && second !=null) {
        int i=0;
        while (i<2 && first!=null) {
            finalna.insertLast(first.element);
            first=first.succ;
            i++;
        }
        i=0;
        while (i<2 && second!=null) {
            finalna.insertLast(second.element);
            second=second.succ;
            i++;
        }
       }
       while (first != null) {
        finalna.insertLast(first.element);
        first = first.succ;
    }
    while (second != null) {
        finalna.insertLast(second.element);
        second = second.succ;
    }
    return finalna;
    }
}
