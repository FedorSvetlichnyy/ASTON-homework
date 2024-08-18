package aston.homework.Heros;

import aston.homework.Enemys.Enemy;

public class Warrior extends Hero {
    private final int DAMAGE = 3;
    private int health;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин атакует");
        enemy.takeDamage(DAMAGE);
        System.out.println(enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        if (super.getHealth() < 1) {
            System.out.println("Воин убит.");
            return false;
        }
        System.out.println("Воин еще жив.");
        return true;
    }
}
