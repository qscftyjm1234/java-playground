# 🎓 第七課：方法 (Method)

在 JavaScript 中我們叫它 `function`，在 Java 中通常稱為 **方法 (Method)**。

---

## 🔍 Java Method vs JS Function

### JavaScript

```javascript
function add(a, b) {
  return a + b;
}
```

### Java

```java
public static int add(int a, int b) {
    return a + b;
}
```

### 關鍵差異

1.  **回傳型別**：Java 必須在方法名跟前說清楚你要回傳什麼（例如 `int`, `String`）。如果不回傳，就要寫 `void`。
2.  **參數型別**：每個參數都要貼標籤（例如 `int a`）。
3.  **static**：在我們目前的練習中，方法前面都要加上 `static`，這樣我們才能在 `main` 方法裡直接呼叫它。

---

## 🛠️ 方法的組成

```java
修飾詞 回傳型別 方法名稱(參數型別 參數名) {
    // 程式邏輯
    return 結果;
}
```

### 什麼是 `void`？

`void` 在英文代表「空虛」。在 Java 裡，如果一個方法只是去「做事」（例如印出東西）而不需要把結果「丟回來給變數」，型別就寫 `void`。

---

## 🌟 Java 特有：方法多載 (Method Overloading)

這是 Java 很強大的一個特性。你可以讓好幾個方法使用 **「同一個名字」**，只要他們的 **「參數長得不一樣」**。

```java
// 兩個數字相加
public static int sum(int a, int b) { return a + b; }

// 三個數字相加
public static int sum(int a, int b, int c) { return a + b + c; }
```

當你呼叫 `sum(1, 2)`，Java 會自動跑第一段。
當你呼叫 `sum(1, 2, 3)`，Java 會自動跑第二段。
**在 JavaScript 裡，後寫的 function 會蓋掉先寫的，但 Java 可以同時並存。**

---

## 🔄 執行練習

```bash
javac Methods.java
java Methods
```

嘗試修改 `Methods.java`：

1. 寫一個方法叫做 `isEven`，接收一個 `int`，回傳一個 `boolean`（判斷是否為偶數）。
2. 在 `main` 裡呼叫你的新方法並印出結果。
