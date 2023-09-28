package buildings;

/**
 * An extremely simple house class with a modern design.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class ModernHouse extends Building
{
    /**
     * Constructor to set name and area.
     * Same as Building constructor.
     * 
     * @param name what the building is called.
     * @param area the total area of the building.
     */
    public ModernHouse(String name, double area)
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
        return String.format("A minimalist, sleek, modern-looking home named %s "
            + "with %.2f square ft of space", getName(), getArea());
    }
}
