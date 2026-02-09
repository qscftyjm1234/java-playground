# 🎓 第九課：封裝與存取控制 (Encapsulation)

為什麼要學這個？因為在真實開發中，你絕對不能相信別人（甚至未來的你自己）會乖乖輸入正確的資料。

---

## 🔒 1. 什麼是封裝？

封裝就像是在你的變數外面蓋一層 **「防護罩」**。
在 JS 裡，所有東西預設都是公開的。但在 Java 裡，我們習慣：

1.  **資料私有化** (`private`)：把變數鎖起來，不讓人直接動。
2.  **方法公開化** (`public`)：留下經過設計的「窗口」（Getter/Setter）讓人操作。

---

## 🛡️ 2. 存取修飾詞 (Access Modifiers)

| 修飾詞        | 權限範圍               | 比喻          |
| :------------ | :--------------------- | :------------ |
| **`public`**  | 任何人都可以看、可以改 | 公園 🌳       |
| **`private`** | 只有「類別內部」可以動 | 私人保險箱 🔐 |

---

## 🏗️ 3. Getter 與 Setter

這是 Java 的標準寫法：

### Getter (取得值)

```java
public double getBalance() {
    return balance;
}
```

### Setter (設定值 - 附帶檢查功能)

```java
public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    } else {
        System.out.println("年齡不能為負！");
    }
}
```

---

## 🌟 為什麼一定要這樣做？

1.  **資料保護**：不會突然有人寫 `account.balance = -999999;` 讓你的銀行破產。
2.  **驗證機制**：你可以在 `Setter` 裡檢查輸入是否合理。
3.  **隱藏細節**：使用者只需要知道 `withdraw()` 怎麼用，不需要知道存款是怎麼計算的。

---

## 🔄 執行練習

```bash
javac BankAccount.java EncapsulationDemo.java
java EncapsulationDemo
```

### 💡 練習任務

1.  打開 `EncapsulationDemo.java`。
2.  取消這一行的註解：`// System.out.println(myAccount.balance);`。
3.  儲存並編譯，看看 Java 會噴出什麼錯誤訊息！

這就是 **「編譯器保護」**。在程式跑起來之前，Java 就會先幫你擋掉非法的存取！
