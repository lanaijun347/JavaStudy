package zsq.study.mode;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 调用空构建，创建一个女朋友对象
        GirlFriend p1 = new GirlFriend();
        p1.setName("女1");
        p1.setAge(20);
        p1.setCharacter("萌");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getCharacter());
        p1.action();

        System.out.println("================================");

        // 调用重载构建函数，创建一个女朋友
        GirlFriend p2 = new GirlFriend("女2", 18, "可爱");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getCharacter());
        p2.ect();

        System.out.println("================================");

        // 建一个空女朋友
        GirlFriend p3 = new GirlFriend();
        System.out.println(p3.getName());
        System.out.println(p3.getAge());
        System.out.println(p3.getCharacter());
        p3.ect();

    }
}
