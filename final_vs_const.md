# Java `final` vs JavaScript `const`

## ✅ 相似之處

### 都是用來宣告「常數」

**Java:**

```java
final double PI = 3.14159;
// PI = 3.14;  // ❌ 錯誤!不能改變
```

**JavaScript:**

```javascript
const PI = 3.14159;
// PI = 3.14;  // ❌ 錯誤!不能改變
```

---

## 🎯 核心概念相同

| 特性           | Java `final`      | JavaScript `const`   |
| -------------- | ----------------- | -------------------- |
| **用途**       | 宣告常數          | 宣告常數             |
| **能改變嗎**   | ❌ 不能           | ❌ 不能              |
| **必須初始化** | ✅ 是             | ✅ 是                |
| **命名慣例**   | 全大寫 `TAX_RATE` | 通常駝峰式 `taxRate` |

---

## 📝 對照範例

### Java

```java
final int MAX_USERS = 100;
final String APP_NAME = "MyApp";
final double TAX_RATE = 0.05;

// MAX_USERS = 200;  // ❌ 錯誤!
```

### JavaScript

```javascript
const MAX_USERS = 100;
const APP_NAME = "MyApp";
const TAX_RATE = 0.05;

// MAX_USERS = 200;  // ❌ 錯誤!
```

---

## ⚠️ 細微差異

### 1. 物件/陣列的內容

**JavaScript `const`:**

```javascript
const arr = [1, 2, 3];
arr.push(4); // ✅ 可以!可以修改內容
arr = [5, 6, 7]; // ❌ 錯誤!不能重新賦值
```

**Java `final`:**

```java
final int[] arr = {1, 2, 3};
arr[0] = 10;        // ✅ 可以!可以修改內容
// arr = new int[]{5, 6, 7};  // ❌ 錯誤!不能重新賦值
```

**兩者都一樣:** 變數本身不能改,但內容可以改!

### 2. 命名慣例

**Java:**

```java
final double TAX_RATE = 0.05;  // 全大寫 + 底線
```

**JavaScript:**

```javascript
const taxRate = 0.05; // 通常用駝峰式
// 或
const TAX_RATE = 0.05; // 也可以全大寫
```

---

## 🔄 Java 的其他變數宣告方式

Java 沒有 `let` 和 `var` (ES6 的那種):

**Java:**

```java
int age = 25;              // 普通變數
final int MAX_AGE = 100;   // 常數
```

**JavaScript (ES6):**

```javascript
let age = 25; // 可變變數
const MAX_AGE = 100; // 常數
var oldWay = 10; // 舊寫法(不推薦)
```

---

## 💡 總結

**你的理解完全正確!**

```
Java final    ≈  JavaScript const
(常數,不能改)    (常數,不能改)
```

**相同點:**

- ✅ 都是宣告常數
- ✅ 都不能重新賦值
- ✅ 都必須初始化

**差異:**

- Java 慣例用全大寫 `TAX_RATE`
- JavaScript 通常用駝峰式 `taxRate`
- 但概念完全一樣!
