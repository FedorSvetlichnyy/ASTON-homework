package aston.homework;

import aston.homework.Enemys.Enemy;
import aston.homework.Enemys.Zombie;
import aston.homework.Heros.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин", 100); //Создаем героя Воин
        Enemy enemy = new Enemy(100); // Создаем Врага

        warrior.attackEnemy(enemy);
        enemy.isAlive();

        enemy.attackHero(warrior);
        warrior.isAlive();

        Zombie zombie = new Zombie(100); //Создаем Зомби
        warrior.attackEnemy(zombie);
        zombie.isAlive();

        zombie.attackHero(warrior);
        warrior.isAlive();
    }
}
