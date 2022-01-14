import java.util.Scanner;

public class FibonacciSequence {

    public   static   void   main (   String []   args   )
    {
        long f, fp = 1 , fpp = 1;
        Scanner keyboard = new Scanner ( System . in );
        System . out. print( " Enter n: " );
        int n = keyboard . nextInt ();
        for ( int i = 2; i <= n; i ++ )
        {
            f = fp + fpp;
           System.out.println(
                i + " tf= " + f + " tfp = " + fp + " tfpp= " + fpp );
            fpp = fp;
            fp = f;



        }
    }
}
