package zsq.study.oopInnerClass;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public void show(){
        System.out.println(carName + " " + carAge + " " + carColor);
        Engine engine = new Engine("三菱", 1);
        System.out.println(engine.engineName + " " + engine.engineAge);

        engine.show();
    }

    class Engine{
        private  String engineName;
        private int engineAge;

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
