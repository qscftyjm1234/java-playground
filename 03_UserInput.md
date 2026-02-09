# 🎓 第三課: 使用者輸入

## 🎯 學習目標

讓程式可以**互動**!接收使用者輸入的資料。

---

## 📝 程式碼

[UserInput.java](file:///c:/Users/gino.huang/Desktop/java/UserInput.java)

---

## 🔑 核心概念: Scanner

### 什麼是 Scanner?

**Scanner** = 掃描器,用來讀取使用者從鍵盤輸入的資料

```java
import java.util.Scanner;  // 1. 先匯入

Scanner scanner = new Scanner(System.in);  // 2. 創建物件
String input = scanner.nextLine();  // 3. 讀取輸入
scanner.close();  // 4. 用完關閉
```

---

## 📚 Scanner 的方法

### 讀取不同類型的資料

| 方法            | 用途           | 範例             |
| --------------- | -------------- | ---------------- |
| `nextLine()`    | 讀取一整行字串 | `"Hello World"`  |
| `next()`        | 讀取一個單字   | `"Hello"`        |
| `nextInt()`     | 讀取整數       | `25`             |
| `nextDouble()`  | 讀取小數       | `99.99`          |
| `nextBoolean()` | 讀取布林值     | `true` / `false` |

---

## 💡 基本使用

### 1️⃣ 匯入 Scanner

```java
import java.util.Scanner;  // 在檔案最上面
```

### 2️⃣ 創建 Scanner 物件

```java
Scanner scanner = new Scanner(System.in);
```

### 3️⃣ 讀取輸入

```java
System.out.print("請輸入你的名字: ");
String name = scanner.nextLine();
System.out.println("你好, " + name);
```

### 4️⃣ 關閉 Scanner

```java
scanner.close();  // 用完要關閉
```

---

## ⚠️ 重要提醒

### 緩衝區問題

當你讀取數字後再讀取字串,需要清除緩衝區:

```java
int age = scanner.nextInt();  // 讀取數字
scanner.nextLine();  // ⭐ 清除緩衝區!

String name = scanner.nextLine();  // 現在可以正常讀取字串
```

**為什麼?**

- `nextInt()` 只讀數字,不讀換行符號
- 換行符號會留在緩衝區
- 下一個 `nextLine()` 會讀到空字串

---

## 🎯 實際範例

### 簡單問候程式

```java
Scanner scanner = new Scanner(System.in);

System.out.print("你叫什麼名字? ");
String name = scanner.nextLine();

System.out.print("你幾歲? ");
int age = scanner.nextInt();

System.out.println("你好, " + name + "!");
System.out.println("你今年 " + age + " 歲");

scanner.close();
```

---

## 🔄 如何執行

### 編譯

```bash
javac UserInput.java
```

### 執行

```bash
java UserInput
```

### 互動過程

```
=== 歡迎來到互動式程式! ===

請輸入你的名字: 小明
你好, 小明!

請輸入你的年齡: 25
你今年 25 歲

請輸入你的身高 (公分): 175.5
你的身高是 175.5 公分

請輸入你最喜歡的顏色: 藍
你喜歡 藍 色

--- 簡單計算機 ---
請輸入第一個數字: 10
請輸入第二個數字: 3

結果:
10 + 3 = 13
10 - 3 = 7
10 × 3 = 30

感謝使用!
```

---

## 📊 Scanner 方法對照表

| 方法            | 讀取類型 | 會讀換行符號嗎? |
| --------------- | -------- | --------------- |
| `nextLine()`    | 整行字串 | ✅ 會           |
| `next()`        | 單字     | ❌ 不會         |
| `nextInt()`     | 整數     | ❌ 不會         |
| `nextDouble()`  | 小數     | ❌ 不會         |
| `nextBoolean()` | 布林值   | ❌ 不會         |

**記住:** 只有 `nextLine()` 會讀取換行符號!

---

## 🎯 練習建議

1. **修改問題** - 改成問其他問題
2. **加入更多輸入** - 問更多資訊
3. **做計算** - 用輸入的數字做運算
4. **建立小遊戲** - 例如猜數字遊戲

---

## 🚀 下一課預告

**第四課: 條件判斷 (if-else)**

- 根據條件做不同的事
- 比較運算子
- 邏輯運算子

準備好繼續了嗎? 😊
