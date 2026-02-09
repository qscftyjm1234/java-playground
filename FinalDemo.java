// 示範: Java final vs JavaScript const

public class FinalDemo {

    public static void main(String[] args) {

        System.out.println("=== Java final (類似 JS const) ===\n");

        // ========== 1. 基本用法 ==========
        final double PI = 3.14159;
        final int MAX_USERS = 100;
        final String APP_NAME = "MyApp";

        System.out.println("圓周率: " + PI);
        System.out.println("最大使用者數: " + MAX_USERS);
        System.out.println("應用程式名稱: " + APP_NAME);

        // ========== 2. 不能改變 ==========
        // PI = 3.14; // ❌ 錯誤!編譯失敗
        System.out.println("\n✅ final 變數不能重新賦值");

        // ========== 3. 必須初始化 ==========
        // final int VALUE; // ❌ 錯誤!必須初始化
        final int VALUE = 10;
        System.out.println("✅ final 變數必須初始化: " + VALUE);

        // ========== 4. 陣列/物件的內容可以改 ==========
        System.out.println("\n--- 陣列內容可以改 ---");
        final int[] numbers = { 1, 2, 3 };
        System.out.println("原本: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        numbers[0] = 10; // ✅ 可以!改內容
        System.out.println("修改後: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        // numbers = new int[]{4, 5, 6}; // ❌ 錯誤!不能重新賦值
        System.out.println("✅ 內容可以改,但不能重新賦值整個陣列");

        // ========== 5. 和 JavaScript const 比較 ==========
        System.out.println("\n--- 和 JavaScript const 比較 ---");
        System.out.println("Java:       final double TAX_RATE = 0.05;");
        System.out.println("JavaScript: const taxRate = 0.05;");
        System.out.println("概念完全一樣!");

        // ========== 6. 普通變數 vs final ==========
        System.out.println("\n--- 普通變數 vs final ---");

        int normalVar = 10;
        System.out.println("普通變數: " + normalVar);
        normalVar = 20; // ✅ 可以改
        System.out.println("改變後: " + normalVar);

        final int CONSTANT = 10;
        System.out.println("final 常數: " + CONSTANT);
        // CONSTANT = 20; // ❌ 不能改
        System.out.println("final 不能改變");

        // ========== 7. 命名慣例 ==========
        System.out.println("\n--- 命名慣例 ---");
        System.out.println("Java final: 全大寫 + 底線");
        System.out.println("例如: TAX_RATE, MAX_VALUE, PI");

    }
}
