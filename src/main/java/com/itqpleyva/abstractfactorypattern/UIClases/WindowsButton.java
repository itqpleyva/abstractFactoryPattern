package com.itqpleyva.abstractfactorypattern.UIClases;

import com.itqpleyva.abstractfactorypattern.interfaces.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        
        System.out.println("I am a windows Button");

    }

}