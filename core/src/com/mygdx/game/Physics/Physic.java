package com.mygdx.game.Physics;

import com.mygdx.game.Ball.Ball;
import com.mygdx.game.Course.Course;

public class Physic {

    public Course course;
    public Ball ball;
    public float stepSizeforSlope;
    public float[] Slope;


    public Physic(Course course, float stepSizeforSlope){
        this.course = course;
        this.stepSizeforSlope = stepSizeforSlope;
    }


    public float[] Slope(float[] coordination){

        Slope = new float[2];
        if(course.getZ(coordination[0]-stepSizeforSlope,coordination[1]) ==
         course.getZ(coordination[0] + stepSizeforSlope, coordination[1])){
            Slope[0] = course.getZ(coordination[0]-stepSizeforSlope,coordination[1])/stepSizeforSlope;
        }

        if(course.getZ(coordination[0],coordination[1]-stepSizeforSlope) ==
                course.getZ(coordination[0] , coordination[1]+ stepSizeforSlope)){
            Slope[0] = course.getZ(coordination[0],coordination[1]-stepSizeforSlope)/stepSizeforSlope;
        }

        return Slope;
    }

    public float[] CalculateAcceleration(float[] coordinates , float Vx, float Vy){

        float GravitationForceX = course.getGravity()*Slope(coordinates)[0];
        float GravitationForceY = course.getGravity()*Slope(coordinates)[1];


        float FrictionForceX = (course.GetMuKinetic()* course.getGravity()*Vx)/Math.sqrt(Vx*Vx + Vy*Vy);
        float FrictionForceY = (course.GetMuKinetic()* course.getGravity()*Vy)/Math.sqrt(Vx*Vx + Vy*Vy);

        float[] Acceleration = new float[2];

        Acceleration[0] = -(GravitationForceX + FrictionForceX);
        Acceleration[1] = -(GravitationForceY + FrictionForceY);

        return  Acceleration;
    }
}
