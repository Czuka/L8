package edu.lab8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CCuboid extends CSolid{
    protected int a;
    protected int b;

    public CCuboid(int mass, int a, int b) {
        //super(mass);
        this.a = a;
        this.b = b;
    }

    @Override
    double momentOfInertial() {
        return Mass*(a*a+b*b)/12;
    }

    @Override
    void getData(JTable tab) {
            Mass = Integer.parseInt(tab.getValueAt(0,1).toString());
            a = Integer.parseInt(tab.getValueAt(1,1).toString());
            a = Integer.parseInt(tab.getValueAt(2,1).toString());
    }

    @Override
    void showData(JTable tab, DefaultTableModel mod) {
        mod.setRowCount(3);
        tab.setValueAt("Masa", 0, 0);
        tab.setValueAt(Mass, 0,1);
        tab.setValueAt("Długość", 1, 0);
        tab.setValueAt(a, 1, 1);
        tab.setValueAt("Szerokość", 2, 0);
        tab.setValueAt(b, 2, 1);
    }
}
