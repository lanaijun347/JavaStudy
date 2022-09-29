package zsq.study.oopInnerClass;

public class Main {
    public static void main(String[] args) {

        // 什么时候使用内部类？
        //      B类表示的事物是A类的一部分，且B单独存在没有实际意义。
        // 内部类的访问特点：
        //      内部类可以直接访问外部类的成员，包括私有
        //      外部类要访问内部类的成员，必须创建对象
        // javabean 的 engine 就是一个内部类
        Car car = new Car("五菱", 3, "银色");
        Car.Engine ce= new Car("丰田", 5, "黑色").new Engine("发动机", 3);

        car.show();
        ce.show();
    }
}
