import java.util.Scanner;
import java.io.*;


/**
 * A class for calculating Statistics on a set of numbers.
 *
 * @author TODO enter your name
 * @version TODO enter the date
 * @author Period: TODO enter your period
 * 
 * @author Assignment: Lab Activity 16.1 - Statistics
 * 
 * @author Sources: TODO: list collaborators
 */
public class Statistics
{
    private final static int MAX_VALUE = 100;

    private int[] statsData = new int[1000];

    private int howMany;


    /**
     * Constructs this object with an array of integers for use with statistical
     * calculation
     * 
     * @param fileName
     *            name of file containing numbers for statistical evaluation
     */
    public Statistics( String fileName )
    {
        howMany = 0;
        loadFile( fileName );
    }


    /**
     * Loads text file into array data. Values are stored from positions
     * 0..howMany-1. Returns the number of data values as howMany
     * 
     * @param fileName
     *            file or string containing numbers to read
     */
    public void loadFile( String fileName )
    {
        int index = 0;
        Scanner inFile;

        try
        {
            if ( new File( fileName ).isFile() )
            {
                inFile = new Scanner( new File( fileName ) );
            }
            else
            {
                inFile = new Scanner( fileName );
            }

            while ( inFile.hasNext() )
            {
                statsData[index] = inFile.nextInt();
                index++;
            }
        }
        catch ( IOException i )
        {
            System.out.println( "Error: " + i.getMessage() );
        }
        howMany = index;
    }


    /**
     * Returns average of values in vector data.
     * 
     * @return average of this objects data collection
     */
    public double average()
    {
        double sum = 0;
        for ( int i = 0; i < howMany; i++ )
        {
            sum += statsData[i];
        }

        return (double)sum / howMany;
    }


    /**
     * Finds standard deviation of values in vector data.
     * 
     * @return the standard deviation of the vector data
     */
    public double stdDev()
    {
        double avg = average();
        double count = 0;
        for ( int i = 0; i < howMany; i++ )
        {
            count += ( avg - statsData[i] ) * ( avg - statsData[i] );
        }
        count = count / ( howMany - 1 );
        return Math.sqrt( count );
    }


    /**
     * finds the largest integer in the array scores. This array is sized from
     * 0..MAX_VALUE, with each element storing the quantity of each number from
     * 0..MAX_VALUE.
     * 
     * @param scores
     *            integer array sized at MAX_VALUE+1 with each element storing
     *            the quantity of each number from 0..MAX_VALUE
     */
    public int findLargest( int[] scores )
    {
        int largest = 0;
        
        for ( int i = 0; i < scores.length; i++)
        {
            if ( scores[i] > largest )
            {
                largest = scores[i];
            }
        }

        return largest;
    }


    /**
     * The array data is analyzed and transferred into a smaller array smallList
     * (0..MAX_VALUE). For each occurrence of n in the array data, smallList[n]
     * is incremented +1. findLargest is then called to find the largest
     * quantity in the array smallList. The mode(s) is/are returned in an array.
     * 
     * @return array of mode(s)
     */
    public int[] findMode()
    {
        int[] aList = new int[MAX_VALUE + 1]; // creates a frequency list
        for ( int i = 0; i < howMany; i++)
        {
            aList[statsData[i]] += 1;
        }
        
        int largest = findLargest( aList );
        int[] modeArray = new int[MAX_VALUE];
        int count = 0;
        for( int n = 0; n < MAX_VALUE; n++ )
        {
            if ( aList[n] == largest )
            {
                modeArray[count] = n;
                count++;
            }
        }
        int[] listOfModes = new int[count];
        
        int m = 0;
        while (m < listOfModes.length)
        {
            listOfModes[m] = modeArray[m];
            m++;
        }
        return listOfModes;
    }


    public static void main( String[] args )
    {
        Statistics fileStats = new Statistics( "numbers.txt" );

        System.out.printf( "The average = %6.2f", fileStats.average() );
        System.out.println();
        System.out.printf( "Standard deviation = %6.2f", fileStats.stdDev() );
        System.out.println();

        int[] mode = fileStats.findMode();
        System.out.print( "The mode is(are) --> " );
        for ( int m : mode )
        {
            System.out.print( m + "  " );
        }
    }
}
