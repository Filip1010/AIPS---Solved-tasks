import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class Lozinki{
    public static void main (String[] args) throws IOException {
        Hashtable<String, String> table = new Hashtable<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){
            String imelozinka = br.readLine();
            String[] pom = imelozinka.split(" ");
            table.put(pom[0],pom[1]);
        }
//        for(String key : table.keySet())
//        {
//            System.out.println(table.get(key));
//        }
        String input = br.readLine();
        while (!(input.equals("KRAJ"))){
            String [] user = input.split(" ");
            if (table.containsKey(user[0]) && table.get(user[0]).equals(user[1])){
                System.out.println("Najaven"); break;
            }
            System.out.println("Nenajaven");
            input= br.readLine();
        }
    }
}
