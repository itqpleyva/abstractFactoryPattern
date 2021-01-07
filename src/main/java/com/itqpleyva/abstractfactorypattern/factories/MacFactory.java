package com.itqpleyva.abstractfactorypattern.factories;

import com.itqpleyva.abstractfactorypattern.UIClases.MacButton;
import com.itqpleyva.abstractfactorypattern.UIClases.MacCheckbox;
import com.itqpleyva.abstractfactorypattern.interfaces.Button;
import com.itqpleyva.abstractfactorypattern.interfaces.Checkbox;

public class MacFactory implements GuiFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        // TODO Auto-generated method stub
        return new MacCheckbox();
    }

}