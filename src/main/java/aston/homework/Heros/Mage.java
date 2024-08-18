package aston.homework.Heros;

import aston.homework.Enemys.Enemy;

public class Mage extends Hero {
    private final int DAMAGE = 2;
    private int health;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг атакует");
        enemy.takeDamage(DAMAGE);
        System.out.println(enemy.getHealth());
    }

    @Override
    public boolean isAlive() {
        if (super.getHealth() < 1) {
            System.out.println("Маг убит.");
            return false;
        }
        System.out.println("Маг еще жив.");
        return true;
    }
}
