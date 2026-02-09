package Lesson12_AbstractClass;

public class GameDemo {
    public static void main(String[] args) {
        // GameCharacter npc = new GameCharacter("NPC", 100);
        // 錯誤！抽象類別不能 new，因為它是不完整的設計圖

        // 多型：用「父類別」的型態，裝「子類別」的物件
        GameCharacter hero1 = new Warrior("亞瑟", 150);
        GameCharacter hero2 = new Mage("梅林", 80);

        // 呼叫這兩個物件的方法
        // printStatus 是父類別寫好的，大家都有
        hero1.printStatus();
        hero1.attack(); // 雖然宣告是 GameCharacter，但執行的是 Warrior 的 attack

        System.out.println("-------------------");

        hero2.printStatus();
        hero2.attack(); // 執行的是 Mage 的 attack
    }
}
