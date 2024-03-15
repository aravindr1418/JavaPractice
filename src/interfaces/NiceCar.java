package interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CDplayer();
    public  NiceCar(){
        engine = new Powerengine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
    public void upgradeEngine(){
        this.engine = new Electricengine();
    }
}
