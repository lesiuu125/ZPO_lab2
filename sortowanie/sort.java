import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.Collator;
import java.util.Locale;
import java.util.Arrays;

public class sort {


    public static void sortString(Collator collator, String[] words) {
        String tmp;
        //Collator c = Collator.getInstance(new Locale("pl", "PL"));
        if (words.length == 1)
            return;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (collator.compare(words[i], words[j]) > 0) {
                    tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }
    }


    public static void main(String args[]) throws Exception {
       /* String[] words = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka",
                "Zyta", "Órszula", "Świętopełk"};*/
        int i=0;
        Collator c = Collator.getInstance(new Locale("pl", "PL"));
        //Writer w = new BufferedWriter(new OutputStreamWriter(System.out, "Cp850"));
       /* for (int i = 0; i < 8; i++) {
            System.out.println("" +words[i]);
        }
        System.out.println("\n");
        sortString(c.getInstance(), words);
        for (int i = 0; i < 8; i++) {
            System.out.println("" +words[i]);
        }*/

        long nano_startTime = System.nanoTime();
        while(i<100000)
        {
            String[] words = {"Łukasz", "Ścibor", "Stefania", "Darek", "Agnieszka",
                    "Zyta", "Órszula", "Świętopełk"};
            sortString(c.getInstance(), words);
            i++;
        }
        long nano_endTime = System.nanoTime();
        System.out.println("Czas wykonania sortowania: " +nano_endTime);
    }
}