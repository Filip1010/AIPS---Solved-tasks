import java.util.Scanner;

public class BXBIDodajZapPosebenNode {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 3;
    int i=0;
    SLL<String> lista = new SLL<String>();
    while (i<n ) {
        String input = scanner.nextLine();  
        lista.insertLast(input);
        i++;
    }

     SLLNode<String> curr = lista.getFirst();
     while (curr!=null) {
        InsertCommaAfterLUL(curr);
        curr=curr.succ;
     }
     System.out.println(lista);
    }

    public static void InsertCommaAfterLUL(SLLNode<String> node) {
        boolean hasUpperCase = false;
        int index = 0;
        for (int i=0;i<node.element.length();i++){
            if(Character.isUpperCase(node.element.charAt(i))){
                hasUpperCase = true;
                index = i;
            }
        }
        if(!hasUpperCase){
            return;
        }
        StringBuilder modified = new StringBuilder();
        for(int i=0;i<node.element.length();i++){
            modified.append(node.element.charAt(i));
            if(i==index){
                modified.append(',');
            }
        }
        node.element=modified.toString();
    }
}