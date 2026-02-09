/**
 * 支付方式介面 (大標籤/合約)
 * 所有要在系統中使用的支付方式，都必須遵守這個合約。
 */
public interface PaymentMethod {
    /**
     * 執行支付動作
     * 
     * @param amount 支付金額
     */
    void pay(double amount);
}
