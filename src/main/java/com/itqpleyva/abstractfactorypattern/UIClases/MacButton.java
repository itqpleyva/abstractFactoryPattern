package com.itqpleyva.abstractfactorypattern.UIClases;

import com.itqpleyva.abstractfactorypattern.interfaces.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        
        System.out.println("I am a Mac button");

    }

}