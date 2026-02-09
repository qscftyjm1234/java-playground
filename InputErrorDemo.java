// 示範: 輸入錯誤型別會發生什麼

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputErrorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 測試輸入錯誤 ===\n");

        // ========== 1. 沒有錯誤處理 (會崩潰) ==========
        System.out.println("--- 情況 1: 沒有錯誤處理 ---");
        System.out.print("請輸入你的年齡 (數字): ");

        try {
            int age = scanner.nextInt(); // 如果輸入中文會怎樣?
            System.out.println("你的年齡: " + age);
        } catch (InputMismatchException e) {
            System.out.println("❌ 錯誤!你輸入的不是數字!");
            System.out.println("錯誤訊息: " + e.getMessage());
            scanner.nextLine(); // 清除錯誤輸入
        }

        // ========== 2. 有錯誤處理 (不會崩潰) ==========
        System.out.println("\n--- 情況 2: 有錯誤處理 ---");

        int validAge = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("請輸入你的年齡 (數字): ");

            if (scanner.hasNextInt()) {
                // 檢查是否為整數
                validAge = scanner.nextInt();
                isValid = true;
                System.out.println("✅ 正確!你的年齡: " + validAge);
            } else {
                // 不是整數
                String wrongInput = scanner.next();
                System.out.println("❌ 錯誤!「" + wrongInput + "」不是數字,請重新輸入");
            }
        }

        scanner.close();

        // ========== 3. 說明 ==========
        System.out.println("\n=== 總結 ===");
        System.out.println("如果輸入中文或其他非數字:");
        System.out.println("1. 沒處理 → 程式崩潰 (InputMismatchException)");
        System.out.println("2. 有處理 → 顯示錯誤訊息,要求重新輸入");
    }
}
