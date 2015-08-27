package org.wheeler.robotics.SensorTests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
/**
 * Created by lucien on 8/27/15.
 */
public class ReadGamepad extends OpMode {
    float leftStickX;
    float leftStickY;
    float rightStickX;
    float rightStickY;
    public void init() {}
    public void loop() {
        leftStickX=gamepad1.left_stick_x;
        leftStickY=gamepad1.left_stick_y;
        rightStickX=gamepad1.right_stick_x;
        rightStickY=gamepad1.right_stick_y;
        telemetry.addData("Left X: ", leftStickX);
        telemetry.addData("Right Y: ", leftStickY);
    }
}
