package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.acc();
//        car.stop();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.stop();
        car.stopMusic();
        car.upgradeEngine();
        car.start();

    }
}
