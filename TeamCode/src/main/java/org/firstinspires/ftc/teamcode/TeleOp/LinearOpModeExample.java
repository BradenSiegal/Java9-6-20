package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "TeleOp test", group = "Teleop")
//@Disabled
//the @Disabled line above will hide this program from the list
public class LinearOpModeExample extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException
    {
        //anything before waitForStart() runs when the INIT button is pressed,
        //while everything after won't run until the PLAY button is pressed
        waitForStart();

        while(opModeIsActive())
        {

            idle();
            //this line lets the program calm down to make sure it knows what
        }
    }
}
