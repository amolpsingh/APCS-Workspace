/**
 * Chick class that constructs a chick. Implement interface animal.
 *
 * @author asingh989
 * @version Oct 24, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources:
 */
public class Chick implements Animal
{
    private String myType;

    private String mySound;

    private String mySound1;


    /**
     * Initializes a newly created Cow object so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Cow
     * @param sound
     *            the sound the Cow makes
     */
    public Chick( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * Chick constructor 2
     * 
     * @param type
     *            the type of cow
     * @param sound
     *            first sound
     * @param sound1
     *            second sound
     */
    public Chick( String type, String sound, String sound1 )
    {
        myType = type;
        mySound = sound;
        mySound1 = sound1;
    }


    /**
     * method to return sound
     * 
     * @return sound
     */
    public String getSound()
    {
        String sounds;
        double rand = Math.random();
        if ( rand < 0.5 )
        {
            sounds = mySound;
        }
        else
        {
            sounds = mySound1;
        }
        return sounds;
    }


    /**
     * method to return type
     * 
     * @return type
     */
    public String getType()
    {
        return myType;
    }
}