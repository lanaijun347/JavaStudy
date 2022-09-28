package zsq.study.code;

public class Animal {
    private String varieties;
    private String name;

    public Animal() {
    }

    public Animal(String varieties, String name) {
        this.varieties = varieties;
        this.name = name;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ect() {
        System.out.println(this.name + "吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

}
