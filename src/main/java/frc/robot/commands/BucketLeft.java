package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Bucket;

public class BucketLeft extends CommandBase {

    Bucket mBucket;

    public BucketLeft(Bucket bucket) {
        mBucket = bucket;
        addRequirements(mBucket);
    }

    @Override
    public void execute() {
        mBucket.setBucketPos(-1024);
    }

    @Override
    public void end(boolean isFinished) {
        mBucket.setBucket(0);
    }

}
