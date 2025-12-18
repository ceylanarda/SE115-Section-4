import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileWriter;
public class sc1 {
    public static void main(String[] args) {
        Scanner sc = null;
        FileWriter fw = null;

        String[] kelimeler = new String[100];
        int[] sayılar = new int[100];

        int farklıkelime = 0;
        int toplamkelime = 0;

        try {
            sc = new Scanner(Paths.get("q1.txt"));

            while (sc.hasNextLine()) {
                String kelime = sc.nextLine();
                toplamkelime++;

                boolean farklı = false;

                for (int i = 0; i < farklıkelime; i++) {
                    if (kelimeler[i].equals(kelime)) {
                        sayılar[i] = sayılar[i] + 1;
                        farklı = true;
                        break;
                    }
                }
                if (!farklı) {
                    kelimeler[farklıkelime] = kelime;
                    sayılar[farklıkelime] = 1;
                    farklıkelime++;
                }

            }
            fw = new FileWriter("word_stats.txt");
            String header = "Toplam kelime sayısı: " + toplamkelime + " Kelime Frekansları";
            System.out.println(header);
            fw.write(header);

            for(int i =0;i<farklıkelime;i++){
                String sonuc = kelimeler[i] + ": " + sayılar[i];

                System.out.println(sonuc);
                fw.write(sonuc);
            }
}
        catch(IOException e){
                e.printStackTrace();
            }
        finally{
                if (sc != null) sc.close();
        }
        System.out.println("correct");
        System.out.println("Dosya kaydedildi.");
    }
}
