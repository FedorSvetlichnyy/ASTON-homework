package aston.homework;

import aston.homework.Enemys.Enemy;
import aston.homework.Heros.Archer;
import aston.homework.Heros.Mage;
import aston.homework.Heros.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        //Hero hero = new Hero("Hero");
        //hero.attackEnemy();

        Archer archer = new Archer("Лучник", 100);
        Mage mage = new Mage("Маг", 100);
        Warrior warrior = new Warrior("Воин", 100);
        Enemy enemy = new Enemy(100);

        archer.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        warrior.attackEnemy(enemy);

        enemy.isAlive();
    }
}