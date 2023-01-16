import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Material[] array = new Material[10];
        array[0] = new CrispyFlour("Nh3","bot chien gion",14,LocalDate.of(2022,1,6),300);
        array[1] = new CrispyFlour("B12","bot lan",14,LocalDate.of(2022,10,3),600);
        array[2] = new CrispyFlour("C4","bot ngo",14,LocalDate.of(2022,1,16),700);
        array[3] = new CrispyFlour("C11","bot my",14,LocalDate.of(2022,7,1),400);
        array[4] = new CrispyFlour("H2","bot lentyfi",14,LocalDate.of(2022,12,12),200);
        array[5] = new Meat("K1","bo cube",1500000,LocalDate.of(2023,1,16),1.0);
        array[6] = new Meat("K1","suon heo",130000,LocalDate.of(2023,1,16),1.0);
        array[7] = new Meat("K1","bo tay",250000,LocalDate.of(2023,1,16),1.0);
        array[8] = new Meat("K1","bo my",400000,LocalDate.of(2023,1,16),1.0);
        array[9] = new Meat("K1","bo",200000,LocalDate.of(2023,1,16),1.0);
        System.out.println(array[0].getExpiryDate());
        System.out.println(getRealMoney(array));
    }
    public static double getRealMoney(Material[] materials){
        LocalDate now = LocalDate.now();
        for (Material material : materials){
            if (material instanceof CrispyFlour){
                LocalDate expirationDate = material.getExpiryDate();
                Period different = Period.between(now,expirationDate);
                System.out.println("so chenh lech thang" + different.getMonths());
            }
        }

    }

}
