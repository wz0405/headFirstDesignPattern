package chapter6;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remtote = new SimpleRemoteControl();
        Light light = new Light("test");
        LightOnCommand lightOn = new LightOnCommand(light);

        remtote.setCommand(lightOn);
        remtote.buttonWasPressed();
    }
}
