import java.math.BigDecimal;

public class Money {

    public static void main(String[] args) {
        String cost = "17.3";
        Double price = Double.parseDouble(cost);
        System.out.println(price);
        int youAge;  //0
        Integer myAge; //null

        double twiceThePrice = price * 2;

        BigDecimal zero = BigDecimal.ZERO;
        
        BigDecimal total = new BigDecimal("1");
        for (int i = 0; i < 10; i++) {
            total = total.add(new BigDecimal("0.1"));
            System.out.println(total);
        }

    }
}
