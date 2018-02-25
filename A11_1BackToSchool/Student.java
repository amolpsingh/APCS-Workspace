/**
 *  The student class.
 *  Makes a java object.
 *
 *  @author  asingh989
 *  @version Oct 12, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: 
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number
    private double myGPA;   // grade point average

    /**
     * @param name
     * nm
     * @param age
     * lj
     * @param gender
     * f
     * @param idNum
     * 3
     * @param gpa
     * 4
     */
    public Student( String name, int age, String gender, String idNum,
                    double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /**
     * id num
     * @return my num
     */
    public String getIdNum()
    {
        return myIdNum;
    }

    /**
     * gets
     * @return gpa
     */
    public double getGPA()
    {
        return myGPA;
    }

    /**
     * the set
     * @param idNum
     * num
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }

    /**
     * the set
     * @param gpa
     * gpa
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " +
            myIdNum + ", gpa: " + myGPA;
    }
}
