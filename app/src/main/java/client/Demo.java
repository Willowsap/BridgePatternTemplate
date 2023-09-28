package client;

import buildings.Building;
import buildings.GothicHouse;
import buildings.GothicOffice;
import buildings.ModernHouse;
import buildings.ModernOffice;

/**
 * Demo to show how the bridge pattern works.
 * 
 * @author Willow Sapphire
 * @version 09/28/2023
 */
public class Demo
{
    /**
     * Runs the demo.
     * 
     * @param args unused.
     */
    public static void main(String[] args)
    {
        Building[] buildings = new Building[4];
        buildings[0] = new GothicHouse("My Home", 500);
        buildings[1] = new GothicOffice("My Workplace", 2500, 3);
        buildings[2] = new ModernHouse("My Home", 1200);
        buildings[3] = new ModernOffice("My Workplace", 5000, 10);

        for (Building b : buildings)
        {
            System.out.println(b.describe());
        }
    }
}
