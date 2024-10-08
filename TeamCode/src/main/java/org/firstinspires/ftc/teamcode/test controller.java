
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Testcontroller")
public class Testcontroler extends LinearOpMode {
  private DcMotor leftmotor;
  private DcMotor rightmotor;
  private DcMotor upmotor;
  private DcMotor downmotor;
  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).
   */
   
  @Override
  public void runOpMode() {
    upmotor = hardwareMap.get(DcMotor.class, "upmotor");
    leftmotor = hardwareMap.get(DcMotor.class, "leftmotor");
    rightmotor = hardwareMap.get(DcMotor.class, "rightmotor");
    downmotor = hardwareMap.get(DcMotor.class, "downmotor");
    double power=0;
    double counter = 0;
    waitForStart();
      while (opModeIsActive()) {
        counter++;
        power = gamepad1.left_stick_y;
        upmotor.setPower(gamepad1.left_stick_y);
        downmotor.setPower(gamepad1.left_stick_y);
        leftmotor.setPower(gamepad1.left_stick_y);
        rightmotor.setPower(gamepad1.left_stick_y);
        telemetry.addData("Target Power", power);
        telemetry.addData("Motor Power", upmotor.getPower());
        telemetry.addData("Status", "Running");
        telemetry.addData("Count", counter);
        telemetry.update();
      } 
    
    }
    
