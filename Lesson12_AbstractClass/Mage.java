package Lesson12_AbstractClass;

public class Mage extends GameCharacter {

    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        // 實作抽象方法
        System.out.println(name + " 詠唱咒語... 發射大火球！ (魔法攻擊)");
    }
}
