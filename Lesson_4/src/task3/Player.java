package task3;

public class Player implements Playable, Recodable {
    @Override
    public void play(){
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.pause();
        player.stop();
        player.record();
    }
}
