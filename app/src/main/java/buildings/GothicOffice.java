package buildings;

/**
 * An old-style, dark-look office buidling.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class GothicOffice extends Building
{
    /**
     * The number of floors in the office building.
     */
    private int numFloors;

    /**
     * Constructor to set name, area, and numFloors.
     * 
     * @param name what the office is called.
     * @param area the total area of the office.
     * @param numFloors the number of floors in the office.
     */
    public GothicOffice(String name, double area, int numFoors)
    {
        super(name, area);
        setNumFloors(numFoors);
    }

    /**
     * Accessor method for numFloors.
     * 
     * @return numFloors.
     */
    public int getNumFloors()
    {
        return numFloors;
    }

    /**
     * Mutator method for numFloors.
     * 
     * @param numFloors the new number of floors.
     */
    public void setNumFloors(int numFloors)
    {
        this.numFloors = numFloors < 0 ? 0 : numFloors;
    }

    /**
     * Describes the office building using numFloors
     * along with the name and area.
     * 
     * @return a string describing the office.
     */
    @Override
    public String describe()
    {
        return String.format("An %d story gothic office building named %s "
            + "with %.2f square ft of space", getNumFloors(), getName(), getArea());
    }
}
