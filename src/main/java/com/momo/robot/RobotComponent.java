package com.momo.robot;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {LeftFireArmRightLaserArmModule.class, LeftPaperLegRightIronLegModule.class })
@Singleton
public interface RobotComponent {
    FullRobot buildRobot();
}
