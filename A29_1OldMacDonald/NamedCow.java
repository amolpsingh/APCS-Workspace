/**
 * The Named Cow class to create a named cow. Extends cow class and has 3 string
 * parameter constructor.
 *
 * @author asingh989
 * @version Oct 24, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources:
 */
public class NamedCow extends Cow
{
    /**
     * the constructor
     * 
     * @param type
     *            the type of cow
     * @param sound
     *            the sound
     * @param name
     *            the name of cow
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );
        myName = name;
    }


    /**
     * named cow
     * 
     * @param type
     *            the type of cow
     * @param sound
     *            the sound of cow
     */
    public NamedCow( String type, String sound )
    {
        super( type, sound );
        myName = "";
    }

    private String myName;


    /**
     * returns name
     * 
     * @return the name
     */
    public String getName()
    {
        return myName;
    }

}
