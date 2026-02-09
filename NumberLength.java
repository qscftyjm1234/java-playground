// 示範: int vs Integer vs String

public class NumberLength {

    public static void main(String[] args) {

        // ========== 1. int 基本型別 ==========
        int number = 12345;
        System.out.println("數字: " + number);
        // number.length(); // ❌ 錯誤!int 沒有 length() 方法

        // ========== 2. 轉成 String 來取長度 ==========
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        System.out.println("數字有 " + length + " 位數");

        // ========== 3. 使用 Integer 包裝類別 ==========
        Integer numberObj = 12345;
        System.out.println("Integer 物件: " + numberObj);

        // Integer 可以用一些方法
        String str = numberObj.toString(); // 轉成字串
        System.out.println("轉成字串: " + str);
        System.out.println("字串長度: " + str.length());

        // ========== 4. 比較三者的差異 ==========
        System.out.println("\n--- 比較 ---");

        // int: 只是數字
        int a = 100;
        System.out.println("int: " + a);
        System.out.println("int 佔用記憶體: 4 bytes");

        // Integer: 是物件
        Integer b = 100;
        System.out.println("Integer: " + b);
        System.out.println("Integer 可以用方法: " + b.toString());

        // String: 是文字
        String c = "100";
        System.out.println("String: " + c);
        System.out.println("String 長度: " + c.length());

        // ========== 5. 實用範例:判斷數字有幾位數 ==========
        System.out.println("\n--- 判斷數字位數 ---");

        int[] numbers = { 5, 42, 999, 1234, 56789 };

        for (int num : numbers) {
            int digits = String.valueOf(num).length();
            System.out.println(num + " 有 " + digits + " 位數");
        }

        // ========== 6. 為什麼 int 不是類別? ==========
        System.out.println("\n--- 效能比較 ---");

        // int 運算超快
        long startTime = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum1 += i;
        }
        long endTime = System.nanoTime();
        System.out.println("int 運算時間: " + (endTime - startTime) + " 奈秒");

        // Integer 運算較慢(因為是物件)
        startTime = System.nanoTime();
        Integer sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 += i; // 自動裝箱/拆箱,較慢
        }
        endTime = System.nanoTime();
        System.out.println("Integer 運算時間: " + (endTime - startTime) + " 奈秒");

    }
}
