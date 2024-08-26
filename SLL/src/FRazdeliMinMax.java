import java.util.Scanner;

public class FRazdeliMinMax{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SLL<Integer> lista = new SLL<Integer>();

        for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextInt());
        }
        
        SLLNode<Integer> curr = lista.getFirst();
        int  max = lista.getFirst().element;
        int  min= lista.getFirst().element;

        while (curr!=null) {
            if (curr.element > max) {
                max = curr.element;
            }
            if (curr.element < min) {
                min = curr.element;
            }
            curr=curr.succ;
        }
        SLL<Integer> listaMin = new SLL<Integer>();
        SLL<Integer> listaMax = new SLL<Integer>();
        curr=lista.getFirst();

        while(curr!=null){
            int razlikaMin = Math.abs(min - curr.element);
            int razlikaMax = Math.abs(max - curr.element);
            if (razlikaMin < razlikaMax) {
                listaMax.insertLast(curr.element);
            }else if(razlikaMin == razlikaMax)
            {
                   listaMax.insertLast(curr.element);
            }else
                {
                listaMin.insertLast(curr.element);
            }
            curr=curr.succ;
        }
        System.out.println(listaMax);
        System.out.println(listaMin);
        

        
    }
}
