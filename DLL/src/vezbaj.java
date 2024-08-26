import java.util.Scanner;

public class vezbaj {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    DLL<Integer> lista1 = new DLL<>();
    for(int i=0 ; i<n ; i++){
        lista1.insertLast(scanner.nextInt());
    }        
    int m = scanner.nextInt();
    DLL<Integer> lista2 = new DLL<>();
    for(int j=0 ; j<m ; j++ ){
        lista2.insertLast(scanner.nextInt());
    }

    DLLNode<Integer> FLcurr = lista1.getFirst();
    
    while (FLcurr!=null) {
       DLLNode<Integer> pomosen = FLcurr;
       DLLNode<Integer> SLcurr = lista2.getFirst();
       while (pomosen!=null && SLcurr!=null && pomosen.element.equals(SLcurr.element)) {
            pomosen=pomosen.succ;
            SLcurr = SLcurr.succ;
       }

       if (SLcurr==null) {
        DLLNode<Integer> brishi = FLcurr;
        for(int i=0 ; i<m ; i++){
            DLLNode<Integer> nareden = brishi.succ;
            lista1.delete(brishi);
            brishi=nareden;
        }
        FLcurr = brishi;
       } else{
        FLcurr = FLcurr.succ;
       } 
    }
    if (lista1.getFirst() == null) 
    {
    System.out.println("Empty");    
    } else{
        System.out.println(lista1);
    }
     
}
}

