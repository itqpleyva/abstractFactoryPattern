package com.itqpleyva.abstractfactorypattern.Applications;

import com.itqpleyva.abstractfactorypattern.factories.GuiFactory;
import com.itqpleyva.abstractfactorypattern.interfaces.Button;
import com.itqpleyva.abstractfactorypattern.interfaces.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(GuiFactory factory){

        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){

        button.paint();
        checkbox.paint();
    }

}