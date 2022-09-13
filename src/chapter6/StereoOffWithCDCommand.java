package chapter6;

public class StereoOffWithCDCommand implements Command{

    Stereo stereo;
    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();

    }
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
