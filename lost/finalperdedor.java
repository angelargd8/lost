import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finalperdedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalperdedor extends World
{

    /**
     * Constructor for objects of class finalperdedor.
     * 
     */
    public finalperdedor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.delay(100); //para esperar tiempo    
            Greenfoot.setWorld(new menu());
        }
        }
}
