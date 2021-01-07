package com.itqpleyva.abstractfactorypattern.UIClases;

import com.itqpleyva.abstractfactorypattern.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        
        System.out.println("I am a Windows Checkbox");

    }

}