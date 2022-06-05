import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oso extends Actor
{
    /**
     * Act - do whatever the oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        World w = getWorld();
        move(-5);
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590,getY());
        }
        fin();
    }
    public void fin() 
    {
        Actor hermano;
        hermano = getOneObjectAtOffset(0,0,hermano.class);
        
        if (hermano!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(hermano);
            //llamar a la pantalla de perder
            
            
        }
    }
}
