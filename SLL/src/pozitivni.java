import java.util.Scanner;

public class pozitivni {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine();
         SLL<String> lista = new SLL<String>();
         for(int i=0 ; i<n ; i++){
            lista.insertLast(scanner.nextLine());
         }
        //  System.out.println(lista);
         iscepkaj(lista);
         System.out.println(lista);

    }
    public static void iscepkaj(SLL<String> lista) {
        SLL<String> nova = new SLL<String>();
        SLLNode<String> curr = lista.getFirst();
        while (curr!=null) {
            nova.insertLast(curr.element);
            curr=curr.succ;
        }
        System.out.println(nova);
        SLLNode<String> prvNova= nova.getFirst();
        while (prvNova !=null) {
            StringBuilder modified = new StringBuilder();
            String inp = prvNova.element;
            for(int i=0 ; i<inp.length() ; i++){
                char ch = inp.charAt(i);
                if (ch != ',') {
                    modified.append(ch);
                }
            }
            
        }
        curr=lista.getFirst();

        while (curr != null) {
            String input = curr.element;
            SLLNode<String> next = curr.succ; 

            for (int i = 0; i < input.length(); i++) {
                String charStr = String.valueOf(input.charAt(i));
                if (i == 0) {
                    curr.element = charStr; 
                } else {
                    lista.insertAfter(charStr, curr); 
                    curr = curr.succ; 
                }
            }
            curr = next; 
        }
        
    }
}
