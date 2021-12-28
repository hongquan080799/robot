package com.momo;

import com.momo.robot.DaggerRobotComponent;
import com.momo.robot.FullRobot;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FullRobot fullRobot = DaggerRobotComponent.create().buildRobot();
        fullRobot.doIt();
    }
}
