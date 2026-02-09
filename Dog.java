// 第十一課：實作介面 (Implementing Interface)
public class Dog implements Animal {
    // 必須實作 Animal 介面中定義的所有方法
    @Override
    public void makeSound() {
        System.out.println("狗發出聲音：汪汪！🐶");
    }
}
