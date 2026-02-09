# 🎓 第八課：類別與物件 (OOP 初探)

恭喜你進階到 Java 的核心！在 Java 中，「萬物皆物件」。

---

## 🏚️ 比喻：設計圖 vs 房子

如果你要蓋 10 間一模一樣的房子，你不會每次都重新畫圖，你會：

1.  畫一張 **設計圖 (Class / 類別)**。
2.  根據設計圖蓋出 **具體的房子 (Object / 物件 / 實體)**。

### 核心定義

- **類別 (Class)**：是一個範本、一個標準。它定義了「房子的顏色、幾層樓」。
- **物件 (Object)**：是根據範本蓋出來的「實體」。你可以蓋出紅色的房子、藍色的房子。

---

## 🔍 Java vs JavaScript (Class)

雖然寫法很像，但 Java 的規範比較嚴：

### JavaScript

```javascript
class Player {
  constructor(name) {
    this.name = name; // 屬性可以直接在這裡宣告
  }
}
```

### Java

```java
public class Player {
    String name; // 1. 屬性必須先在外面宣告清楚

    public Player(String name) { // 2. 建構子名字必須跟類別一樣
        this.name = name;
    }
}
```

---

## 🔑 關鍵字解析

### 1. `new`

這是魔法的開始。當你寫 `new Player("小明")` 時，Java 會在記憶體中清出一塊空間，把設計圖裡的屬性（name, level...）通通生出來，並執行建構子。

### 2. `this`

這代表 **「目前的這一個物件」**。
在 `this.name = name` 中：

- 左邊的 `this.name` 指的是 **「設計圖上的屬性」**。
- 右邊的 `name` 指的是 **「括號傳進來的那個參數」**。

---

## 🔄 執行與驗證

這一次你有兩個檔案，請先編譯類別，再編譯主程式：

```bash
javac Player.java
javac OOPDemo.java
java OOPDemo
```

### 💡 你會發現：

- 即使我們只寫了一份 `Player.java`，我們卻可以生出無數個玩家（p1, p2, p3...）。
- 每個玩家的等級、血量都是 **獨立的**。你把 p1 升級，p2 並不會變強。

這就是物件導向的魅力：**資料與功能被封裝在一起，互不干擾！**
