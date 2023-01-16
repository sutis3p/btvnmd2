import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private final double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, int cost, LocalDate manufacturingDate, double weight) {
        super(id, name, cost, manufacturingDate);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getAmuont() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
