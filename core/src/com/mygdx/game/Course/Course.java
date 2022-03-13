package com.mygdx.game.Course;


public class Course {

    private float Gravity;
    private float Vmax;
    private float MUstatic;  // coefficient of friction
    private float MUkinetic;  // coefficient of friction
    private float[] startPoint;
    private float[] Goal;
    private float z;

    public Course(){

    }



    public float getZ(float x, float y){
        return CalculateHeight(x,y);
    }

    public float  CalculateHeight(float x, float y){
        return 0;
    }

    public float getGravity(){
        return Gravity;
    }

    public float GetMuKinetic(){
        return MUkinetic;
    }

}
