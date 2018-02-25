/**
 * The person class.
 * Sets the object for person.
 *
 * @author asingh989
 * @version Oct 12, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: 
 */
public class Person
{
    private String myName; // name of the person

    private int myAge; // person's age

    private String myGender; // 'M' for male, 'F' for female


    /**
     * @param name
     *            nam
     * @param age
     *            year
     * @param gender
     *            gend
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    /**
     * gets name
     * 
     * @return names
     */
    public String getName()
    {
        return myName;
    }


    /**
     * gets age
     * 
     * @return age
     */
    public int getAge()
    {
        return myAge;
    }


    /**
     * gets gend
     * 
     * @return gend
     */
    public String getGender()
    {
        return myGender;
    }


    /**
     * lol
     * 
     * @param name
     *            name
     */
    public void setName( String name )
    {
        myName = name;
    }


    /**
     * sets s
     * 
     * @param age
     *            ageee
     */
    public void setAge( int age )
    {
        myAge = age;
    }


    /**
     * sets st
     * 
     * @param gender
     *            gender
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}