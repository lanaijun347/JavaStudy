package zsq.study.code;

public class Teddy extends Dog {
    private String name;

    public Teddy() {
    }

    public Teddy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void characteristic() {
        System.out.println("色色");
    }
}
