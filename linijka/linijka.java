public class linijka {
    public static void rysuj(int zakres, int zagnieznienia)
    {
        liniaPLUScyfra(zagnieznienia,0);
        for(int j=0; j<zakres; j++)
        {
            przedzialki(zagnieznienia-1, zagnieznienia);
            liniaPLUScyfra(zagnieznienia,j+1);
        }
    } // funkcja odpowiedzialna za rysowanie calej linijki
    private static void przedzialki(int liczbakresek, int zagnieznienia)
    {
        if(liczbakresek>=1)
        {
            int ilespacji=(zagnieznienia-liczbakresek-1)/2;
           /*for(int x=0; x<ilespacji; x++)
            {
                System.out.print("  ");
            }*/
            przedzialki(liczbakresek-1, zagnieznienia); //kreski (to te od 0 do 0.5 itd)

           /*int ilespacji2=(majorLength-centralLength)/2;
            for(int x=0; x<ilespacji2; x++)
            {
                System.out.print(" ");
            }*/
            sama_linia(liczbakresek);  //linia na srodku miedzy cyframi (jak mamy od 1 do 2 to linia ta oznacza 1,5)
            przedzialki(liczbakresek-1, zagnieznienia); //kreski (to te od 0.5 do 1 itd)
        }
    }
    private static void sama_linia(int liczbakresek)
    {
        for(int j=0; j<liczbakresek; j++)
            System.out.print("--");
        System.out.print("\n");
    }
    private static void liniaPLUScyfra(int liczbakresek, int cyfra)
    {
        for(int j=0; j<liczbakresek; j++)
            System.out.print("--");
        if(cyfra>=0)
            System.out.print(" "+cyfra);
        System.out.print("\n");
    }

}
