import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;


/**
 * A class to draw, find perimeter, and find area of an irregular polygon
 * 
 * @author Amol
 * @version Oct 31, 2017
 *
 * @author Period - 1
 * @author Assignment - Irregular Polygon
 * 
 * @author Sources -
 */
public class IrregularPolygon
{
    private DrawingTool pen; //new DrawingTool( new SketchPad( 300, 300, 0 ) );

    private ArrayList<Point2D.Double> myPolygon;


    // constuctors

    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }


    // public methods

    public void add( Point2D.Double aPoint )
    {
        myPolygon.add( aPoint );
    }


    public double perimeter()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0.0;
        }
        double perimeter = 0;
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            perimeter += myPolygon.get( i ).distance( myPolygon.get( i + 1 ) );
        }
        perimeter = perimeter
            + myPolygon.get( myPolygon.size() - 1 ).distance( myPolygon.get( 0 ) );
        return perimeter;
    }


    public double area()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0.0;
        }

        double area = 0;
        int i = 0;
        while ( i < myPolygon.size() )
        {
            if ( i == myPolygon.size() - 1 )
            {
                area += myPolygon.get( i ).getX() * myPolygon.get( 0 ).getY();
                area -= myPolygon.get( i ).getY() * myPolygon.get( 0 ).getX();
            }
            else
            {
                area += myPolygon.get( i ).getX() * myPolygon.get( i + 1 ).getY();
                area -= myPolygon.get( i ).getY() * myPolygon.get( i + 1 ).getX();
            }
            i++;
        }
        area = area / 2;
        return Math.abs( area );
    }


    public void draw()
    {
        if ( myPolygon.size() < 3 )
        {
            return;
        }

        pen.up();
        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
        pen.down();

        for ( int n = 1; n < myPolygon.size(); n++ )
        {
            pen.move( myPolygon.get( n ).getX(), myPolygon.get( n ).getY() );
        }

        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
    }
}
