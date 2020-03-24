import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String s, t;
        Scanner scanner = new Scanner(System.in);
        Levenshtein odleglosc = new Levenshtein();
        System.out.println("Podaj pierwszy wyraz");
        s = "test";
        t = "test";

        int test = 1;
        while (test != 0) {
            test = 0;
            s = scanner.nextLine();
            for (int i = 0; i < s.length(); i++)
                if (!(s.charAt(i) >= 97 && s.charAt(i) <= 122))
                    test++;
            if(test!=0)
                System.out.println("Wyraz musi skladac sie tylko z malych liter");
        }

        System.out.println("Podaj drugi wyraz: ");
        test = 1;
        while (test != 0) {
            test = 0;
            t = scanner.nextLine();
            for (int i = 0; i < t.length(); i++)
                if (!(t.charAt(i) >= 97 && t.charAt(i) <= 122))
                    test++;
        if(test!=0)
            System.out.println("Wyraz musi skladac sie tylko z malych liter");
        }
        System.out.println("Odleglosc Levenshteina wynosi: " + odleglosc.LevQWERTY(s, t));
    }
}
