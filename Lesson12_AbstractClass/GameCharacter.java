package Lesson12_AbstractClass;

// 抽象類別 (Abstract Class)
// 1. 加上 abstract 關鍵字
// 2. 不能直接被 new (實體化)
// 3. 可以包含「抽象方法」 (沒有內容的方法)
public abstract class GameCharacter {
    protected String name;
    protected int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 一般方法：大家通用的邏輯寫在這裡 (不用每個子類別重寫)
    public void printStatus() {
        System.out.println("角色: " + name + " | HP: " + hp);
    }

    // 抽象方法：只定義「要做什麼」，不定義「怎麼做」
    // 子類別「一定」要實作這個方法
    public abstract void attack();
}
