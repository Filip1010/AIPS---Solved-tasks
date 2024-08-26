import java.util.Scanner;

public class vojnici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DLL<Integer> lista = new DLL<>();
        for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextInt());
        }

        int m = scanner.nextInt();
        DLL<Integer> prva = new DLL<>();
        for(int i=0 ; i<m ; i++){
            prva.insertLast(scanner.nextInt());
        }

        int p = scanner.nextInt();
        DLL<Integer> vtora = new DLL<>();
        for(int i=0 ; i<p ; i++){
            vtora.insertLast(scanner.nextInt());
        }


        DLL<Integer> nova = new DLL<>();
        DLLNode<Integer> curr = lista.getFirst();
        while (curr!=null) {
                DLLNode<Integer> naPrva = prva.getFirst();
                DLLNode<Integer> naVtora = vtora.getFirst();
                DLLNode<Integer> pomosen = curr;
             
                while (pomosen!=null) {
                if (pomosen.element.equals(naVtora.element)) {
                    nova.insertLast(pomosen.element);
                    pomosen=pomosen.succ;
                    naVtora = vtora.getLast();
                    while (pomosen.element!=naPrva.element) {
                        nova.insertLast(pomosen.element);
                        pomosen=pomosen.succ;
                    }
                }
                pomosen=pomosen.succ;
                
            }

            curr=curr.succ;
        }       

         System.out.println(nova);
     
  }
   
}
