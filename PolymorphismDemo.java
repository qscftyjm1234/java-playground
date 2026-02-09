
// 第十一課：多型 (Polymorphism) 展示
import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // 1. 雖然型別是 Animal，但實體可以是 Dog 或 Cat
        // 這就是「多型」的展現
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("--- 個別測試 ---");
        myDog.makeSound();
        myCat.makeSound();

        // 2. 多型最強大的地方：統一管理
        System.out.println("\n--- 集合測試 (統一管理) ---");

        // 我們建立一個只能裝 Animal 的清單
        List<Animal> pets = new ArrayList<>();
        pets.add(new Dog());
        pets.add(new Cat());
        pets.add(new Dog()); // 再加一隻狗

        // 統一呼叫 makeSound()，Java 會自動根據「真實的實體」去執行正確的版本
        for (Animal pet : pets) {
            pet.makeSound();
        }
    }
}
