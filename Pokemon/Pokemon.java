import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor
{
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon(int hp, int ap, String name, String attack, String type){
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.attack = new Attack(attack);
        this.img = new GreenfootImage(name+".png");
        this.type = type;
        this.outStatus = false;
    }
    
    public String getType(){
        return type;
    }
    public void attack(String attackName, User enemy){
        int power = getAttackPower(attackName, enemy);
        if (ap > 0 && !outStatus && enemy.getPokemon() != null){
            enemy.getPokemon().takeDamage(power);
            ap--;
        }
    }
    public void takeDamage(int amount){
        this.hp=this.hp - amount;
        if (hp <= 0){
            hp = 0;
            outStatus = true;
        }
    }
    public void heal(){
        hp += 20;
        outStatus = false;
    }
    public void printAttack(){
        System.out.println(attack.getName());
    }
    public int getAttackPower(String attackName, User enemy){
        if (attack.getName().equalsIgnoreCase(attackName)){
            return attack.getPower();
        }
        return 0;
    }
    public int getHp(){
        return hp;
    }
    public int getAp(){
        return ap;
    }
    public String getName(){
        return name;
    }
    public boolean isOut(){
        return outStatus;
    }
    public Attack getAttack(){
        return attack;
    }
    
}
