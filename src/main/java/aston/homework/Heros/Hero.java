package aston.homework.Heros;

import aston.homework.Enemys.Enemy;
import aston.homework.Mortal;

public abstract class Hero implements Mortal {
    private String name;

    private int health;

    public Hero(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(int damage) {
        return health = health - damage;
    }

    public abstract void attackEnemy(Enemy enemy);

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
