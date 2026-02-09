// 第九課：封裝解說與測試

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("小明", 1000);

        // --- 1. 嘗試非法存取 ---
        // System.out.println(myAccount.balance);
        // ❌ 如果取消上面的註解，會發生編譯錯誤，因為 balance 是 private！

        // --- 2. 正確讀取資料 ---
        System.out.println("帳戶持有人: " + myAccount.getOwner());
        System.out.println("目前餘額: " + myAccount.getBalance());

        // --- 3. 測試存取邏輯 (封裝的好處) ---
        System.out.println("\n--- 進行交易 ---");

        // 存款測試
        myAccount.deposit(500);
        myAccount.deposit(-100); // 這裡會被內部邏輯擋掉

        // 提款測試
        myAccount.withdraw(2000); // 餘額不足，會被擋掉
        myAccount.withdraw(300);

        System.out.println("\n最終餘額: " + myAccount.getBalance());
    }
}
