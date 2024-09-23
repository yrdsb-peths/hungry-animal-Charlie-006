import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero 
 * 
 * @author Charlie 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant-trumpets-growls-6047.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    /**
     * Constructor - THe code that gets run one time when object is created
     */
    
    public Elephant()
    {
        for (int i = 0; i< idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i);
        }
        setImage(idle[0]);
    }
    /**
     * Animate the elephant
     */
    int ImageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[ImageIndex]);
        ImageIndex = (ImageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        eat();
        
        //Animate the elephant 
        animateElephant();
    }
    
    public void eat()
    {
        //Remove apple if elephant eats it
        if(isTouching(Apple.class))
        {
           removeTouching(Apple.class);
           MyWorld world = (MyWorld) getWorld();
           world.createApple();
           world.IncreaseScore();
           elephantSound.play();
        }
        
    }
}
