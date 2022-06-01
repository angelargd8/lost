import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hermano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hermano extends Actor
{
    World w;
    /**
     * Act - do whatever the hermano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        w = getWorld();
        // Add your action code here.
        mover();
        defensa();
    }
    
    public void mover()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-10); 
        }
        if(Greenfoot.isKeyDown("Down"))
        {
             setLocation(getX(),getY()+10); 
        }
    }
    
    public void defensa()
    {
        World w = getWorld();
       if(Greenfoot.isKeyDown("space"))
       {
           w.addObject(new defensa (),getX()+50, getY());
       }
    }
}
