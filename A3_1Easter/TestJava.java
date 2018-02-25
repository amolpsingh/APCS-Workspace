
public class TestJava
{
    public static void calculateChar()
    {
        char myC = 'c';
        System.out.println("Test String");
        String autoString = (myC + 0 +"");
        System.out.println(autoString);

        int autoInt = 0 + myC;
        String autoString1 = 0 +"";
        System.out.println(autoString1);

        String autoString2 = (myC + (0 +""));
        System.out.println(autoString2);
    }
    
    public static void yes()
    {
        int x = 0;
        boolean y = true;
        if (y && (x != 0) && (2/x == 0))
         System.out.println("success");
        else
         System.out.println("failure");
        
    }
    
    public static void calculate()
    {
        char myC = 'c';
        
        System.out.println("TestChar");
        System.out.println(myC);
        System.out.println(myC + 0);
        System.out.println('c' + 0);
        System.out.println("" + 'c' + 0);
        System.out.println('3' + 9);
        System.out.println('3' + 9 + 9);

        System.out.println("Test AutoInt");
        long autoInt = myC + 0;
        System.out.println(autoInt);

        long autoInt2 = '=' + 0;
        System.out.println(autoInt2);
        
        System.out.println("Test String");
        String autoString = (myC + 0 +"");
        System.out.println(autoString);
        System.out.println("3" + 9 + 9);
    }
    
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub
        //calculate();
        //calculateChar();
        yes();
    }

}
