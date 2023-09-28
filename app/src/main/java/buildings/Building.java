package buildings;

/**
 * A very simple simulation of a building.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public abstract class Building 
{
    /**
     * What the building is called.
     */
    private String name;

    /**
     * The total area of the building.
     */
    private double area;

    /**
     * Constructor to set name and area.
     * 
     * @param name what the building is called.
     * @param area the total area of the building.
     */
    public Building(String name, double area)
    {
        setName(name);
        setArea(area);
    }

    /**
     * Accessor method for the building's name.
     * 
     * @return name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor method for the building's area.
     * 
     * @return area
     */
    public double getArea()
    {
        return area;
    }

    /**
     * Mutator method for name.
     * 
     * @param name the new name.
     */
    public void setName(String name)
    {
        this.name = name == null ? "" : name;
    }

    /**
     * Mutator method for area.
     * 
     * @param area the new area.
     */
    public void setArea(double area)
    {
        this.area = area < 0 ? 0 : area;
    }

    /**
     * Describes the type of building.
     * Each subclass must provide its own description.
     * 
     * @return a string describing the building.
     */
    public abstract String describe();
}
