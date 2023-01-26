package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Constants {
    XboxController controller = new XboxController(0);
    VictorSPX frontLeft = new VictorSPX(1);
    VictorSPX frontRight = new VictorSPX(3);
    VictorSPX backRight = new VictorSPX(0);
    VictorSPX backLeft = new VictorSPX(2);

    
}
