/**
 * 支付系統展示 (多型的威力)
 */
public class PaymentSystemDemo {

    /**
     * 結帳主程式 (這是最關鍵的地方！)
     * 注意：這個方法只接收「PaymentMethod」這個標籤。
     * 它「不關心」到底是信用卡還是 LINE Pay，反正只要能 .pay() 就好。
     */
    public static void checkout(PaymentMethod method, double totalAmount) {
        System.out.println("正在處理訂單結帳...");

        // 透過多型，這裡會自動執行正確的支付邏輯
        method.pay(totalAmount);
    }

    public static void main(String[] args) {
        double bill = 1500.0;

        // 場景 1：使用者選擇信用卡
        PaymentMethod card = new CreditCardPayment("1234-5678-9012-3456");
        checkout(card, bill);

        // 場景 2：使用者選擇 LINE Pay
        PaymentMethod linePay = new LinePayPayment("0912-345-678");
        checkout(linePay, bill);

        // 💡 思考點：
        // 如果未來要增加「Google Pay」，
        // 我們只需要寫一個新的類別實現 PaymentMethod，
        // 而這個 checkout() 方法完全不需要改動！
    }
}
