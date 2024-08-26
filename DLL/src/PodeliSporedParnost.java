import java.util.Scanner;

public class PodeliSporedParnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            list.insertLast(scanner.nextInt());
        }

        DLL<Integer> parni = new DLL<Integer>();
        DLL<Integer> neparni = new DLL<Integer>();

        DLLNode<Integer> first = list.getFirst();
        DLLNode<Integer> last = list.getLast();

        while (first!=null && last!=null && first!=last){
            if (first.element%2==0){
                parni.insertLast(first.element);
            } else {
                neparni.insertLast(first.element);
            }
            if (last.element%2==0){
                parni.insertLast(last.element);
            } else {
                neparni.insertLast(last.element);
            }
            first=first.succ;
            last=last.pred;
        }

        if (first != null && last != null && first == last) {
            if (first.element % 2 == 0) {
                parni.insertLast(first.element);
            } else {
                neparni.insertLast(first.element);
            }
        }
        System.out.println(neparni);
        System.out.println(parni);
    }

    static DLL<Integer> Podeli(DLL<Integer> list) {
        return null;
    }
}
