package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Bucket;

public class BucketRight extends CommandBase {

    Bucket mBucket;

    public BucketRight(Bucket bucket) {
        mBucket = bucket;
        addRequirements(mBucket);
    }

    @Override
    public void execute() {
        mBucket.setBucketPos(1024 + 4096*2);
        System.out.println(mBucket.bucket0.getSelectedSensorPosition());
    }

    @Override
    public void end(boolean isFinished) {
        mBucket.setBucket(0);
    }

}