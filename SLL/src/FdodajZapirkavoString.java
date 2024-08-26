import java.util.Scanner;

public class FdodajZapirkavoString {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         SLL<String> list = new SLL<>();
         int n=4;
         for(int i=0;i<n;i++){
            String input = scanner.nextLine();
            String modificiran = vmetniZapirka(input);
            list.insertLast(modificiran);
         }
         System.out.println(list);
    }

    public static String vmetniZapirka(String str) {
       StringBuilder modified = new StringBuilder();
       for(int i=0 ; i<str.length() ; i++){
        char currentChar = str.charAt(i);
        modified.append(currentChar);
        if (Character.isUpperCase(currentChar)) {
            modified.append(',');
        }
       }
        return modified.toString();
    }
}