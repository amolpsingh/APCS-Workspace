import java.util.*;


/**
 * The farm class to construct farm objects. Utilizes arrays and the other
 * classes in this project.
 * 
 * @author Amol Singh
 * @version Mar 24, 2017
 * 
 *          Period - 1 Assignment - A29.1 Old MacDonald
 * 
 *          Sources -
 */
public class Farm
{
    private Animal[] a = new Animal[3];


    /**
     * constructor for farm
     */
    public Farm()
    {
        a[0] = new Cow( "cow", "moo moo" );
        a[0] = new NamedCow( "cow", "Elsie", "moo" );
        a[1] = new Chick( "chick", "cluck cluck" );
        a[1] = new Chick( "chick", "cluckity cluck", "cheep" );
        a[2] = new Pig( "pig", "oink oink" );
    }


    public void animalSounds()
    {
        for ( int i = 0; i < a.length; i++ )
        {
            System.out.println( a[i].getType() + " goes " + a[i].getSound() );
        }
        NamedCow named = (NamedCow)a[0];
        System.out.println( named.getType() + " is named " + named.getName() );
    }
}
