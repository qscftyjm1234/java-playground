# 🎓 第十一課：多型與介面 (Polymorphism & Interface)

在學完繼承之後，你會發現類別之間有了「父子關係」。而 **多型 (Polymorphism)** 就是這種關係帶來的最強大魔法。

---

## 🎭 1. 什麼是多型？

「多型」字面上的意思就是「多種型態」。
在 Java 中，這代表：**同一個行為，在不同的物件身上會有不同的表現。**

### 想像一個場景：

你有一個 `Animal` (動物) 的清單，裡面有 `Dog` (狗) 和 `Cat` (貓)。
當你對清單裡的每個成員說「叫一聲」時：

- 狗會發出「汪汪」
- 貓會發出「喵喵」

雖然你發出的指令都是一樣的 (`makeSound()`)，但結果卻不同。

---

## 📜 2. 介面 (Interface)

**介面** 是多型的一種常見實現方式。它像是一份 **「合約」** 或 **「能力清單」**。
它不規定事情怎麼做，只規定「要做什麼」。

### 語法：

```java
// 定義介面
public interface Animal {
    void makeSound(); // 只有方法的樣子，沒有內容
}

// 實作介面
public class Dog implements Animal {
    public void makeSound() {
        System.out.println("狗：汪汪！");
    }
}
```

---

## 🛠️ 3. 向上轉型 (Upcasting)

多型的魔力源自於「向上轉型」。
你可以用 **「介面」** 當作型別，來指稱 **「實作了該介面的物件」**。

```java
Animal myPet = new Dog(); // 把狗看作是「一種動物」
myPet.makeSound();       // 雖然型別是 Animal，但跑的是 Dog 的版本
```

這讓你可以在不需要知道具體是什麼動物的情況下，統一管理所有的動物。

---

## 🔄 執行與驗證

這堂課我們新增了以下檔案：

1.  [Animal.java](file:///c:/Users/gino.huang/Desktop/java/Animal.java) (介面)
2.  [Dog.java](file:///c:/Users/gino.huang/Desktop/java/Dog.java) (實作類別)
3.  [Cat.java](file:///c:/Users/gino.huang/Desktop/java/Cat.java) (實作類別)
4.  [PolymorphismDemo.java](file:///c:/Users/gino.huang/Desktop/java/PolymorphismDemo.java) (展示多型的測試程式)

### 編譯與執行：

```bash
javac Animal.java Dog.java Cat.java PolymorphismDemo.java
java PolymorphismDemo
```

---

## 💡 為什麼要學這個？

1.  **彈性極高**：如果你之後想加入 `Bird` (鳥)，你只需要建立一個 `Bird implements Animal`，原本處理 `Animal` 清單的程式碼完全不需要改動！
2.  **解耦合 (Decoupling)**：你的主程式只需要依賴「介面」，而不需要知道「背後的具體實作」是什麼。

---

## 🚀 結語

恭喜你！到這裡你已經掌握了 Java 物件導向的三大核心：**封裝、繼承、多型**。
這三者是所有現代軟體架構的基石。😊
