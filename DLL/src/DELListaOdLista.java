import java.util.Scanner;
public class DELListaOdLista {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      DLL<Integer> lista = new DLL<Integer>();
      for(int i=0 ; i<n ; i++){
        lista.insertLast(scanner.nextInt());
      }
      int m = scanner.nextInt();
      DLL<Integer> lista2 = new DLL<Integer>();
      for(int j=0 ; j<m ; j++){
        lista2.insertLast(scanner.nextInt());
      }

      DLLNode<Integer> FLcurr = lista.getFirst();

      while (FLcurr !=null) {
        DLLNode<Integer> pomosen = FLcurr;
        DLLNode<Integer> SLcurr = lista2.getFirst();
        while (pomosen !=null && SLcurr !=null && pomosen.element.equals(SLcurr.element)) {
            pomosen=pomosen.succ;
            SLcurr = SLcurr.succ;
        }
        if (SLcurr==null) {
            DLLNode<Integer> zaBrishenje = FLcurr;
            for(int i=0 ; i<m ; i++){
                DLLNode<Integer> posleBrishenje = zaBrishenje.succ;
                lista.delete(zaBrishenje);
                zaBrishenje = posleBrishenje;
            }
            FLcurr = zaBrishenje;
        } else{
            FLcurr = FLcurr.succ;
        }

        if (lista.getFirst() == null) {
            System.out.println("Prazna Lista");
        }else{
            System.out.println(lista);
        }
      }

        
}
}
