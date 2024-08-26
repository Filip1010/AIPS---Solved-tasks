import java.util.Scanner;

public class FRazdeliLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i=0;
    SLL<Integer> list = new SLL<Integer>();
    while(i<n){
        list.insertLast(scanner.nextInt());
        i++;
    }
    SLL<Integer> parni = new SLL<Integer>();
    SLL<Integer> neparni = new SLL<Integer>();

    SLLNode<Integer> current = list.getFirst();

    while(current!=null && current.succ!=null){
        if(current.element%2==0){
            if(current.succ.element%2!=0){
                parni.insertLast(current.element);
            } else{
                parni.insertLast(current.succ.element);
                current=current.succ;
            }
        }else{
            if(current.succ.element%2==0){
                neparni.insertLast(current.element);
            } else{
                neparni.insertLast(current.succ.element);
                current=current.succ;
            }
        }
        current=current.succ;
    }
    if(current!=null){
        if(current.element%2==0){
            parni.insertLast(current.element);
        }else{
            neparni.insertLast(current.element);
        }
    }
    
    System.out.println(parni);
    System.out.println(neparni);

    }
}
    
    
