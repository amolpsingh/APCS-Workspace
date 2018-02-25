/**
 * Makes a class for pig to make pig objects. Utlize interface animal, and
 * defines all abstract methods from animal.
 *
 * @author asingh989
 * @version Oct 24, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources:
 */
public class Pig implements Animal
{
    private String myType;

    private String mySound;


    /**
     * Initializes a newly created Pig object so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Pig
     * @param sound
     *            the sound the Pig makes
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * returns sound
     * @return sound
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * returns type
     * @return type
     */
    public String getType()
    {
        return myType;
    }
}