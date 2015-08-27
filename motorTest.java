package org.wheeler.robotics.SensorTests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by lucien on 8/26/15.
 */
public class MotorTest extends OpMode {
    DcMotor testMotor;
    public void init() {
        testMotor = hardwareMap.dcMotor.get("testMotor");
    }
    public void start() {
        testMotor.setPower(0.1);
    }
    public void loop() {
        telemetry.addData("1 Motor Speed: ", String.valueOf(testMotor.getPower()));
    }
}
