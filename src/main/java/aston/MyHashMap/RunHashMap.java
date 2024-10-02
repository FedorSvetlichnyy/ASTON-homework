package aston.MyHashMap;

public class RunHashMap {
    public static void main(String[] args){
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
        System.out.println("Собираюсь добавить записи в Мапу");
        map.put(null, "Ничего");
        map.put(1, "Дом");
        map.put(2, "Вася");
        System.out.println("Отображение всех записей в Мапе");
        map.display();
        System.out.println("Удаление записи с ключем 2");
        map.remove(2);
        map.display();
        System.out.println("Добавление дубликата ключа 1 в Мапу");
        map.put(1, "Зведа");
        map.put(2, "Снова Вася");
        System.out.println("Повторное отображение всех записей в Мапе");
        map.display();
        System.out.println("Добавление записи с ключом 17 в Мапу");
        map.put(17, "Игра");
        map.display();
    }
}
