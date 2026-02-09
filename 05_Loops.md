# 🎓 第五課: 迴圈 (Loops)

## 🔄 三種迴圈

### 1. for 迴圈

```java
for (初始值; 條件; 遞增) {
    // 重複執行
}
```

### 2. while 迴圈

```java
while (條件) {
    // 條件為 true 時執行
}
```

### 3. do-while 迴圈

```java
do {
    // 至少執行一次
} while (條件);
```

---

## 💡 for 迴圈

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// 輸出: 1 2 3 4 5
```

**和 JS 一樣!**

---

## 🔁 while 迴圈

```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    count++;
}
```

---

## 🎯 for-each 迴圈 (重要!)

**Java:**

```java
String[] fruits = {"蘋果", "香蕉", "橘子"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

**JS 對照:**

```javascript
for (let fruit of fruits) {
  // JS 用 of
  console.log(fruit);
}
```

---

## ⚡ break 和 continue

```java
// break - 跳出迴圈
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;  // 遇到 5 就停止
    System.out.println(i);
}

// continue - 跳過本次
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;  // 跳過 3
    System.out.println(i);
}
```

**和 JS 完全一樣!**

---

## 📊 執行結果

```
=== 迴圈 ===

--- for 迴圈 ---
第 1 次
第 2 次
第 3 次
第 4 次
第 5 次

--- 實用範例 ---
1 到 10 的總和: 55
最高分: 95

倒數計時:
5...
4...
3...
2...
1...
發射! 🚀
```

---

## 🎯 重點

- ✅ for, while, do-while 和 JS 幾乎一樣
- ✅ for-each 用 `:` 不是 `of`
- ✅ break, continue 完全相同

**有 JS 基礎的你應該秒懂!** 😊
