import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escena88 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escena88 extends World
{

    /**
     * Constructor for objects of class Escena88.
     * 
     */
    public Escena88()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        musica();
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER"))
        {
            Greenfoot.delay(10); //para esperar tiempo    
            Greenfoot.setWorld(new Esscena8());
        }
        }
        private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("sonidito.wav");
        musica.setVolume(25);
        musica.playLoop();
    
    }
}
