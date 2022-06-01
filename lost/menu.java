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
        super(600, 400, 1); //imagen de fondo
        prepare();
        musica();
    }
      
    private void prepare()//prepara el menú con los objetos necesarios
    {
        addObject(new Start(), 150, 300);
        addObject(new Exit(), 150, 350);
        addObject(new titulo(), 400, 70);
        addObject(Flecha, 50, 300);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if((Greenfoot.isKeyDown("W")) && opcion!=0){opcion++;}//para  arriba y el otro para abajo
        if(Greenfoot.isKeyDown("S") && opcion!=1){opcion--;}
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        Flecha.setLocation(50, 300 + (opcion*50)); //permite mover la fecha
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new Escena1());
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
    private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("sonidito.wav");
        musica.setVolume(25);
        musica.playLoop();
    
    }
}
