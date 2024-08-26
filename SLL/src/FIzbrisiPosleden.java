import java.util.Scanner;
public class FIzbrisiPosleden {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i =0;
        SLL<Integer> list = new SLL<Integer>();
        while (i<n) {
              list.insertLast(scanner.nextInt());
              i++;
        }
        int izbrishi = scanner.nextInt();
        SLLNode<Integer> current = list.getFirst();
        SLLNode<Integer> pojavuvanje = null;
        while (current!=null) {
            if(current.element.equals(izbrishi)){
                pojavuvanje = current;
            }
            current=current.succ;
        }
        list.delete(pojavuvanje);
        System.out.println(list.toString());
    }
}


