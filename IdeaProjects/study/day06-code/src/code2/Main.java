package code2;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky();
        ChineseDog chineseDog = new ChineseDog();
        SharPei sharPei = new SharPei();

        husky.ect();
        husky.drink();
        husky.lookHome();
        husky.breakHome();
        System.out.println("===========================");
        chineseDog.ect();
        chineseDog.drink();
        chineseDog.lookHome();
        System.out.println("===========================");
        sharPei.ect();
        sharPei.drink();
        sharPei.lookHome();
    }
}
