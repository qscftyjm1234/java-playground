package Lesson12_AbstractClass;

public class Warrior extends GameCharacter {

    public Warrior(String name, int hp) {
        super(name, hp); // 呼叫父類別 (Abstract Class) 的建構子
    }

    @Override
    public void attack() {
        // 實作抽象方法
        System.out.println(name + " 拔出巨劍，向前猛砍！ (物理攻擊)");
    }
}
