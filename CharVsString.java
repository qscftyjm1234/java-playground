// 示範: char 單引號 vs String 雙引號

public class CharVsString {

    public static void main(String[] args) {

        // ========== char 必須用單引號 ' ' ==========
        char letter = 'A'; // ✅ 正確!單引號
        char symbol = '★'; // ✅ 正確!單引號
        char number = '5'; // ✅ 正確!單引號(這是字元,不是數字)

        System.out.println("char 用單引號:");
        System.out.println("字母: " + letter);
        System.out.println("符號: " + symbol);
        System.out.println("字元: " + number);

        // ========== String 必須用雙引號 " " ==========
        String text = "A"; // ✅ 正確!雙引號
        String word = "Hello"; // ✅ 正確!雙引號
        String sentence = "你好世界"; // ✅ 正確!雙引號

        System.out.println("\nString 用雙引號:");
        System.out.println("文字: " + text);
        System.out.println("單字: " + word);
        System.out.println("句子: " + sentence);

        // ========== 錯誤示範 (已註解) ==========
        // char wrong1 = "A"; // ❌ 錯誤!char 不能用雙引號
        // String wrong2 = 'A'; // ❌ 錯誤!String 不能用單引號

        // ========== 關鍵差異 ==========
        System.out.println("\n--- 關鍵差異 ---");

        // char 只能存「一個」字元
        char single = 'X';
        System.out.println("char 只能一個字元: " + single);
        // char tooMany = 'XY'; // ❌ 錯誤!超過一個字元

        // String 可以存「多個」字元
        String multiple = "XY";
        System.out.println("String 可以多個字元: " + multiple);

        String empty = ""; // ✅ String 可以是空的
        System.out.println("String 可以空字串: '" + empty + "'");
        // char cannotEmpty = ''; // ❌ char 不能是空的

        // ========== 實用比較 ==========
        System.out.println("\n--- 實用比較 ---");

        // 一個字元 vs 一個字的字串
        char charA = 'A'; // 單引號,一個字元
        String stringA = "A"; // 雙引號,一個字的字串

        System.out.println("char 'A': " + charA);
        System.out.println("String \"A\": " + stringA);
        System.out.println("看起來一樣,但型別不同!");

        // ========== 轉換 ==========
        System.out.println("\n--- 轉換 ---");

        // char 轉 String
        char c = 'B';
        String s1 = String.valueOf(c);
        String s2 = Character.toString(c);
        System.out.println("char 轉 String: " + s1);

        // String 轉 char (取第一個字元)
        String str = "Hello";
        char firstChar = str.charAt(0);
        System.out.println("String 的第一個字元: " + firstChar);

    }
}
