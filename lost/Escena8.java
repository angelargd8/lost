import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escena8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escena8 extends World
{

    /**
     * Constructor for objects of class Escena8.
     * 
     */
    public Escena8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        musica();
    }
    private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("sonidito.wav");
        musica.setVolume(25);
        musica.playLoop();
    
    }
    
}
