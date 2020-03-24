import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int i=2;
       linijka linijka = new linijka();
        Scanner scanner = new Scanner(System.in);
        int liczba=0;
        int  zagnieznienia=0;
        while(liczba<1) {
            System.out.println("Podaj liczba do ilu chcesz zeby pokazywala linijka:");
            liczba = scanner.nextInt();
            if(liczba<1)
                System.out.println("BLĄD! Liczba musi być wieksza od 0!");


        }
        while(zagnieznienia<1) {
            System.out.println("Podaj liczbe zagnieznen:");
            zagnieznienia = scanner.nextInt();
            if(zagnieznienia<1)
                System.out.println("BLĄD! Liczba zagnieznien musi być wieksza od 0!");
        }
       linijka.rysuj(liczba,zagnieznienia);
       //przedzialki(5); //rysowanie kresek mniejszych niz tych co sa przy miarach
      //sama_linia(5); //5 --- ile kresek, 2-- jaka cyfra obok
    }
}