package org.example;

import com.phidget22.ChannelClass;
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.PhidgetException;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws PhidgetException {


        DigitalInput di = new DigitalInput();
        DigitalOutput out = new DigitalOutput();
        di.setChannel(1);
        di.open(500);
        out.setChannel(1);
        out.open(500);
        boolean state = di.getState();
        System.out.println("Etat d'éntrée : " + state);
        System.out.println("Nom : " + di.getDeviceName());
        System.out.println("Type : " + di.getDeviceSerialNumber());
        System.out.println("Nombre d'éntrées' logiques : " + di.getDeviceChannelCount(ChannelClass.DIGITAL_INPUT));
        System.out.println("Nombre de sorties logiques : " + di.getDeviceChannelCount(ChannelClass.DIGITAL_OUTPUT));
        System.out.println("Nombre d'entrées numériques : " + di.getDeviceChannelCount(ChannelClass.VOLTAGE_INPUT));
        di.close();
        out.close();
    }
}