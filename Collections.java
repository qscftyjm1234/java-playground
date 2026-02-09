import java.util.ArrayList; // 匯入 ArrayList 類別

public class Collections {
    public static void main(String[] args) {
        // ========== 1. 原生陣列 (Array) ==========
        // 特點：使用 {} 宣告，長度固定，一旦建立就不能增減長度
        System.out.println("--- 原生陣列 (Array) ---");

        // 宣告並同時賦值 (JS 是 []，Java 是 {})
        String[] colors = { "紅", "黃", "藍" };

        // 讀取與修改 (跟 JS 一樣)
        System.out.println("第一個顏色: " + colors[0]);
        colors[1] = "綠";

        // 獲取長度 (注意：Java 陣列的長度是屬性 length，不是方法)
        System.out.println("陣列長度: " + colors.length);

        // ⛔ 限制：不能 colors.push("黑")，長度改不了

        // ========== 2. ArrayList (可變長度集合) ==========
        // 特點：最接近 JS 的陣列，可以動態 add, remove
        System.out.println("\n--- ArrayList ---");

        // 語法：ArrayList<型別> 名稱 = new ArrayList<>();
        ArrayList<String> friends = new ArrayList<>();

        // 新增元素 (JS 是 .push()，Java 是 .add())
        friends.add("小明");
        friends.add("小華");
        friends.add("小強");
        System.out.println("好友列表: " + friends);

        // 取得長度 (ArrayList 用 .size() 方法)
        System.out.println("好友數量: " + friends.size());

        // 讀取特定位置 (使用 .get(index))
        System.out.println("第一個好友: " + friends.get(0));

        // 刪除元素
        friends.remove("小強"); // 直接打名字刪除
        friends.remove(0); // 或是打索引刪除
        System.out.println("刪除後的列表: " + friends);

        // 檢查是否包含某個東西
        if (friends.contains("小華")) {
            System.out.println("清單裡有小華");
        }

        // ========== 3. 遍歷 (跟上一課一樣的 for-each) ==========
        System.out.println("\n--- 遍歷 ArrayList ---");
        for (String name : friends) {
            System.out.println("名字: " + name);
        }
    }
}
