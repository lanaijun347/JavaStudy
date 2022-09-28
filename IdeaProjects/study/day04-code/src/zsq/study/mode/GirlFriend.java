package zsq.study.mode;

public class GirlFriend {
    private String name;
    private int age;
    private String character;

    // 快捷键 alt + ins 就能快速生成构造方法，设置值和获取值等函数
    // 或安装插件 PTG 点击右键 选择 Ptg to javabean 快速生成
    // 构造方式是 new （创建对象）时，虚拟机自动调用的
    // 建议在编写类时，建议空构造要写（当然可以省略），有参构造也建议写
    public GirlFriend() {
        System.out.println("这个一个空的构造方法");
    }

    public GirlFriend(String name, int age, String character) {
        System.out.println("这是一个构造函数的重载（带参构造）");
        this.name = name;
        this.age = age;
        this.character = character;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (18 <= age && age <= 30) {
            this.age = age;
        } else {
            System.out.println("年龄不在范围！");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setCharacter(String character) {
        System.out.println("可爱捏！");
        this.character = character;
    }

    public String getCharacter() {
        return this.character;
    }

    public void ect() {
        System.out.println("在干饭！");
    }

    public void action() {
        System.out.println("撒娇");
    }
}
