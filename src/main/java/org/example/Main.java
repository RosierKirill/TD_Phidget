package org.example;

import com.phidget22.ChannelClass;
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.PhidgetException;

public class Main {
    public static void main(String[] args) throws PhidgetException {


        DigitalInput di = new DigitalInput();
        di.setChannel(0);
        di.open(500);
        boolean state = di.getState();
        System.out.println("Nom : " + di.getDeviceName());
        System.out.println("Type : " + di.getDeviceSerialNumber());
        System.out.println("Nombre d'éntrées' logiques" + di.getDeviceChannelCount(ChannelClass.DIGITAL_INPUT));
        System.out.println("Nombre de sorties logiques" + di.getDeviceChannelCount(ChannelClass.DIGITAL_OUTPUT));
        System.out.println("");
        di.close();
    }
}