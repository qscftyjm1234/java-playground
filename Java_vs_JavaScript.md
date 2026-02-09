# ☕ Java vs 🟨 JavaScript - 關鍵差異

## 🎯 給有 JS 基礎的人

你已經會 JavaScript,這些概念在 Java 中**幾乎一樣**:

- ✅ if-else, for, while 迴圈
- ✅ 比較運算子 (`==`, `!=`, `>`, `<`)
- ✅ 邏輯運算子 (`&&`, `||`, `!`)
- ✅ 函數/方法的概念

---

## ⚠️ 重要差異 (一定要注意!)

### 1️⃣ 型別宣告 (最大差異!)

**JavaScript (動態型別):**

```javascript
let name = "John"; // 不用宣告型別
let age = 25; // JS 自己判斷
name = 123; // ✅ 可以改型別
```

**Java (靜態型別):**

```java
String name = "John";   // 必須宣告型別
int age = 25;           // 必須指定 int
// name = 123;          // ❌ 錯誤!不能改型別
```

---

### 2️⃣ 變數宣告

**JavaScript:**

```javascript
let x = 10; // 可變
const y = 20; // 常數
var z = 30; // 舊寫法
```

**Java:**

```java
int x = 10;           // 可變
final int y = 20;     // 常數
// 沒有 let, const, var
```

---

### 3️⃣ 字串比較 (超重要!)

**JavaScript:**

```javascript
"hello" == "hello"; // ✅ true
"hello" === "hello"; // ✅ true
```

**Java:**

```java
"hello" == "hello"         // ⚠️ 比較記憶體位置,不可靠!
"hello".equals("hello")    // ✅ true (正確做法)
```

**記住:** Java 字串比較用 `.equals()`,不用 `==`!

---

### 4️⃣ 陣列

**JavaScript:**

```javascript
let arr = [1, 2, 3];
arr.push(4); // 可以動態增加
arr = [1, "hello"]; // 可以混合型別
```

**Java:**

```java
int[] arr = {1, 2, 3};
// arr.push(4);       // ❌ 沒有 push,長度固定
// int[] arr = {1, "hello"};  // ❌ 不能混合型別
```

---

### 5️⃣ 函數 vs 方法

**JavaScript:**

```javascript
function greet(name) {
  return "Hello " + name;
}
```

**Java:**

```java
public static String greet(String name) {
    return "Hello " + name;
}
// 必須指定回傳型別和參數型別
```

---

### 6️⃣ 類別和物件

**JavaScript (ES6):**

```javascript
class Person {
  constructor(name) {
    this.name = name;
  }
}
```

**Java:**

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
// 必須宣告變數型別
```

---

### 7️⃣ null vs undefined

**JavaScript:**

```javascript
let x; // undefined
let y = null; // null
```

**Java:**

```java
int x;              // 編譯錯誤!必須初始化
Integer y = null;   // ✅ 物件可以是 null
// Java 沒有 undefined
```

---

### 8️⃣ 相等比較

**JavaScript:**

```javascript
5 == "5"; // true (會轉型)
5 === "5"; // false (嚴格比較)
```

**Java:**

```java
5 == 5       // true
// 5 == "5"  // 編譯錯誤!型別不同
// Java 沒有 ===
```

---

## 📋 快速對照表

| 功能         | JavaScript      | Java                       |
| ------------ | --------------- | -------------------------- |
| **變數宣告** | `let`, `const`  | 型別名稱 (`int`, `String`) |
| **常數**     | `const`         | `final`                    |
| **字串比較** | `==` 或 `===`   | `.equals()`                |
| **陣列**     | 動態,可混合型別 | 固定長度,單一型別          |
| **型別**     | 動態            | 靜態                       |
| **編譯**     | 不需要          | 需要 `javac`               |
| **執行**     | `node file.js`  | `java ClassName`           |

---

## 🎯 重點提醒

### ✅ 和 JS 一樣的

- if-else, switch
- for, while 迴圈
- 運算子 (+, -, \*, /, %)
- 邏輯運算 (&&, ||, !)

### ⚠️ 和 JS 不一樣的

1. **必須宣告型別** - `int age = 25`
2. **字串比較用 `.equals()`** - 不用 `==`
3. **沒有 `let`, `const`** - 用型別名稱
4. **需要編譯** - `javac` → `java`
5. **所有程式碼都要在類別裡** - 不能直接寫在外面

---

## 💡 給 JS 開發者的建議

1. **習慣宣告型別** - 一開始會不習慣,但很快就適應
2. **記得編譯** - 改了程式碼要重新 `javac`
3. **字串比較用 `.equals()`** - 這是最常犯的錯誤
4. **型別不能亂改** - `int` 就是 `int`,不能變成 `String`

---

**你有 JS 基礎,學 Java 會很快!** 主要就是適應**靜態型別**和**編譯**的概念! 💪
