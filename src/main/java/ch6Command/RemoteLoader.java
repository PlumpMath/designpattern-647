package ch6Command;

/**
 * Created by zhang.zj on 2016/12/2.
 */
public class RemoteLoader {

    public static void main(String[] args) {
//        RemoteControlWithUndo remote = new RemoteControlWithUndo();
//        Light livingRoomLight = new Light("Living Room Light");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//
//        remote.setOnCommand(0, livingRoomLightOn, livingRoomLightOff);
//
//        remote.onButtonWasPushed(0);
//        remote.offButtonWasPushed(0);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();
//        remote.offButtonWasPushed(0);
//        remote.onButtonWasPushed(0);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setOnCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setOnCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();


    }
}
