import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    Flecha Flecha = new Flecha();
    private int opcion = 0;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }
      
    private void prepare()//prepara el menú con los objetos necesarios
    {
        addObject(new Start(), 150, 300);
        addObject(new Exit(), 150, 350);
        addObject(new titulo(), 400, 70);
        addObject(Flecha, 50, 300);
    }
    
}
