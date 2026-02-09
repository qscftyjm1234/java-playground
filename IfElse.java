// 第四課: 條件判斷 (if-else)
// Conditional Statements

public class IfElse {

    public static void main(String[] args) {

        System.out.println("=== 條件判斷 ===\n");

        // ========== 1. 基本 if ==========
        int age = 20;

        if (age >= 18) {
            System.out.println("你已成年");
        }

        // ========== 2. if-else ==========
        int score = 85;

        if (score >= 60) {
            System.out.println("及格!");
        } else {
            System.out.println("不及格");
        }

        // ========== 3. if-else if-else ==========
        int grade = 75;

        if (grade >= 90) {
            System.out.println("成績: A");
        } else if (grade >= 80) {
            System.out.println("成績: B");
        } else if (grade >= 70) {
            System.out.println("成績: C");
        } else if (grade >= 60) {
            System.out.println("成績: D");
        } else {
            System.out.println("成績: F");
        }

        // ========== 4. 比較運算子 ==========
        System.out.println("\n--- 比較運算子 ---");
        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b)); // 等於
        System.out.println("a != b: " + (a != b)); // 不等於
        System.out.println("a > b: " + (a > b)); // 大於
        System.out.println("a < b: " + (a < b)); // 小於
        System.out.println("a >= b: " + (a >= b)); // 大於等於
        System.out.println("a <= b: " + (a <= b)); // 小於等於

        // ========== 5. 邏輯運算子 ==========
        System.out.println("\n--- 邏輯運算子 ---");
        boolean hasTicket = true;
        boolean hasID = true;

        // && = AND (且)
        if (hasTicket && hasID) {
            System.out.println("可以入場");
        }

        // || = OR (或)
        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("可以休息");
        }

        // ! = NOT (非)
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("不下雨,可以出門");
        }

        // ========== 6. 巢狀 if ==========
        System.out.println("\n--- 巢狀 if ---");
        int money = 100;
        boolean hasCard = true;

        if (money >= 50) {
            if (hasCard) {
                System.out.println("可以刷卡購買");
            } else {
                System.out.println("可以付現購買");
            }
        } else {
            System.out.println("錢不夠");
        }

        // ========== 7. 三元運算子 ==========
        System.out.println("\n--- 三元運算子 ---");
        int num = 15;
        String result = (num % 2 == 0) ? "偶數" : "奇數";
        System.out.println(num + " 是 " + result);

        // ========== 8. 實用範例 ==========
        System.out.println("\n--- 實用範例 ---");

        // 判斷成績等級
        int testScore = 88;
        String level;

        if (testScore >= 90) {
            level = "優秀";
        } else if (testScore >= 80) {
            level = "良好";
        } else if (testScore >= 70) {
            level = "普通";
        } else if (testScore >= 60) {
            level = "及格";
        } else {
            level = "不及格";
        }

        System.out.println("分數 " + testScore + " 的等級: " + level);

        // 判斷年齡階段
        int userAge = 25;

        if (userAge < 13) {
            System.out.println("兒童");
        } else if (userAge < 18) {
            System.out.println("青少年");
        } else if (userAge < 60) {
            System.out.println("成年人");
        } else {
            System.out.println("老年人");
        }

    } // main 方法結束

} // IfElse 類別結束
