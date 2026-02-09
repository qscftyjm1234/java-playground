// 第五課: 迴圈 (Loops)
// for, while, do-while

public class Loops {

    public static void main(String[] args) {

        System.out.println("=== 迴圈 ===\n");

        // ========== 1. for 迴圈 ==========
        System.out.println("--- for 迴圈 ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("第 " + i + " 次");
        }

        // ========== 2. while 迴圈 ==========
        System.out.println("\n--- while 迴圈 ---");
        int count = 1;
        while (count <= 5) {
            System.out.println("計數: " + count);
            count++;
        }

        // ========== 3. do-while 迴圈 ==========
        System.out.println("\n--- do-while 迴圈 ---");
        int num = 1;
        do {
            System.out.println("數字: " + num);
            num++;
        } while (num <= 5);

        // ========== 4. 陣列遍歷 ==========
        System.out.println("\n--- 陣列遍歷 ---");
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("索引 " + i + ": " + numbers[i]);
        }

        // ========== 5. for-each 迴圈 ==========
        System.out.println("\n--- for-each 迴圈 ---");
        String[] fruits = { "蘋果", "香蕉", "橘子" };

        for (String fruit : fruits) {
            System.out.println("水果: " + fruit);
        }

        // ========== 6. break (跳出迴圈) ==========
        System.out.println("\n--- break ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("遇到 5,跳出!");
                break;
            }
            System.out.println(i);
        }

        // ========== 7. continue (跳過本次) ==========
        System.out.println("\n--- continue ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("跳過 3");
                continue;
            }
            System.out.println(i);
        }

        // ========== 8. 巢狀迴圈 ==========
        System.out.println("\n--- 巢狀迴圈 (九九乘法表) ---");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "×" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        // ========== 9. 實用範例 ==========
        System.out.println("\n--- 實用範例 ---");

        // 計算總和
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1 到 10 的總和: " + sum);

        // 找最大值
        int[] scores = { 85, 92, 78, 95, 88 };
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("最高分: " + max);

        // 倒數計時
        System.out.println("\n倒數計時:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("發射! 🚀");

    } // main 方法結束

} // Loops 類別結束
