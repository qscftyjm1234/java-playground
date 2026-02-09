// 示範: String 可以存單一字元

public class SingleChar {

    public static void main(String[] args) {

        // ========== String 存單一字元 ==========
        String dog = "狗";
        System.out.println("String 存一個字: " + dog);
        System.out.println("長度: " + dog.length()); // 1

        // ========== char 存單一字元 ==========
        char dogChar = '狗';
        System.out.println("\nchar 存一個字: " + dogChar);
        // dogChar.length(); // ❌ char 沒有 length() 方法

        // ========== 兩者比較 ==========
        System.out.println("\n--- 比較 ---");
        System.out.println("String: " + dog + " (可以用方法)");
        System.out.println("char: " + dogChar + " (不能用方法)");

        // ========== String 的彈性 ==========
        System.out.println("\n--- String 的彈性 ---");
        String animal = "狗"; // 一個字
        System.out.println("1個字: " + animal);

        animal = "小狗"; // 變成兩個字
        System.out.println("2個字: " + animal);

        animal = "我家的小狗"; // 變成更多字
        System.out.println("多個字: " + animal);

        // char 不能這樣變化
        char c = '狗';
        // c = '小狗'; // ❌ 錯誤!char 只能一個字元

        // ========== 實用建議 ==========
        System.out.println("\n--- 建議 ---");
        System.out.println("如果確定永遠只有一個字 → 用 char");
        System.out.println("如果可能會變化 → 用 String");
        System.out.println("如果需要用方法 → 用 String");

    }
}
