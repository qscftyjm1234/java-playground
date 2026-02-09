// 第八課：物件 (Object) 實體化
// 這裡是用來「執行」程式的地方

public class OOPDemo {
    public static void main(String[] args) {

        System.out.println("=== 歡迎來到 Java OOP 世界 ===\n");

        // 1. 創建物件 (從設計圖變成實體)
        // 格式：類別名稱 物件名稱 = new 類別名稱(參數);
        Player p1 = new Player("小明");
        Player p2 = new Player("大華");

        // 2. 存取屬性與呼叫方法
        p1.showStatus();
        p2.showStatus();

        // 3. 讓他們動起來
        System.out.println("\n--- 遊戲開始 ---");
        p1.attack();
        p2.attack();

        // 4. 修改物件狀態
        p1.levelUp();

        // 5. 再次查看狀態 (可以看到 p1 變強了，但 p2 還是原本的樣子)
        p1.showStatus();
        p2.showStatus();

        System.out.println("\n結論：p1 與 p2 是兩個獨立的「物件」，擁有各自的資料。");
    }
}
