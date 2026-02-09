// 第十課：繼承 (Inheritance)
// SavingsAccount 是 BankAccount 的「子類別」(Subclass)
// 它繼承了 BankAccount 所有的屬性和方法

public class SavingsAccount extends BankAccount {
    // 儲蓄帳戶特有的屬性：利息 (年利率)
    private double interestRate;

    // 建構子
    public SavingsAccount(String owner, double balance, double interestRate) {
        // 使用 super() 呼叫父類別 (BankAccount) 的建構子
        // 這是繼承中非常重要的一步！

        // 1. 只能寫在建構子內
        // 2. 必須是建構子，第一句
        // 3. 所繼承之父類建構子有參數，若無super()，則會編譯錯誤
        // 4. 若繼承之父類建構子無參數，則無super()即可，Java會自動呼叫父類別的無參數建構子

        super(owner, balance);
        this.interestRate = interestRate;
    }

    // 儲蓄帳戶特有的功能：結算利息
    public void addInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("計算利息: " + interest + " (利率: " + (interestRate * 100) + "%)");

        // 注意：我們不能直接修改 balance（因為它是 private）
        // 但我們可以使用繼承來的 deposit() 方法！
        deposit(interest);
    }

    // 我們也可以視需要「覆蓋」(Override) 父類別的方法
    // 例如：儲蓄帳戶提款可能要收手續費（這裡先不展示，保持簡單）
}
