package code1;

public class TestExtends02 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show();
    }
}

class Fu1 {
    String name = "父";
    String hobby = "喝茶";
}

class Zi1 extends Fu1 {
    String name = "子";
    String game = "原神";

    public void show() {
        // 如何打印子
        System.out.println(name);
        System.out.println(this.name);
        // 如何打印父
        System.out.println(super.name);
        // 如何打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        // 如何打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}