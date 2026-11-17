package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class LearnBrogan extends OpMode {

    @Override
    public void init() {
    telemetry.addData("Hello","World");
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_button) {
            telemetry.addData("Left Stick", "Was pressed.");
        }
    }
}
