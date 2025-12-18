import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
public class sc2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter filepath: ");
        String filepath = sc.nextLine();

        System.out.println("Enter word to change: ");
        String word = sc.nextLine();

        System.out.println("Enter new word: ");
        String newword = sc.nextLine();

        System.out.println("Enter new filepath: ");
        String newpath = sc.nextLine();

        Scanner fileReader = null;
        FileWriter fileWriter = null;

        try{
            fileReader = new Scanner(Paths.get(filepath));
            fileWriter = new FileWriter(newpath);
            // 3. Dosyayı oku ve değiştir
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                // Kelimeyi değiştir
                String modifiedLine = line.replace(word, newword);

                // Değiştirilmiş satırı yeni dosyaya yaz
                fileWriter.write(modifiedLine + System.lineSeparator());
            }
            System.out.println("İslem basariyla tamamlandi!");
            System.out.println("'" + word + "' kelimeleri '" + newword + "' ile degistirildi.");
            System.out.println("Sonuc sunun içine kaydedildi: " + newpath);

        } catch (IOException e) {
            System.out.println("Hata olustu: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) fileReader.close();
                if (fileWriter != null) fileWriter.close();
                if (sc != null) sc.close();
            } catch (IOException e) {
                System.out.println("Dosya okunamadı veya yol yanlış.");
            }
        }
    }
}



