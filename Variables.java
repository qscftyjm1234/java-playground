// 第二課: 變數和資料型別
// Variables and Data Types

public class Variables {

    public static void main(String[] args) {

        System.out.printIn()

        // ========== 1. 整數 (Integer) ==========
        // int = 整數型別,可以存放整數 (沒有小數點)
        int age = 25;
        int year = 2026;

        System.out.println("我的年齡: " + age);
        System.out.println("現在是: " + year + " 年");

        // ========== 2. 小數 (Double) ==========
        // double = 浮點數型別,可以存放小數
        double price = 99.99;
        double pi = 3.14159;

        System.out.println("價格: $" + price);
        System.out.println("圓周率: " + pi);

        // ========== 3. 文字 (String) ==========
        // String = 字串型別,可以存放文字
        // 注意: String 的 S 要大寫!
        String name = "小明";
        String message = "Hello, Java!";

        System.out.println("名字: " + name);
        System.out.println("訊息: " + message);

        // ========== 4. 布林值 (Boolean) ==========
        // boolean = 布林型別,只有 true 或 false
        boolean isStudent = true;
        boolean isRaining = false;

        System.out.println("是學生嗎? " + isStudent);
        System.out.println("在下雨嗎? " + isRaining);

        // ========== 5. 字元 (Character) ==========
        // char = 字元型別,只能存放一個字元
        // 注意: 用單引號 ' ' 不是雙引號!
        char grade = 'A';
        char symbol = '★';

        System.out.println("成績等級: " + grade);
        System.out.println("符號: " + symbol);

        // ========== 6. 基本運算 ==========
        int num1 = 10;
        int num2 = 3;

        System.out.println("\n--- 數學運算 ---");
        System.out.println("加法: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("減法: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("乘法: " + num1 + " × " + num2 + " = " + (num1 * num2));
        System.out.println("除法: " + num1 + " ÷ " + num2 + " = " + (num1 / num2));
        System.out.println("餘數: " + num1 + " % " + num2 + " = " + (num1 % num2));

        // ========== 7. 變數可以改變 ==========
        int score = 80;
        System.out.println("\n原本的分數: " + score);

        score = 95; // 改變變數的值
        System.out.println("新的分數: " + score);

        // ========== 8. 常數 (不能改變) ==========
        // final = 常數,一旦設定就不能改變
        final double TAX_RATE = 0.05;
        System.out.println("\n稅率: " + TAX_RATE);
        // TAX_RATE = 0.1; // 這行會出錯!因為常數不能改變

    } // main 方法結束

} // Variables 類別結束
