# 🎓 第四課: 條件判斷 (if-else)

## 🎯 核心概念

讓程式可以**做決定**!根據不同條件執行不同的程式碼。

---

## 📝 基本語法

### if (如果)

```java
if (條件) {
    // 條件為 true 時執行
}
```

### if-else (如果-否則)

```java
if (條件) {
    // 條件為 true 時執行
} else {
    // 條件為 false 時執行
}
```

### if-else if-else (多重條件)

```java
if (條件1) {
    // 條件1 為 true
} else if (條件2) {
    // 條件2 為 true
} else {
    // 都不符合
}
```

---

## 🔍 比較運算子

| 運算子 | 說明     | 範例     | 結果    |
| ------ | -------- | -------- | ------- |
| `==`   | 等於     | `5 == 5` | `true`  |
| `!=`   | 不等於   | `5 != 3` | `true`  |
| `>`    | 大於     | `5 > 3`  | `true`  |
| `<`    | 小於     | `5 < 3`  | `false` |
| `>=`   | 大於等於 | `5 >= 5` | `true`  |
| `<=`   | 小於等於 | `3 <= 5` | `true`  |

---

## 🔗 邏輯運算子

| 運算子 | 說明     | 範例              | 說明            |
| ------ | -------- | ----------------- | --------------- |
| `&&`   | AND (且) | `true && true`    | 兩個都要 true   |
| `\|\|` | OR (或)  | `true \|\| false` | 至少一個 true   |
| `!`    | NOT (非) | `!true`           | 反轉 (變 false) |

---

## 💡 實用範例

### 成績判斷

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else if (score >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}
```

### 年齡判斷

```java
int age = 20;

if (age >= 18) {
    System.out.println("成年");
} else {
    System.out.println("未成年");
}
```

### 多重條件

```java
boolean hasTicket = true;
boolean hasID = true;

if (hasTicket && hasID) {
    System.out.println("可以入場");
} else {
    System.out.println("不能入場");
}
```

---

## ⚡ 三元運算子 (簡寫)

```java
// 完整寫法
String result;
if (num % 2 == 0) {
    result = "偶數";
} else {
    result = "奇數";
}

// 簡寫 (三元運算子)
String result = (num % 2 == 0) ? "偶數" : "奇數";
```

**格式:** `條件 ? 值1 : 值2`

---

## 🎯 執行結果

```bash
javac IfElse.java
java IfElse
```

```
=== 條件判斷 ===

你已成年
及格!
成績: C

--- 比較運算子 ---
a == b: false
a != b: true
a > b: false
a < b: true
a >= b: false
a <= b: true

--- 邏輯運算子 ---
可以入場
可以休息
不下雨,可以出門

--- 巢狀 if ---
可以刷卡購買

--- 三元運算子 ---
15 是 奇數

--- 實用範例 ---
分數 88 的等級: 良好
成年人
```

---

## 🚀 下一課預告

**第五課: 迴圈 (for, while)**

- 重複執行程式碼
- for 迴圈
- while 迴圈

準備好了嗎? 😊
