package aston.homework.Heros;

import aston.homework.Enemys.Enemy;

public class Archer extends Hero {
    private final int DAMAGE = 1;
    private int health;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник атакует");
        enemy.takeDamage(DAMAGE);
        System.out.println(enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        if (super.getHealth() < 1) {
            System.out.println("Лучник убит.");
            return false;
        }
        System.out.println("Лучник еще жив.");
        return true;
    }
}
