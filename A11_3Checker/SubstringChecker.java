/**
 * A class that checks for a substring in a given string. Uses .indexOf method
 * of string to find the substring.
 *
 * @author asingh989
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A11_3Checker
 *
 * @author Sources:
 */
public class SubstringChecker implements Checker
{
    /**
     * a field
     */
    private String check;


    /**
     * constructor for substring checker
     * 
     * @param text
     *            the input
     */
    public SubstringChecker( String text )
    {
        check = text;
    }


    /**
     * This checks for substring in string
     * 
     * @param text
     *            the input
     * 
     * @return whether the substring is in string
     */
    public boolean accept( String text )
    {
        return text.indexOf( check ) != -1;
    }
}
