/**
 *  this thing does object
 *  extends student
 *
 *  @author  asingh989
 *  @version Oct 12, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: 
 */
public class CollegeStudent extends Student
{
    /**
     * instance variable
     */
    private String myMajor;

    /**
     * instance variable
     */
    private int myYear;


    /**
     * @param myName
     *            name
     * @param myAge
     *            age
     * @param myGender
     *            gender
     * @param myIdNum
     *            num
     * @param myGPA
     *            gpa
     * @param year
     *            year
     * @param major
     *            major
     */
    public CollegeStudent(
        String myName,
        int myAge,
        String myGender,
        String myIdNum,
        double myGPA,
        int year,
        String major )
    {
        super( myName, myAge, myGender, myIdNum, myGPA );
        myMajor = major;
        myYear = year;
    }


    /**
     * gets year
     * 
     * @return year
     */
    public int getYear()
    {
        return myYear;
    }


    /**
     * gets major
     * 
     * @return major
     */
    public String getMajor()
    {
        return myMajor;
    }


    /**
     * sets major
     * 
     * @param major
     *            input
     */
    public void setMajor( String major )
    {
        this.myMajor = major;
    }


    /**
     * sets year
     * 
     * @param year
     *            input
     */
    public void setYear( int year )
    {
        this.myYear = year;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
