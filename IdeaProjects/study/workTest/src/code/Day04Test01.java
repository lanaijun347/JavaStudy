package code;

public class Day04Test01 {
    public static void main(String[] args) {
        double phonePrice = 7988;
        double sellPrice = 1500;
        if ((phonePrice- sellPrice) > phonePrice * 0.8)
        {
            System.out.println("以旧换新");
        }
        else {
            System.out.println("卖了换钱");
        }
    }
}
