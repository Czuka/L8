package edu.lab8;

public class CCylinder extends CCone{
    public CCylinder(int mass, int R) {
        super(mass, R);
    }

    @Override
    double momentOfInertial() {
        return Mass*R*R/2;
    }
}
