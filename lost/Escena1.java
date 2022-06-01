import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escena1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escena1 extends World
{
    /**
     * Constructor for objects of class Escena1.
     * 
     */
    public Escena1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        texto();
        musica();
        
    }
    
    private void texto()//prepara la pantalla con los objetos necesarios
    {
        addObject(new texto_1(), 300, 200);

    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10); //para esperar tiempo       
            Greenfoot.setWorld(new Escena2());

            }
        }
        
    private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("sonidito.wav");
        musica.setVolume(25);
        musica.playLoop();
    
    }
}
