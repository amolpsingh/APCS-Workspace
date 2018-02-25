/**
 * teacher class creates object of teacher
 *
 * @author asingh989
 * @version Oct 12, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources:
 */
public class Teacher extends Person
{
    private String subject;

    private double salary;


    /**
     * constructor
     * 
     * @param myName
     *            name of thang
     * @param myAge
     *            age of thang
     * @param myGender
     *            gender of thang
     * @param mySubject
     *            subject of thang
     * @param mySalary
     *            salary of thang
     */
    public Teacher( String myName, int myAge, String myGender, 
        String mySubject, double mySalary )
    {
        super( myName, myAge, myGender );
        subject = mySubject;
        salary = mySalary;
    }


    /**
     * get salary
     * 
     * @return salary of object
     */
    public double getSalary()
    {
        return salary;
    }


    /**
     * get subject
     * 
     * @return subject of object
     */
    public String getSubject()
    {
        return subject;
    }


    /**
     * sets the subject
     * 
     * @param subject
     *            the input subject
     */
    public void setSubject( String subject )
    {
        this.subject = subject;
    }


    /**
     * sets the salary
     * 
     * @param salary
     *            salary input
     */
    public void setSalary( double salary )
    {
        this.salary = salary;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + subject 
                        + ", salary: " + salary;
    }
}
