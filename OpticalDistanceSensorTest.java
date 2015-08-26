package org.wheeler.robotics.SensorTests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
/**
 * Created by lucien on 8/26/15.
 */

public class OpticalDistanceSensorTest extends OpMode{
    OpticalDistanceSensor opticalDistanceSensor;
    double lightDetected;
    public void init(){
        opticalDistanceSensor = hardwareMap.opticalDistanceSensor.get("opticalDistanceSensor");
    }
    public void loop() {
        lightDetected = opticalDistanceSensor.getLightDetected();
        telemetry.addData("1 Distance", "Light Detected: " + String.valueOf(lightDetected));
    }
}
