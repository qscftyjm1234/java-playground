/**
 * 信用卡支付 (具體的計畫書)
 */
public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用 [信用卡] 支付成功！");
        System.out.println("- 卡號：" + cardNumber);
        System.out.println("- 金額：$" + amount);
        System.out.println("-------------------------");
    }
}
