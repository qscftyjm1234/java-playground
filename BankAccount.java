// 第九課：封裝 (Encapsulation)
// 練習將資料「鎖起來」

// 筆記
// 建構子一定要 new： 因為它是為了「把設計圖變成實體」。
// 不需要 new： 因為它是 static（靜態的）。電腦不用先「蓋出一間銀行」，就能直接找到 
// main
// 進去執行。

public class BankAccount {
    // 1. 使用 private (私有)：這讓外部程式碼「看不到」也「改不到」這個變數
    private String owner;
    private double balance;

    // 建構子
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("警告：初始金額不能為負數，已設為 0");
        }
    }

    // 2. Getter 方法：讓別人可以「讀取」私有資料 (像是一個唯讀的視窗)
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // 3. Setter 方法：讓別人可以「修改」資料，但我們可以在這裡「檢查」
    // (例如：不能把存款改成負數)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " 存入了 " + amount + " 元。");
        } else {
            System.out.println("錯誤：存款金額必須大於 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " 提領了 " + amount + " 元。");
        } else {
            System.out.println("錯誤：餘額不足或提領金額無效！");
        }
    }
}
