package edu.lab8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CPipe extends CCylinder{
    protected int r;

    public CPipe(int mass, int R, int r) {
        super(mass, R);
        this.r = r;
    }

    @Override
    double momentOfInertial() {
        return Mass*(R*R+r*r)/2;
    }

    @Override
    void getData(JTable tab) {
        // TODO
        super.getData(tab);
    }

    @Override
    void showData(JTable tab, DefaultTableModel mod) {
        // TODO
        super.showData(tab, mod);
    }
}
