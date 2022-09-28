package zsq.study.code;

public class Dog extends Animal {
    private String name;
    public String varieties;

    public Dog() {
    }

    public Dog(String name, String varieties) {
        this.name = name;
        this.varieties = varieties;
    }

    @Override // 重新的注解，重写了父类的方法，主要是给虚拟机和程序员看的，建议重写都写上
    public String getName() {
        return name;
    }

    @Override // 重新的注解
    public void setName(String name) {
        this.name = name;
    }

    @Override // 重新的注解
    public String getVarieties() {
        return varieties;
    }

    @Override // 重新的注解
    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public void action() {
        System.out.println("看家");
    }
}
