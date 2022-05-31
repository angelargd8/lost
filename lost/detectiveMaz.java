import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class detectiveMaz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class detectiveMaz extends Actor
{
    /**
     * Act - do whatever the detectiveMaz wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int detectiveMove = 3;
    boolean zapato;
    boolean llave;
    
    
    public detectiveMaz(){
        getImage().scale(18,18);
        this.llave = false;
        this.zapato = false;
    }
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            if(!revisarParedes('l') && !revisarOtrasParedes('l')&&!revisarParedHorzontal('l')){
                setLocation(getX()-detectiveMove, getY());
            }
        }
        if (Greenfoot.isKeyDown("right")){
            if(!revisarParedes('r') && !revisarOtrasParedes('r')&&!revisarParedHorzontal('r')){
                setLocation(getX()+detectiveMove, getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
            if(!revisarParedes('u') && !revisarOtrasParedes('u')&&!revisarParedHorzontal('u')){
                setLocation(getX(), getY()-detectiveMove);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            if(!revisarParedes('d') && !revisarOtrasParedes('d')&&!revisarParedHorzontal('d')){
                setLocation(getX(), getY()+detectiveMove);
            }
        }
        
        shoe s = (shoe) getOneIntersectingObject(shoe.class);
        key k = (key) getOneIntersectingObject(key.class);
        OsoMaze os = (OsoMaze) getOneIntersectingObject(OsoMaze.class);
        nextLe nl = (nextLe) getOneIntersectingObject(nextLe.class);
        
        if(s != null){
            getWorld().removeObject(s);
            this.zapato = true;
        }
        else if(k != null){
            getWorld().removeObject(k);
            this.llave = true;
        }
        if((this.llave == true)&&(this.zapato == true)){
            getWorld().removeObject(maze.w1);
        }
        //if((s!=null)&&(k!=null)){
        //    getWorld().removeObject(maze.w1);
        //}
        if (os != null){
            getWorld().removeObject(os);
            getWorld().removeObject(maze.w2);
            getWorld().addObject(maze.nl,10,10);
        }
        else if (nl != null){
            //Aqui se pone para ir al siguiente mundo
            //Greenfoot.setWorld(new siguiente_pantalla());
        }
    }
    
    public boolean revisarParedHorzontal(char dir){
        WallHor wh = null;
        if (dir == 'l'){
            wh = (WallHor) getOneObjectAtOffset(-detectiveMove,0,WallHor.class);
        }
        if (dir == 'r'){
            wh = (WallHor) getOneObjectAtOffset(detectiveMove,0,WallHor.class);
        }
        if (dir == 'u'){
            wh = (WallHor) getOneObjectAtOffset(0,-detectiveMove,WallHor.class);
        }
        if (dir == 'd'){
            wh = (WallHor) getOneObjectAtOffset(0,detectiveMove,WallHor.class);
        }
        if (wh != null){
            return true;
        }
        return false;
    }
    
    public boolean revisarParedes(char dir){
        Color c = null;
        
        if(dir == 'l'){
            c = getWorld().getBackground().getColorAt(getX()-detectiveMove, getY());
        }
        if(dir == 'r'){
            c = getWorld().getBackground().getColorAt(getX()+detectiveMove, getY());
        }
        if(dir == 'u'){
            c = getWorld().getBackground().getColorAt(getX(), getY()-detectiveMove);
        }
        if(dir == 'd'){
            c = getWorld().getBackground().getColorAt(getX(), getY()+detectiveMove);
        }
        
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        
        if((r<30)&&(g<30)&&(b<30)){
            return true;
        }
        
        return false;
    }
    
    public boolean revisarOtrasParedes(char dir){
        wall w = null;
        if (dir == 'l'){
            w = (wall) getOneObjectAtOffset(-detectiveMove,0,wall.class);
        }
        if (dir == 'r'){
            w = (wall) getOneObjectAtOffset(detectiveMove,0,wall.class);
        }
        if (dir == 'u'){
            w = (wall) getOneObjectAtOffset(0,-detectiveMove,wall.class);
        }
        if (dir == 'd'){
            w = (wall) getOneObjectAtOffset(0,detectiveMove,wall.class);
        }
        if (w != null){
            return true;
        }
        return false;
    }
}
