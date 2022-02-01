package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Bucket extends SubsystemBase {

    public WPI_TalonFX bucket0;

    public Bucket() {
        bucket0 = new WPI_TalonFX(2);


        bucket0.configNeutralDeadband(0.0001);
        bucket0.configSelectedFeedbackSensor(FeedbackDevice.valueOf(1));

        bucket0.setSelectedSensorPosition(0);

        bucket0.config_kF(0, 0.0);
        bucket0.config_kP(0, 0.4);
        bucket0.config_kI(0, 0.0);
        bucket0.config_kD(0, 0.7);

    }

    public void setBucketPos(double pos) {
        bucket0.set(TalonFXControlMode.Position, pos);
    }

    public void setBucket(double pct) {
        bucket0.set(pct);
    }

}
