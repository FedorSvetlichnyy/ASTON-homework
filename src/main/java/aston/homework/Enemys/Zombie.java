package aston.homework.Enemys;

import aston.homework.Heros.Hero;

public class Zombie extends Enemy {
    private final int DAMAGE = 5;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби атакует");
        hero.takeDamage(DAMAGE);
        System.out.println(hero.getHealth());
    }

    @Override
    public boolean isAlive() {
        if (super.getHealth() < 1) {
            System.out.println("Зомби убит, но он воскрес!");
            super.setHealth(100);
            return true;
        }
        System.out.println("Зомби еще жив.");
        return true;
    }
}
