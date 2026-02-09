/**
 * LINE Pay 支付 (具體的計畫書)
 */
public class LinePayPayment implements PaymentMethod {
    private String phoneNumber;

    public LinePayPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用 [LINE Pay] 支付成功！");
        System.out.println("- 綁定手機：" + phoneNumber);
        System.out.println("- 金額：$" + amount);
        System.out.println("-------------------------");
    }
}
