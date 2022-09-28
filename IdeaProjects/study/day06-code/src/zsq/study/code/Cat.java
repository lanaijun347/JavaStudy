package zsq.study.code;

public class Cat extends Animal {
    private String name;
    private String varieties;

    public Cat() {
    }

    public Cat(String name, String varieties) {
        this.name = name;
        this.varieties = varieties;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVarieties() {
        return varieties;
    }

    @Override
    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public void action() {
        System.out.println("抓老鼠");
    }
}
