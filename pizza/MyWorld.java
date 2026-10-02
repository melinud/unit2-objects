import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void prepare(){
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 300);
        
        Topping topping1 = new Topping("Cheese");
        addObject(topping1, 100, 50);
        
        Topping topping2 = new Topping("Mushrooms");
        addObject(topping2, 300, 100);
        
        Topping topping3 = new Topping("BellPeppers");
        addObject(topping3, 500, 150);
    }
}
