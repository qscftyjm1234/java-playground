public class Methods {

    // 這是我們熟悉的主方法，也是程式的進入點
    public static void main(String[] args) {
        System.out.println("=== Java 方法 (Method) 學習 ===\n");

        // 1. 呼叫一個簡單的方法
        sayHello();

        // 2. 呼叫帶有參數的方法
        greet("小明");

        // 3. 呼叫帶有回傳值的方法
        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);

        // 4. 方法多載 (Overloading) 展示
        // 同樣的名字，但參數不同，Java 會自動判斷要跑哪一個
        System.out.println("整數相加: " + sum(5, 5));
        System.out.println("三個整數相加: " + sum(5, 5, 5));
        System.out.println("小數相加: " + sum(2.5, 3.5));
    }

    // --- 方法定義區 ---

    // 1. 基本方法：不回傳東西用 void
    public static void sayHello() {
        System.out.println("你好！歡迎學習 Java 方法。");
    }

    // 2. 帶參數的方法：必須指定參數型別
    public static void greet(String name) {
        System.out.println("哈囉，" + name + "！");
    }

    // 3. 帶回傳值的方法：把 void 改成你要回傳的型別 (例如 int)
    public static int add(int a, int b) {
        return a + b;
    }

    // 4. 方法多載 (Method Overloading)
    // 雖然都叫 sum，但參數個數或型別不同
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
