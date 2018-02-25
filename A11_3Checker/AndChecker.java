/**
 * The AndChecker accept method returns true if and only if the string is
 * accepted by both of the Checker objects with which it was constructed
 *
 * @author asingh989
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources:
 */
public class AndChecker implements Checker
{
    private Checker check;

    private Checker check1;


    /**
     * The and checker constructor
     * 
     * @param a
     *            input checker
     * @param b
     *            input checker
     */
    public AndChecker( Checker a, Checker b )
    {
        check = a;
        check1 = b;
    }


    /**
     * This checks for the substrings in string
     * 
     * @param text
     *            the input
     * 
     * @return whether the substring is in string
     */
    public boolean accept( String text )
    {
        return check.accept( text ) == check1.accept( text ) 
                        && check.accept( text );
    }
}
