# 🎓 第十課：繼承 (Inheritance)

在物件導向程式設計（OOP）中，**繼承** 是最重要的核心概念之一。它讓你可以建立一個新類別，並「繼承」現有類別的所有屬性與方法，而不需要重新撰寫重複的程式碼。

---

## 🏚️ 比喻：一般帳戶 vs 儲蓄帳戶

想像你在開發銀行的系統：

1. **銀行帳戶 (Parent/Base Class)**：具備基本的「持有人」和「餘額」屬性，以及「存款」和「提款」方法。
2. **儲蓄帳戶 (Child/Subclass)**：除了具備銀行帳戶的所有功能外，可能還有「利息」屬性，以及「計算利息」的方法。

**繼承** 讓我們可以說：「儲蓄帳戶 **是一種 (is-a)** 銀行帳戶，但它多了一些功能。」

---

## 🔍 語法：`extends`

使用 `extends` 關鍵字來建立繼承關係：

```java
// SavingsAccount 繼承了 BankAccount
public class SavingsAccount extends BankAccount {
    // 這裡只需要寫「儲蓄帳戶特有」的東西
}
```

---

## 🔑 關鍵字：`super`

當子類別繼承父類別時，我們常常需要用到 `super`：

### 1. `super()` 呼叫父類別建構子

子類別在建立物件時，**必須先初始化父類別的部分**。

```java
public SavingsAccount(String owner, double balance, double interestRate) {
    super(owner, balance); // 呼叫父類別 BankAccount 的建構子
    this.interestRate = interestRate;
}
```

### 2. `super` 呼叫父類別方法

如果你想在子類別中執行父類別原本的功能，也可以使用 `super.methodName()`。

---

## 📋 學習重點

1.  **程式碼重用**：不必在每個類別都寫一次 `deposit()` 和 `withdraw()`。
2.  **階層關係**：建立清楚的物件分類。
3.  **封裝與權限**：
    - `private` 屬性：雖然子類別繼承了，但依然**不能直接存取**。必須透過父類別的 `public` 方法（如 `getBalance()`）。
    - `protected` 屬性（進階）：允許子類別直接存取的修飾詞。

---

## 🔄 執行與驗證

這堂課我們使用現有的檔案：

1.  [BankAccount.java](file:///c:/Users/gino.huang/Desktop/java/BankAccount.java) (父類別)
2.  [SavingsAccount.java](file:///c:/Users/gino.huang/Desktop/java/SavingsAccount.java) (子類別)
3.  [InheritanceDemo.java](file:///c:/Users/gino.huang/Desktop/java/InheritanceDemo.java) (測試程式)

### 編譯與執行：

```bash
# 同時編譯多個檔案
javac BankAccount.java SavingsAccount.java InheritanceDemo.java

# 執行測試
java InheritanceDemo
```

---

## 💡 觀察與練習

1.  **觀察 `addInterest()`**：
    - 它如何取得餘額？（使用繼承來的 `getBalance()`）
    - 它如何把利息存進去？（使用繼承來的 `deposit()`）
2.  **動手試試看**：
    - 試著在 `InheritanceDemo.java` 中呼叫 `mySavings.withdraw(1000)`。你會發現即使 `SavingsAccount` 沒寫 `withdraw`，它依然可以使用！
3.  **挑戰練習**：
    - 建立另一個子類別 `CheckingAccount` (支票帳戶)，繼承 `BankAccount`。
    - 增加一個屬性 `limit` (透支額度)。

---

## 🚀 下一課預告

**第十一課：多型 (Polymorphism)**

- 當同樣的方法名稱，在不同物件上產生不同行為。
- 介面 (Interface) 的概念。
