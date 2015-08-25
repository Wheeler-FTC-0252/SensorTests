package org.wheeler.robotics.SensorTests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by lucien on 8/25/15.
 */
public class TouchSensorTest extends OpMode{
    TouchSensor touchSensor;
    String TelemString;
    public void init(){
        touchSensor = hardwareMap.touchSensor.get("touchSensor");
    }
    public void loop(){
        if (touchSensor.isPressed()) {
            TelemString = "True";
        }
        else {
            TelemString = "False";
        }
        telemetry.addData("2 Touch", "Status: " + TelemString);
    }
}
