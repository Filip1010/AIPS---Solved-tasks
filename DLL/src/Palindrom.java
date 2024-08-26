import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            list.insertLast(scanner.nextInt());
        }

        System.out.println(list);
        System.out.println(isPalindrome(list));
    }

    static int isPalindrome(DLL<Integer> list) {
        DLLNode<Integer> first = list.getFirst();
        DLLNode<Integer> last = list.getLast();
        while (first != null && last != null && first != last) {
            if (!(first.element.equals(last.element))){
                return -1;
            }
            first = first.succ;
            last = last.pred;
        }
        return 1;
    }
}
