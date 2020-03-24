import java.io.Console;
import java.util.Scanner;

public class Levenshtein {

    static double LevQWERTY(String s1, String s2)
    {
        int i, j, m, n;
        double cost=0;
        double d[][];
        char[][] tab={{'q','w','e','r','t','y','u','i','o','p'},
                {'a','s','d','f','g','h','j','k','l',' '},
                {'z','x','c','v','b','n','m',' ', ' ', ' '}};

        m = s1.length();
        n = s2.length();

        d = new double[m+1][n+1];

        for (i=0; i<=m; i++)
            d[i][0] = i;
        for (j=1; j<=n; j++)
            d[0][j] = j;

        for (i=1; i<=m; i++)
        {
            for (j=1; j<=n; j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                {
                    cost = 0;
                }
                else if(s1.charAt(i-1) != s2.charAt(j-1))
                {
                    int test=0;
                    for(int x=0; x<2; x++)
                    {

                        for(int y=0; y<9; y++)
                        {
                            if(tab[x][y]==s1.charAt(i-1))
                            {
                                for(int z=0; z<9; z++)
                                {
                                    if(tab[x][z]==s2.charAt(j-1))
                                    {
                                        test=1;
                                        cost=0.5;
                                    }
                                }
                            }
                            else if(tab[x][y]==s2.charAt(j-1))
                            {
                                for(int z=0; z<9; z++)
                                {
                                    if(tab[x][z]==s1.charAt(i-1))
                                    {
                                        test=1;
                                        cost=0.5;
                                    }
                                }
                            }
                        }
                    }
                    if(test==1)
                    {
                        cost=1;
                    }
                }

                d[i][j] = Math.min(d[i-1][j] + 1,  //deletion
                        Math.min(d[i][j-1] + 1,    //insertion
                                d[i-1][j-1] + cost));   //subsitution
                System.out.println(""+d[i][j]);
            }
        }

        return d[m][n];
    }

}