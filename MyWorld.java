import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Charlie
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        //Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        //Create a label
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 30, 30);
        
        createApple();
    }
    
    
    /**
     * End the game and draw 'GameOver'
     */
    
    public void GameOver()
    {
        Label gameOverLabel= new Label("GameOver", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    /**
     * Increase score
     */
    public void IncreaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
}
