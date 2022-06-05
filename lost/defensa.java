import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class defensa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class defensa extends Actor
{
    /**
     * Act - do whatever the defensa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        World w = getWorld();
        World w2 = getWorld();
        move(-5);
        if(isAtEdge())
        {
            w.removeObject(this);
        }
        else if(isTouching(oso.class)){
            removeTouching(oso.class);}
        else if (isTouching(detective.class)){
            removeTouching(detective.class);
            //llamar al final bueno 
        
        }
           
            
    }
}