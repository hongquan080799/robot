package com.momo.robot;

import javax.inject.Inject;

public class FullRobot {
    private final FireArm fireArm;
    private final LaserArm laserArm;
    private final PaperLeg paperLeg;
    private final IronLeg ironLeg;

    @Inject
    public FullRobot(FireArm fireArm, LaserArm laserArm, PaperLeg paperLeg, IronLeg ironLeg){
        this.fireArm = fireArm;
        this.laserArm = laserArm;
        this.paperLeg = paperLeg;
        this.ironLeg = ironLeg;
    }

    public void doIt(){
        fireArm.punch();
        laserArm.punch();
        paperLeg.kick();
        ironLeg.kick();
    }

}
