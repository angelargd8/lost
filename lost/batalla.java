import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batalla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batalla extends World
{

    /**
     * Constructor for objects of class batalla.
     * 
     */
    public batalla()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        musica();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        detective detective = new detective();
        addObject(detective,520,194);
        hermano hermano = new hermano();
        addObject(hermano,398,323);
        hermano hermano2 = new hermano();
        addObject(hermano2,49,193);
        oso oso = new oso();
        addObject(oso,500,87);
        oso oso2 = new oso();
        addObject(oso2,439,48);
        oso oso3 = new oso();
        addObject(oso3,418,144);
        oso oso4 = new oso();
        addObject(oso4,348,95);
        oso oso5 = new oso();
        addObject(oso5,442,230);
        oso oso6 = new oso();
        addObject(oso6,351,208);
        oso oso7 = new oso();
        addObject(oso7,489,312);
        oso oso8 = new oso();
        addObject(oso8,351,300);
        oso oso9 = new oso();
        addObject(oso9,415,370);
        hermano.setLocation(405,328);
        hermano.setLocation(401,325);
        removeObject(hermano);
        oso oso10 = new oso();
        addObject(oso10,412,296);
        oso oso11 = new oso();
        addObject(oso11,558,356);
        oso oso12 = new oso();
        addObject(oso12,489,376);
    }
    private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("sonidito.wav");
        musica.setVolume(25);
        musica.playLoop();
    
    }
}
