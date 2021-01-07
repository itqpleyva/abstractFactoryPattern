package com.itqpleyva.abstractfactorypattern.factories;

import com.itqpleyva.abstractfactorypattern.UIClases.WindowsButton;
import com.itqpleyva.abstractfactorypattern.UIClases.WindowsCheckbox;
import com.itqpleyva.abstractfactorypattern.interfaces.Button;
import com.itqpleyva.abstractfactorypattern.interfaces.Checkbox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {

        return new WindowsCheckbox();
    }

}