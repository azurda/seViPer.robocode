package RoboRumble;
import robocode.*;
import robocode.util.Utils;
import java.awt.Color;
import java.awt.geom.*;

public class Viper extends AdvancedRobot
{
    private static final double BULLET_POWER = 1.9;
    private static double lateralDirection;
    private static double lastEnemyVelocity;
    private static VPMovement movement;
    
    public Viper() {
    movement = new VPMovement(this);
    }
    
    public void run()
    {
        setColors(Color.PINK, Color.PINK, Color.PINK);
        lateralDirection = 1;
        lastEnemyVelocity = 0;
        //  letting radar move independently
        setAdjustRadarForGunTurn(true);
        // allowing Gun moving independetly
        setAdjustGunForRobotTurn(true);
        do {
            turnRadarRightRadians(Double.POSITIVE_INFINITY);
        } while (true);
    }
