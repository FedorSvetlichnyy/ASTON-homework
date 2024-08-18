package aston.homework.Enemys;

import aston.homework.Heros.Hero;
import aston.homework.Mortal;

public class Enemy implements Mortal {
    private int health;
    private final int DAMAGE = 4;

    public int getHealth() {
        return health;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        return health = health - damage;
    }

    public void attackHero(Hero hero){
        System.out.println("Враг атакует");
        hero.takeDamage(DAMAGE);
        System.out.println(hero.getHealth());
    }

    @Override
    public boolean isAlive() {
        if (health < 1) {
            System.out.println("Враг убит.");
            return false;
        }
        System.out.println("Враг еще жив.");
        return true;
    }
}
