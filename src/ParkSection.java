
import java.util.Vector;


/**
 * ParkSection is the class that can represent a section of a real park,
 * with it, is possible to easily get the current state of a real park
 * which allows an application to monitor and control a park.
 *
 * @author      Gabriel Santos Tavares da Silva
 * @author      Felipe Afonso Nogueira Borges
 * @version     %I%, %G%
 * @since       1.0
 */
public class ParkSection 
{

    private Boolean parkSecState;

    private String parkSecName;

    /**
     * @element-type Spot
     */
    public Vector  mySpot;

    /**
     * @element-type SectionImg
     */
    public Vector  mySectionImg;

    public Boolean changed(Spot newSpots) {
        return null;
    }
}




