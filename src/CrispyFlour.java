import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double  quantity;


    public CrispyFlour(String id, String name, int cost, LocalDate manufacturingDate, double quantity) {
        super(id, name, cost, manufacturingDate);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmuont() {
        return quantity*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
