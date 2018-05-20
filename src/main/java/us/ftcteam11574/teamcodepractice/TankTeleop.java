package us.ftcteam11574.teamcodepractice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class TankTeleop extends OpMode {
    private DcMotor leftTank;
    private DcMotor rightTank;

    @Override
    public void init() {
        leftTank = hardwareMap.dcMotor.get("leftTank");
        rightTank = hardwareMap.dcMotor.get("rightTank");
        leftTank.setDirection(DcMotorSimple.Direction.FORWARD);
        rightTank.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftTank.setPower(-gamepad1.left_stick_y);
        rightTank.setPower(-
                gamepad1.right_stick_y);

    }
}
