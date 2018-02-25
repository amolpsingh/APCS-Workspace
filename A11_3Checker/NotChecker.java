/*** Part (c) ***/
/**
 * A one-parameter constructor that takes one Checker object. An accept method
 * that returns true if and only if its Checker object does NOT accept the
 * string A NotChecker accepts any string that does NOT contain a particular
 * substring.
 *
 * @author asingh989
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources:
 */
public class NotChecker implements Checker
{
    private Checker tester;


    /**
     * the constuctor for not checker
     * 
     * @param checker
     *            the input
     */
    public NotChecker( Checker checker )
    {
        tester = checker;
    }


    /**
     * the accept method for notchecker
     * 
     * @param text
     *            the input
     * @return the true or false for not checker
     */
    public boolean accept( String text )
    {
        return !tester.accept( text );
    }
}
