// 第十課：繼承測試
public class InheritanceDemo {
    public static void main(String[] args) {
        // 建立一個儲蓄帳戶，年利率 2% (0.02)
        SavingsAccount mySavings = new SavingsAccount("老王", 10000, 0.02);

        // 1. 測試繼承來的方法
        System.out.println("帳戶持有人: " + mySavings.getOwner());
        System.out.println("初始餘額: " + mySavings.getBalance());

        // 2. 使用繼承來的存款功能
        mySavings.deposit(2000);

        // 3. 測試儲蓄帳戶特有的「結算利息」功能
        System.out.println("\n--- 年終結算利息 ---");
        mySavings.addInterest();

        // 4. 確認最終餘額
        System.out.println("\n最終帳戶餘額: " + mySavings.getBalance());

        // 5. 測試繼承來的提款功能
        mySavings.withdraw(5000);
        System.out.println("提款後餘額: " + mySavings.getBalance());
    }
}
