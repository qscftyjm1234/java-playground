// 示範: String 必須大寫

public class StringTest {

    public static void main(String[] args) {

        // ✅ 正確寫法
        String name = "小狗";
        System.out.println("正確: " + name);

        // ❌ 錯誤寫法 (這行會編譯失敗,所以我註解掉)
        // string wrongName = "小貓"; // 編譯錯誤!

        // String 是類別,所以:
        // 1. 必須大寫 S
        // 2. 有很多方法可以用
        System.out.println("長度: " + name.length());
        System.out.println("大寫: " + name.toUpperCase());

    }
}
