package buildings;

/**
 * An extremely simple house class in the gothic style.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class GothicHouse extends Building
{
    /**
     * Constructor to set name and area.
     * Same as Building constructor.
     * 
     * @param name what the building is called.
     * @param area the total area of the building.
     */
    public GothicHouse(String name, double area)
    {
        super(name, area);
    }

    /**
     * Describes the house as a family home.
     * Includes name and area in output.
     * 
     * @return a string describing the house.
     */
    @Override
    public String describe()
    {
        return String.format("A dark and old looking house named %s "
            + "with %.2f square ft of space", getName(), getArea());
    }
}
