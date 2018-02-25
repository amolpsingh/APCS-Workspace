import java.awt.*;
import javax.swing.*;


/**
 * This class is used to make an illusion of parallel lines
 * It uses graphical components and paints rectangles in a line
 * with alternating positions 
 *
 * @author
 * @version Sep 21, 2017
 * @author Period: 2
 * @author Assignment: A12_6ParallelLines
 *
 * @author Sources:
 */
public class ParallelLines extends JPanel
{


    /**
     * @param g
     *            graphical interface
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * draws the lines with rectangles in staggered array
     * 
     * @param g
     *            graphical interface
     * @param width
     *            width of rectangles/lines
     * @param height
     *            height of rectangles/lines
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        int y = 0;
        int row = 0;
        while ( row < 8 )
        {
            y *= 40;
            g.drawLine( ( 50 ), 400 - y, 600, 400 - y );
            y /= 40;
            y++;
            for ( int col = 0; col < 8; col++ )
            {
                for ( int x = 0; x < 7; x++ )
                {
                    if ( col <= 2 )
                    {
                        g.fillRect( 40 + ( 80 * x ) + ( 10 * col ), 
                            80 + ( 40 * col ), 40, 40 );
                    }
                    else if ( col == 3 || col == 4 )
                    {
                        g.fillRect( ( 80 + ( 80 * x ) ) - ( 10 * col ), 
                            80 + ( 40 * col ), 40, 40 );
                    }
                    else if ( col == 5 || col == 6 )
                    {
                        g.fillRect( 40 + ( 80 * x ) + ( 10 * col - 4 ), 
                            80 + ( 40 * col ), 40, 40 );
                    }
                    else 
                    {
                        g.fillRect( 60 + ( 80 * x ) - 10, 
                            80 + ( 40 * col ), 40, 40 );
                    }
                }
            }
            row++;
        }
    }


    /**
     * the main method for compiler
     * 
     * @param args
     *            string arguments passed through
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
