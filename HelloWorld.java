// 這是一個「類別」的宣告
// public = 公開的,任何人都可以使用
// class = 類別關鍵字
// HelloWorld = 類別名稱 (必須和檔案名稱 HelloWorld.java 一樣!)
public class HelloWorld {

    // 這是「主方法」,程式的起點
    // public = 公開的
    // static = 靜態的 (不需要建立物件就能執行)
    // void = 沒有回傳值
    // main = 方法名稱 (固定的,Java 會找這個方法來執行)
    // String[] args = 參數,可以接收命令列輸入的文字
    public static void main(String[] args) {

        // System.out.println = 在螢幕上印出一行文字
        // System = Java 的系統類別
        // out = 輸出物件
        // println = print line 的縮寫,印一行後會自動換行
        // 雙引號裡面的文字會被顯示出來
        System.out.println("你好,世界!");

        // 再印出另一行文字
        System.out.println("我的第一個 Java 程式!");

    } // main 方法結束

} // HelloWorld 類別結束