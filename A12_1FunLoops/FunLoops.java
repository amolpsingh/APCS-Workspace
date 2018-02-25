/**
 * A class to solve various loop problems
 * 
 * @author Amol
 * @version September 19, 2017
 * 
 *          Period - 1 Assignment - A12.1 - FunLoops
 * 
 *          Sources -
 */
public class FunLoops
{
    /**
     * finds the perfect squares that are sum of consecutive numbers
     * 
     * @param n
     *            integer input for magic squares
     */
    public void magicsquare( int n )
    {
        System.out.println( "Magic Squares" );
        int count = 1;
        long number = 1;
        long add = 1;
        for ( int y = 1; count <= n; y++ )
        {
            add = 0;
            number = 1;
            while ( add <= y * y )
            {
                add = add + number;
                if ( add == ( y * y ) )
                {
                    System.out.print( count + ": " );
                    System.out.println( y * y );
                    count = count + 1;
                    break;
                }
                else
                {
                    number = number + 1;
                }
            }
        }
    }


    /**
     * finds the lcm of two integers
     * 
     * @param a
     *            integer input
     * @param b
     *            integer input
     * @return least common multiple
     */
    public int lcm( int a, int b )
    {
        int lcm = 0;

        for ( int div = 1; div <= a && div <= b; div++ )
        {
            if ( a % div == 0 && b % div == 0 )
            {
                if ( b * ( a / div ) == ( a * ( b / div ) ) )
                {
                    lcm = b * ( a / div );
                }
            }
        }
        return lcm;
    }


    /**
     * the main method, where compiler reads
     * 
     * @param args
     *            input arguments
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }
}
