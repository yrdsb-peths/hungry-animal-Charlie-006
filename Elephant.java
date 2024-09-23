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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    // Direction the elephant is facing
    String facing = "right";
    
    /**
     * Constructor - THe code that gets run one time when object is created
     */
    
    public Elephant()
    {
        for (int i = 0; i< idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(80, 80);
        }
        for(int i = 0; i< idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(80, 80);
        }
        //Inital elephant image
        setImage(idleRight[0]);
    }
    /**
     * Animate the elephant
     */
    int ImageIndex = 0;
    public void animateElephant()
    {
        if(facing.equals("right"))
        {
            setImage(idleRight[ImageIndex]);
            ImageIndex = (ImageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[ImageIndex]);
            ImageIndex = (ImageIndex + 1) % idleLeft.length;
        }
       
    }
    
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
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
