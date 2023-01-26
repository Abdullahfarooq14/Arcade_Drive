package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class ArcadeDrive {
    XboxController controller;
        
    WPI_VictorSPX frontLeft;
    WPI_VictorSPX backRight;
    WPI_VictorSPX backLeft;
    WPI_VictorSPX frontRight;
    double leftTrigger;
    double rightTrigger;
    double leftX;

    ArcadeDrive(WPI_VictorSPX frontLeft, WPI_VictorSPX backLeft, WPI_VictorSPX frontRight, WPI_VictorSPX backRight, XboxController controller) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
        this.controller = controller;
    }

    public void Arcade_Drive() {
        leftTrigger = controller.getLeftTriggerAxis();
        rightTrigger = controller.getRightTriggerAxis();
        leftX = controller.getLeftX();

        if (leftTrigger > 0) {
            frontLeft.set(ControlMode.PercentOutput, leftTrigger * -1);
            frontRight.set(ControlMode.PercentOutput, leftTrigger);
            backRight.set(ControlMode.PercentOutput, leftTrigger);
            backLeft.set(ControlMode.PercentOutput, leftTrigger * -1);
        }

        if (rightTrigger > 0) {
            frontLeft.set(ControlMode.PercentOutput, rightTrigger);
            frontRight.set(ControlMode.PercentOutput, rightTrigger * -1);
            backRight.set(ControlMode.PercentOutput, rightTrigger * -1);
            backLeft.set(ControlMode.PercentOutput, rightTrigger);
        }
    
        if (leftX > 0 && leftTrigger == 0 && rightTrigger == 0) {
            frontLeft.set(ControlMode.PercentOutput, leftX * -1);
            backLeft.set(ControlMode.PercentOutput, leftX * -1);
            frontRight.set(ControlMode.PercentOutput, leftX * -1);
            backRight.set(ControlMode.PercentOutput, leftX * -1);
        }

        if (leftX < 0 && leftTrigger == 0 && rightTrigger == 0) {
            frontLeft.set(ControlMode.PercentOutput, leftX * -1);
            backLeft.set(ControlMode.PercentOutput, leftX * -1);
            frontRight.set(ControlMode.PercentOutput, leftX * -1);
            backRight.set(ControlMode.PercentOutput, leftX * -1);
        }

    }
}