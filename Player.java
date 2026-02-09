// 第八課：類別 (Class) 定義
// 想像這是一張「玩家」的設計圖

public class Player {

    // 1. 屬性 (Fields / Attributes)
    // 這些是物件擁有的「資料」
    String name;
    int level;
    int health;

    // 2. 建構子 (Constructor)
    // 當你使用 `new Player(...)` 時，這段程式會跑起來。
    // 名字必須跟類別一模一樣，且沒有回傳型別。
    public Player(String name) {
        this.name = name; // 將傳進來的名字交給屬性的 name
        this.level = 1; // 新玩家預設等級 1
        this.health = 100; // 新玩家預設血量 100
        System.out.println("玩家 [" + name + "] 已誕生！");
    }

    // 3. 行為 (Methods)
    // 這些是物件可以「做的事情」

    public void attack() {
        System.out.println(name + " 發動了攻擊！💥");
    }

    public void levelUp() {
        level++;
        health += 20;
        System.out.println("🎊 恭喜！" + name + " 升到了第 " + level + " 級！血量上限增加到 " + health);
    }

    public void showStatus() {
        System.out.println("----------");
        System.out.println("玩家名稱: " + name);
        System.out.println("目前等級: " + level);
        System.out.println("剩餘血量: " + health);
        System.out.println("----------");
    }
}
