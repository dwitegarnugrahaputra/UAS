import org.w3c.dom.css.Counter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class sinauarray {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input jumlah data yang akan di proses : ");
        int u = Integer.parseInt(reader.readLine());
        int counter=0;
        for (int index=0;index<u;index++){
            counter++;
            System.out.print("Masukan Nama " + counter+" : ");
            String name = reader.readLine();
            System.out.println("Huruf yang akan dihitung : ");
            char s = reader.readLine().charAt(0); // Membaca karakter pertama dari input
            int count = countWord(name, s);
            g.add(count);
        }
        for (int value : g) {
            System.out.println(value);
        }
    }
    private static int countWord(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;

    }
}