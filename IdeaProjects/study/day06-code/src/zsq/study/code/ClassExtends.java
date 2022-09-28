package zsq.study.code;

public class ClassExtends {
    public static void main(String[] args) {
        // java继承关键字 extends
        // java只能单继承：一个类只能继承一个直接父类
        // java不支持多继承，但支持多层继承 即：子继承父 父继承另一个父类 子类就能用父类的父类
        // java中所有的类都直接或间接继承 Object 这个类
        // 子类只能访问父类的非私有成员

        // 构造方法不能被继承
        // 成员变量能够继承、但私有的成员变量不能不直接被调用
        // 私有成员方法不能被继承，但只有父类中的虚方法才能被子类继承（非private、非static、非final方法）

        /*
        * 设计一个继承类
        *
        * 布偶猫：吃饭、喝水、抓老鼠
        * 狸猫：吃饭、喝水、抓老鼠
        * 哈士奇：吃饭、喝水、看家、拆家
        * 泰迪：吃饭、喝水、看家、色色
        *
        * */

        Ragdoll rd = new Ragdoll();
        rd.ect();
        rd.action();

        Husky hs = new Husky("二哈");
        hs.drink();
        hs.characteristic();

        Husky hs1 = new Husky("傻狗");
        hs1.ect();
        hs1.characteristic();

    }
}
