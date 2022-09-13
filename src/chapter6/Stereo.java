package chapter6;

public class Stereo {
    String where;

    public Stereo(String living) {
        this.where = living;
    }

    public void on() {
        System.out.println("라디오가 켜졌습니다.");
    }

    ;

    public void off() {
        System.out.println("꺼졌습니다.");
    }

    public void setCD(){
        System.out.println("cd를 세팅합니다.");

    }
    public void setVolume(int i){
        System.out.println(i+"volume");
    }
}
