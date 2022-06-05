import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class detective here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class detective extends Actor
{
    /**
     * Act - do whatever the detective wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        fin();
    }
    public void moveAround()
    {
        move(5);
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-5);
        }    
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
