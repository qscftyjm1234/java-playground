// 第三課: 使用者輸入 (加強版 - 有錯誤處理)
// User Input with Scanner (with Error Handling)

import java.util.Scanner; // 匯入 Scanner 類別

public class UserInput {

    public static void main(String[] args) {

        // ========== 1. 創建 Scanner 物件 ==========
        // Scanner = 掃描器,用來讀取使用者輸入
        // System.in = 標準輸入 (鍵盤)
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 歡迎來到互動式程式! ===\n");

        // ========== 2. 讀取字串 ==========
        // 字串可以接受任何輸入,不需要檢查
        System.out.print("請輸入你的名字: ");
        String name = scanner.nextLine(); // 讀取一整行
        System.out.println("你好, " + name + "!");

        // ========== 3. 讀取整數 (有錯誤處理) ==========
        int age = 0;
        boolean validAge = false;

        while (!validAge) {
            System.out.print("\n請輸入你的年齡 (數字): ");

            if (scanner.hasNextInt()) {
                // 檢查是否為整數
                age = scanner.nextInt();
                validAge = true;
                System.out.println("✅ 你今年 " + age + " 歲");
            } else {
                // 不是整數,顯示錯誤
                String wrongInput = scanner.next();
                System.out.println("❌ 錯誤!「" + wrongInput + "」不是數字,請重新輸入");
            }
        }

        // ========== 4. 讀取小數 (有錯誤處理) ==========
        double height = 0;
        boolean validHeight = false;

        while (!validHeight) {
            System.out.print("\n請輸入你的身高 (公分,可以有小數): ");

            if (scanner.hasNextDouble()) {
                // 檢查是否為數字
                height = scanner.nextDouble();
                validHeight = true;
                System.out.println("✅ 你的身高是 " + height + " 公分");
            } else {
                // 不是數字,顯示錯誤
                String wrongInput = scanner.next();
                System.out.println("❌ 錯誤!「" + wrongInput + "」不是數字,請重新輸入");
            }
        }

        // ========== 5. 清除緩衝區 ==========
        // 重要!讀取數字後要清除緩衝區,才能再讀取字串
        scanner.nextLine();

        // ========== 6. 再次讀取字串 ==========
        System.out.print("\n請輸入你最喜歡的顏色: ");
        String color = scanner.nextLine();
        System.out.println("你喜歡 " + color + " 色");

        // ========== 7. 簡單計算 (有錯誤處理) ==========
        System.out.println("\n--- 簡單計算機 ---");

        // 讀取第一個數字
        int num1 = 0;
        boolean validNum1 = false;

        while (!validNum1) {
            System.out.print("請輸入第一個數字: ");

            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                validNum1 = true;
            } else {
                String wrongInput = scanner.next();
                System.out.println("❌ 「" + wrongInput + "」不是數字,請重新輸入");
            }
        }

        // 讀取第二個數字
        int num2 = 0;
        boolean validNum2 = false;

        while (!validNum2) {
            System.out.print("請輸入第二個數字: ");

            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                validNum2 = true;
            } else {
                String wrongInput = scanner.next();
                System.out.println("❌ 「" + wrongInput + "」不是數字,請重新輸入");
            }
        }

        // 計算結果
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("\n結果:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " × " + num2 + " = " + product);

        // ========== 8. 關閉 Scanner ==========
        // 用完要關閉,釋放資源
        scanner.close();

        System.out.println("\n感謝使用!");

    } // main 方法結束

} // UserInput 類別結束
