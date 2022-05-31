import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maze extends World
{
    public static wall w1 = new wall();
    public static WallHor w2 = new WallHor();
    public static detectiveMaz dm = new detectiveMaz();
    public static nextLe nl = new nextLe();
    /**
     * Constructor for objects of class maze.
     * 
     */
    public maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.getBackground().scale(620,400);
        
        //detective
        addObject(dm,500,380);
        //objeto
        addObject(w1,295,185);
        w1.getImage().scale(5,45);
        
        addObject(w2,90,55);
        w2.getImage().scale(90,5);
        //Oso
        addObject(new OsoMaze(),190,185);
        
        //Zapato
        addObject(new shoe(),555,350);
        //Key
        addObject(new key(),150,35);
    }
}
