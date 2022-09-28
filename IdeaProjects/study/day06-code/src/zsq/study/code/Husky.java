package zsq.study.code;

public class Husky extends Dog {
    private String name;

    public Husky() {
    }

    public Husky(String name) {
        this.name = name;
    }

    @Override // 重新的注解，重写了父类的方法
    public String getName() {
        return name;
    }

    @Override // 重新的注解，重写了父类的方法
    public void setName(String name) {
        this.name = name;
    }

    public void characteristic() {
        System.out.println(this.name + "拆家");
    }
}
